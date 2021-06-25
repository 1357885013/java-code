package algorithm;

import java.util.*;

/* 两个(具有不同单词的)文档的交集(intersection)中元素的个数除以并集(union)中元素的个数，就是这两个文档的相似度。例如，{1, 5, 3}
 和 {1, 7, 2, 3} 的相似度是 0.4，其中，交集的元素有 2 个，并集的元素有 5 个。给定一系列的长篇文档，每个文档元素各不相同，并与一个 ID
 相关联。它们的相似度非常“稀疏”，也就是说任选 2 个文档，相似度都很接近 0。请设计一个算法返回每对文档的 ID 及其相似度。只需输出相似度大于 0 的组合
。请忽略空文档。为简单起见，可以假定每个文档由一个含有不同整数的数组表示。

 输入为一个二维数组 docs，docs[i] 表示 id 为 i 的文档。返回一个数组，其中每个元素是一个字符串，代表每对相似度大于 0 的文档，其格式为
 {id1},{id2}: {similarity}，其中 id1 为两个文档中较小的 id，similarity 为相似度，精确到小数点后 4 位。以任意顺序
返回数组均可。

 示例:

 输入:
[
? [14, 15, 100, 9, 3],
? [32, 1, 9, 3, 5],
? [15, 29, 2, 6, 8, 7],
? [7, 10]
]
输出:
[
? "0,1: 0.2500",
? "0,2: 0.1000",
? "2,3: 0.1429"
]

 提示：


 docs.length <= 500
 docs[i].length <= 500

 Related Topics 哈希表
 ? 20 ? 0
 */
public class ComputeSimilarities {
    public static void main(String[] args) {

        int[][] in = new int[][]{
                {14, 15, 100, 9, 3},
                {32, 1, 9, 3, 5},
                {15, 29, 2, 6, 8, 7},
                {7, 10}
        };
        new ComputeSimilarities().computeSimilarities(in).forEach(System.out::println);
    }
    // 别人的 最优
    public List<String> computeSimilarities(int[][] docs) {
        List<String> ret = new ArrayList<>();
        int docLen = docs.length;
        int retFullCount = docLen * (docLen - 1) / 2;

        Map<Integer, List<Integer>> cache = new HashMap<>();
        int[] retReplicaArr = new int[retFullCount];
        for (int i = 0; i < docLen; ++i) {
            for (int n : docs[i]) {
                List<Integer> list = cache.get(n);
                if (list == null) {
                    cache.put(n, new ArrayList<>());
                    cache.get(n).add(i);
                } else {
                    for (Integer l : list) {
                        int index = docLen * l - (1 + l) * l / 2 + (i - l - 1);
                        retReplicaArr[index] = retReplicaArr[index] + 1;
                    }
                    list.add(i);
                }
            }
        }
        for (int i = 0; i < docLen - 1; ++i) {
            for (int j = i + 1; j < docLen; ++j) {
                int index = (docLen * i) - ((1 + i) * i / 2) + (j - i - 1);
                if (docs[i].length > 0 && docs[j].length > 0 && retReplicaArr[index] > 0) {
                    double rate = (double)(retReplicaArr[index]) / (double)(docs[i].length + docs[j].length - retReplicaArr[index]);
                    ret.add(handleResult(i, j, rate));
                }
            }
        }
        return ret;
    }
    private String handleResult(int i, int j, double rate) {
        StringBuilder sb = new StringBuilder().append(i).append(",").append(j).append(": ").append("0.");
        int round = (int)(Math.round(rate * 10000));
        if (round < 10) {
            return sb.append("000").append(round).toString();
        } else if (round < 100) {
            return sb.append("00").append(round).toString();
        } else if (round < 1000) {
            return sb.append("0").append(round).toString();
        } else {
            return sb.append(round).toString();
        }
    }

    public List<String> computeSimilaritiesMy(int[][] docs) {
        Map<Integer, Set<Integer>> dic = new HashMap<>();
        for (int i = 0; i < docs.length; i++) {
            for (int j = 0; j < docs[i].length; j++) {
                if (!dic.containsKey(docs[i][j]))
                    dic.put(docs[i][j], new HashSet<>());
                dic.get(docs[i][j]).add(i);
            }
        }

        List<String> result = new ArrayList<>();
        Map<Integer, Integer> counts;
        for (int i = 0; i < docs.length; i++) {
            counts = new HashMap<>();
            for (int j = 0; j < docs[i].length; j++) {
                Set<Integer> indexs = dic.get(docs[i][j]);
                for (Integer index : indexs) {
                    if (index <= i)
                        continue;
                    if (counts.containsKey(index))
                        counts.put(index, counts.get(index) + 1);
                    else
                        counts.put(index, 1);
                }
            }
            for (Integer index : counts.keySet()) {
                int count = counts.get(index);
                result.add(i + "," + index + String.format(": %.4f", Math.round(((float) count / (docs[i].length + docs[index].length - count) * 10000)) / 10000f));
            }
        }
        return result;
    }

    // 暴力
    public List<String> computeSimilaritiesMySlow(int[][] docs) {
        for (int[] doc : docs) {
            Arrays.sort(doc);
        }
        LinkedList<String> res = new LinkedList<>();
        for (int i = 0; i < docs.length; i++) {
            for (int j = i + 1; j < docs.length; j++) {
                int dis = distance(docs[i], docs[j]);
                if (dis > 0)
                    res.add(i + "," + j + ": " + String.format("%.4f", Math.round((float) dis / (docs[i].length + docs[j].length - dis) * 10000) / 10000f));
            }
        }
        return res;
    }

    private int distance(int[] a, int[] b) {
        if (a.length == 0 || b.length == 0)
            return 0;
        int dis = 0;
        for (int i = 0, j = 0; i < a.length && j < b.length; ) {
            if (a[i] == b[j]) {
                i++;
                j++;
                dis++;
            } else if (a[i] > b[j])
                j++;
            else
                i++;
        }
        return dis;
    }

}
