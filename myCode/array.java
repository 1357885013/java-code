package myCode;

class array {
    /*
    ��ά����

    �������� [] [] ������ = new ��������[m][n];

    m:������Ƕ�ά����ĳ���  һά����ĸ���
    n���������ÿһ��һά����ĳ���
    */
    public static void main(String[] args) {
        int[][] arr1;
        int[][] arr2;
        int arr3[][];
        int arr4[][];

        //arr4 = {{2,3},{4,6},{7},{12,45,67},{100}};
        int[][] arr = new int[3][4];
        arr = new int[3][4];
        arr = new int[3][];
        //arr = new int[][2];
        arr = new int[][]{{1, 2}, {2}, {3}};


        //crr = {{2,3},{4,6},{7},{12,45,67},{100}};
        int[][] crr = new int[][]{{2, 3}, {4, 6}, {7}, {12, 45, 67}, {100}};
        int[][] vrr = {{2, 3}, {4, 6}, {7}, {12, 45, 67}, {100}};
        crr = new int[][]{{2, 3}, {4, 6}, {7}, {12, 45, 67}, {100}};


        System.out.println(arr);//[[I@659e0bfd

        System.out.println(arr[0]);//[I@2a139a55

        System.out.println(arr[0][0]);//0


        int[][] brr = new int[2][];

        System.out.println(brr[0]);//null

        brr[0] = new int[3];
        brr[1] = new int[5];


        //int [] [] crr = {{2,3},{4,6},{7},{12,45,67},{100}};


        //������ά����

        //���forѭ��������--->��ά����ĳ����й�
        //�ڲ�forѭ��������--->ÿһ��һά����ĳ����й�

        for (int i = 0; i < crr.length; i++) {
            for (int j = 0; j < crr[i].length; j++) {
                System.out.println(crr[i][j]);
            }
        }
    }
}
