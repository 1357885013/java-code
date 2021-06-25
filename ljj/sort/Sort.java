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

    public static void quickSort(int[] a) {
        quickSortChild(a, 0, a.length - 1);
    }

    private static int[] quickSortChild(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) arr=quickSortChild(arr,start,i-1);
        if (j+1<end) arr=quickSortChild(arr,j+1,end);
        return (arr);
    }


    public static void countSort(int[] nums) {//计数排序
        int max = nums[0];
        for (int n : nums)
            if (n > max)
                max = n;

        int[] count = new int[max + 1]; //存放数数结果

        for (int n : nums) //数每个数出现几次
            count[n]++;

        for (int i = 1; i < count.length; i++) //算出每个数的排名
            count[i] += count[i - 1];

        int[] result = new int[nums.length]; //存放排序结果

        for (int i = nums.length - 1; i >= 0; i--) { //根据排名导出排序结果
            if (nums[i] != 0) {
                int loc = count[nums[i]] - 1;
                while (result[loc] != 0)
                    loc--;

                result[loc] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {//复制结果到数组参数里,数组给的是一个地址,改变这个地址不会影响到调用前的东西
            nums[i] = result[i];
        }
    }

    public static void bucketSort(int[] a) {

    }

    public static void swap(int[] a, int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }


}
