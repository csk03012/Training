import junit.framework.TestSuite;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;
import org.junit.runners.Suite;

@Ignore
class testt{
    public testt(){

    }

    @Test
    public void test3(){
        int a, b, c;
        a = 8; b = 4; c = a+b;
        Assert.assertEquals(11, c);
    }
}


public class testtt
{
    @Test
    public void test()
    {
        int a, b, c;
        a = 8; b = 4; c = a+b;
        Assert.assertEquals(11, c, 0);
    }

    public static int add(int a, int b){
        return a+b;
    }
    @Test
    public void test1(){
        int a, b, c;
        a = 8; b = 4; c = a+b;
        String s=" ";
        Assert.assertEquals(add(a, b), true);
    }

    @Test(timeout = 100)
    public void test2(){
        for(int i=1; i<=Math.pow(10,10); i++){
        }
    }

    @Test
    public void test3(){
        throw new ArithmeticException();
    }

    @Test
    public void test4(){
        try{
            int a = 0;
            int b = 1/a;
        }
        catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    @RunWith(Suite.class)
    @Suite.SuiteClasses({testt.class, testtt.class})
    public static class TestSuite {
    }


//    public static void main(String[] args) {
//        Result result = JUnitCore.runClasses(TestSuite.class);
//        for (Failure failure: result.getFailures())
//            System.out.println(failure.toString());
//        System.out.println(result.wasSuccessful());
//    }

}
