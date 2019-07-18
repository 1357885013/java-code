package sort;

public class SortMain {
    public static void main(String[] arg) {


        int[] nums = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        sortMethod(nums);
        pri(nums);

        int[] nums1 = new int[10000];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = (int) (Math.random() * 1000000);
        }
        sortMethod(nums1);
        pri(nums1);

        int[] nums2 = {7, 6, 5, 6, 2, 3, 4, 6, 9, 8, 9, 3, 8, 8, 5};
        sortMethod(nums2);
        pri(nums2);

        int[] nums3 = {6, 2, 76, 32, 9, 2, 5, 45, 1, 3, 2, 4};
        sortMethod(nums3);
        pri(nums3);
    }
    public static void sortMethod(int[] a)
    {
        long Time = System.currentTimeMillis();//TIME
        //Sort.combSort(a);
        //Sort.bubbleSort(a);
        Sort.selectionSort(a);
        Time = System.currentTimeMillis()-Time; //TIME
        System.out.println(Time+" 1/Millis s"); //TIME
    }

    public static void pri(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1)
                System.out.print(" , ");
        }
        System.out.println("]");
    }


}
