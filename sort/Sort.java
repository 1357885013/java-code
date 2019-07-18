package sort;

import java.time.LocalDate;

public class Sort {

    int[] nums = {6, 2, 76, 32, 9, 2, 5, 45, 1, 3, 2, 4};
    LocalDate time = LocalDate.now();

    public static void bubbleSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) //控制循环轮数
        {
            for (int j = 1; j < nums.length - i + 1; j++) //把最大的数放在最右边,下一轮最右边的就不用管了.
            {
                if (nums[j - 1] > nums[j])
                    swap(nums, j - 1, j);
            }
        }
    }

    public static void selectionSort(int[] a) {//每次循环选择最大的数,与最左边未交换过得数交换.就是选择排序,特点就是每次循环只选出最大的数.
        for (int i = 0; i < a.length; i++) {//出错点
            int max = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[max])
                    max = j;
            }
            swap(a, max, i);
        }
    }

    public static void combSort(int[] a) {//梳排序,带步长的冒泡排序.
        int step = (int) (a.length / 1.3); //计算初始步长,就是*10/13
        boolean hadSwap = true; //设为true以进入循环

        while (hadSwap || step != 1) { ////出错点:条件没加全,dstep没到1就退出了
            hadSwap = false;
            for (int i = 0; i + step < a.length; i++) {
                if (a[i] > a[i + step]) {
                    hadSwap = true;
                    swap(a, i, i + step);
                }
            }
            if (step > 1) step--;
        }
    }

    public static void swap(int[] a, int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }


}
