package algorithm;

import java.util.*;

/* ����(���в�ͬ���ʵ�)�ĵ��Ľ���(intersection)��Ԫ�صĸ������Բ���(union)��Ԫ�صĸ����������������ĵ������ƶȡ����磬{1, 5, 3}
 �� {1, 7, 2, 3} �����ƶ��� 0.4�����У�������Ԫ���� 2 ����������Ԫ���� 5 ��������һϵ�еĳ�ƪ�ĵ���ÿ���ĵ�Ԫ�ظ�����ͬ������һ�� ID
 ����������ǵ����ƶȷǳ���ϡ�衱��Ҳ����˵��ѡ 2 ���ĵ������ƶȶ��ܽӽ� 0�������һ���㷨����ÿ���ĵ��� ID �������ƶȡ�ֻ��������ƶȴ��� 0 �����
������Կ��ĵ���Ϊ����������Լٶ�ÿ���ĵ���һ�����в�ͬ�����������ʾ��

 ����Ϊһ����ά���� docs��docs[i] ��ʾ id Ϊ i ���ĵ�������һ�����飬����ÿ��Ԫ����һ���ַ���������ÿ�����ƶȴ��� 0 ���ĵ������ʽΪ
 {id1},{id2}: {similarity}������ id1 Ϊ�����ĵ��н�С�� id��similarity Ϊ���ƶȣ���ȷ��С����� 4 λ��������˳��
����������ɡ�

 ʾ��:

 ����:
[
? [14, 15, 100, 9, 3],
? [32, 1, 9, 3, 5],
? [15, 29, 2, 6, 8, 7],
? [7, 10]
]
���:
[
? "0,1: 0.2500",
? "0,2: 0.1000",
? "2,3: 0.1429"
]

 ��ʾ��


 docs.length <= 500
 docs[i].length <= 500

 Related Topics ��ϣ��
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
    // ���˵� ����
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

    // ����
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
