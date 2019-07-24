package sort;

public class SortMain {
    public static void main(String[] arg) {


        int[] nums = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        sortMethod(nums);

        nums = new int[50000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 1000000);
        }
        sortMethod(nums);

        nums = new int[]{7, 6, 5, 6, 2, 3, 4, 6, 9, 8, 9, 3, 8, 8, 5};
        sortMethod(nums);

        nums = new int[]{6, 2, 76, 32, 9, 2, 5, 45, 1, 3, 2, 4, 0, 0};
        sortMethod(nums);

    }

    public static void sortMethod(int[] a) {
        long Time = System.currentTimeMillis();//TIME
//        Sort.combSort(a);//time:142 3211
//        Sort.bubbleSort(a);//time:230 5456
//        Sort.selectionSort(a);//time:76 1841
//        Sort.countSort(a);//time:11 15
        Sort.quickSort(a);
        Time = System.currentTimeMillis() - Time; //TIME
        System.out.println(Time + " 1/Millis s"); //TIME
        pri(a);
        isOrder(a);
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

    public static void isOrder(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                System.out.println("not order");
                return;
            }
        }
        System.out.println("ordered");
    }


}
