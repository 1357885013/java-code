package myCode;

class arrInverse {
    public static void main(String[] args) {
       run();
    }
    public static void run(){
        int[] arr = {12, 56, 25, 89, 73};

        arrInverse(arr);
        printArr(arr);
    }
    public arrInverse() {
    }

    public static void arrInverse(int[] a) {
        int len = a.length;

        for (int i = 0; i < len / 2; i++) {
            swap(a, i, len - 1 - i);
        }
    }

    public static void swap(int[] a, int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

    private static void printArr(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1)
                System.out.print(a[i] + "]");
            else
                System.out.print(a[i] + ",");
        }
    }
}
