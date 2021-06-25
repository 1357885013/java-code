package myCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class array {
    /*
    二维数组

    数据类型 [] [] 数组名 = new 数据类型[m][n];

    m:代表的是二维数组的长度  一维数组的个数
    n：代表的是每一个一维数组的长度
    */
    public static void main(String[] args) {
        int[][] arr1;
        int[][] arr2;
        int arr3[][];
        int arr4[][];

//        arr4 = {{2,3},{4,6},{7},{12,45,67},{100}};//error
        int[][] arr = new int[3][4];
        arr = new int[3][4];
        System.out.println("默认值" + arr[0][0]);
//        arr = new int[3][];
        int length1 = arr.length, length2 = arr[0].length;
        arr = new int[length1][length2];
//        arr = new int[][2];//error
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


        //遍历二维数组

        //外层for循环控制行--->二维数组的长度有关
        //内层for循环控制列--->每一个一维数组的长度有关

        for (int i = 0; i < crr.length; i++) {
            for (int j = 0; j < crr[i].length; j++) {
                System.out.println(crr[i][j]);
            }
        }


        for (int[] i : crr)
            for (int j : i)
                System.out.println(j);


        List<String> stringA = Arrays.asList("hello", "world","A");
        System.out.println(stringA);

        String[] stringArray = {"hello","world","B"};
        List<String> stringB = Arrays.asList(stringArray);
        System.out.println(stringB);
        System.out.println(stringB.get(0));

        Integer[] intArray = {1,2,3};
        List<Integer> stringI = Arrays.asList(intArray);
        System.out.println(stringI);
        System.out.println(stringI.get(0));

        // 不要用这种
        List<String[]> stringsC = Collections.singletonList(stringArray);
        System.out.println(stringsC);
    }
}
