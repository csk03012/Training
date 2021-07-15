// Array can only contain fixed size of elements and
// to grow in runtime we use collection framework.
// anonymous array into the method ..methodName(new int[]{1,2,3,4});
//


import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        arr[2] = 4;
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

//        int[] arr1 = returnArray(arr);
//        System.out.println(Arrays.toString(arr1));
        String s1, s2;
        s1 = "helllo";
        s2 = "helllo";
        System.out.println(s1==s2);
        String s3 = new String("CSK");
        String s4 = "CSK";
        System.out.println(s3==s4);
        // the above result showed that: by new keyword the string object created in
        // non-pool and using string literal it create object in pool, which makes java more efficient.
        System.out.println();

        StringBuffer ss = new StringBuffer("Hello");
        ss.replace(1, 3, "Java");
        System.out.println(ss);

    }

    public static int[] returnArray(int[] arr){
        arr[0] = 90;
        return arr;
    }

    public static int[][] multiDimensional(){
        int[][] arr = new int[3][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = i*j;
            }
        }
        return arr;
    }

    public static int[][] jaggedArray(){
        int[][] arr = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[4];
        arr[2] = new int[3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = i+j;
            }
        }
        return arr;
    }
    }
