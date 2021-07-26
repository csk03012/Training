package Assignment7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Class2 {

    List<Integer> natural = new ArrayList<>();
    List<Character> aToj = new ArrayList<>();

    @Before
    public void setUp(){
//        System.out.println("In set up method of Class2");
        for(int i=1; i<=10; i++)
            natural.add(i);
//        System.out.println(natural);

        char c='a';
        while(c<='j'){
            aToj.add((char) c);
            c += 1;
        }
//        System.out.println(aToj);
    }

    @Test // positive case
    public void test1(){
        List<Character> arr = new ArrayList<>();
        char c='a';
        while(c<='j'){
            arr.add((char) c);
            c += 1;
        }

        Assert.assertEquals(arr, aToj);
    }

    @Test // Negative case (dType is different)
    public void test2(){
        Assert.assertEquals(natural, aToj);
    }

    @Test // fail case
    public void test3(){
        List<Character> arr = new ArrayList<>();
        char c='a';
        while(c<='k'){
            arr.add((char) c);
            c += 1;
        }

        Assert.assertEquals(arr, aToj);
    }
    @Test // fail test
    public void test4(){
        Assert.fail("Failed");
    }


    @Test(timeout = 100) // fail test
    public void test5(){
        while(true){
        }
    }
}
