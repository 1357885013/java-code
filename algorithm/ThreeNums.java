package algorithm;

import java.util.*;

public class ThreeNums {
    public static void main(String[] args) {
        List<List<Integer>> result = new ThreeNums().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
//        List<List<Integer>> result = new ThreeNums().threeSum(new int[]{0, 0, 0, 0});
        result.forEach(a -> {
            Object[] array = a.toArray();
            String str = Arrays.toString(array);
            System.out.print(str);
            System.out.print(" ");
        });
    }

    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        if (nums.length < 3) return new ArrayList<>(result);
        Arrays.sort(nums);
        int l, r;
        for (int i = 1; i <= nums.length - 2; i++) {
            l = 0;
            r = nums.length - 1;
            while (l < i && r > i) {
                if (nums[l] > 0 || nums[r] < 0) break;
                boolean isZero = false;
                if (nums[l] + nums[i] + nums[r] == 0) {
                    result.add(Arrays.asList(nums[l], nums[i], nums[r]));
                    isZero = true;
                }
                if (nums[l] + nums[i] + nums[r] < 0 || isZero) {
                    l++;
                    if (nums[l] > 0) break;
                    while (nums[l] == nums[l - 1] && l < nums.length - 1) {
                        l++;
                        if (nums[l] > 0) break;
                    }
                }
                if (nums[l] + nums[i] + nums[r] > 0 || isZero) {
                    r--;
                    if (nums[r] < 0) break;
                    while (nums[r] == nums[r + 1] && r >= 1) {
                        r--;
                        if (nums[r] < 0) break;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    // 三个点位, 左边是固定的i, 右边两个移动,一个在最左边i+1往右移;一个再最右边length-1往左移.
    public List<List<Integer>> threeSumBest(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int l, r, sum, n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            else if (nums[i] > 0) return result;
            else {
                l = i + 1;
                r = n - 1;
                while (l < r) {
                    sum = nums[i] + nums[l] + nums[r];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    } else if (sum < 0) l++;
                    else r--;
                }
            }
        }
        return result;
    }
}
