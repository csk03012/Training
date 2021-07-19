public class ExceptionHandling {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a[5] = 100 / 2;
        }

//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//            System.out.println("Hellllo");
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//            System.out.println("hello");
//        }
//        catch (Exception e){
//            System.out.println(e);
//            System.out.println("Hello");
//        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
/*
the order which gives compile time error
Exception
Arithmetic Exception
Array Index Out Of Bounds Exception
-- we should maintain the order of exception.
 */

/*
finally block executed even when exception is not handled.
 */