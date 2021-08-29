package JavaCoreTest2;

import java.util.*;

public class Question3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int k=0; k<t; k++){

            int n = input.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<n; i++)
                arr.add(input.nextInt());

            Collections.sort(arr);

            Set<StringBuilder> result = new TreeSet<>();
            ArrayList<Integer> ans = new ArrayList<>();
            function(0, ans, n, arr, result);

            List<StringBuilder> x = new ArrayList<StringBuilder>(result);
            Collections.sort(x);

            System.out.print("()");
            for(int i=1; i<x.size(); i++){
                System.out.print("(");
                StringBuilder ele = x.get(i);
                for(int j=0; j<ele.length()-1; j++){
                    System.out.print(ele.charAt(j));
                    System.out.print(" ");
                }

                System.out.print(ele.charAt(ele.length()-1));
                System.out.print(")");
            }
            System.out.println();
        }

    }

    static void function(int index, ArrayList<Integer> ans, int total, ArrayList<Integer> arr, Set<StringBuilder> result){

        if(index==total){
            StringBuilder s = new StringBuilder("");
            for(int i=0; i< ans.size(); i++)
                s.append(ans.get(i));
            result.add(s);
            return;
        }
        int ele = arr.get(index);
        ans.add(ele);
        function(index+1, ans, total, arr, result);

        ans.remove(ans.size()-1);
        function(index+1, ans, total, arr, result);

    }
}
