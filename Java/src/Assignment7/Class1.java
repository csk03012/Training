package Assignment7;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Class1 {

    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();
    List<Character> chars = new ArrayList<>();


    @Before
    public void setUp(){
//        System.out.println("In set up method of Class1");
        for(int i=2; i<=10; i+=2)
            even.add(i);
//        System.out.println(even);

        for(int j=1; j<=10; j+=2)
            odd.add(j);
//        System.out.println(odd);

        char c = 'a';
        while (c <= 'z'){
            chars.add((char) c);
            c += 1;
        }
//        System.out.println(chars);
    }

    @Test // positive test
    public void test1(){
        List<Integer> arr = new ArrayList<>();
        for(int i=2; i<=10; i+=2)
            arr.add(i);

        Assert.assertEquals(arr, even);
    }

    @Test // Negative test (it also fails but dType is different)
    public void test2(){
        Assert.assertEquals(odd, chars);
    }

    @Test // fail test
    public void test3(){
        Assert.assertEquals(even, odd);
    }


    @Test // fail test
    public void test4(){
        Assert.fail("Failed");
    }

    @Test // fail test
    public void test5(){
        throw new ArithmeticException("Arithmetic Exception");
    }
}
