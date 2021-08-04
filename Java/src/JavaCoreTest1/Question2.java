package JavaCoreTest1;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        String s = "abasast";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder ans = new StringBuilder();
        int i = 0;
        int insertion = 0;

        while (true){
            if (arr[i]  == arr[i+1]){
                ans.append(arr[i]);
                i+=2;
            }
            else {
                ans.append(arr[i]);
                i += 1;
                insertion += 1;
            }
            if (i > arr.length-1)
                break;

            if (i == arr.length-1) {
                insertion += 1;
                ans.append(arr[i]);
                break;
            }
        }

        StringBuilder ans1 = new StringBuilder(ans);
        ans1.reverse();
        System.out.println("Result: "+ans.append(ans1));
        System.out.println("Total Insertions: "+ insertion);
    }
}
