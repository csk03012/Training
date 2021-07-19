package Assignment4.Question2;

public class Question2 {

// --------------------------------------------------------------------------------------------------------------------------------
    public static void partA(){
        try {
            throw new ArithmeticException("Error in partA method");
        }
        catch (ArithmeticException error){
            System.out.println("Error: "+error.getMessage());
            System.out.println("------------------------------");
        }
    }
// ------------------------------------------------------------------------------------------------------------------------------
    public static void partB() throws ArithmeticException{
        throw new ArithmeticException("Error in partB method");
    }
// --------------------------------------------------------------------------------------------------------------------------------
    /*
    In partC method, unchecked exception is thrown
    therefore the exception can be handle in higher level method without even declaring it (throws) in method signature.
    Because it is a unchecked method and it can propagate without using throws keyword.
     */
    public static void partC(){
        throw new ArithmeticException("Error in partC method");
    }
// ------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args){
        partA();

        //handle partB method exception in other method
        try{
            partB();
        }
        catch (ArithmeticException error){
            System.out.println("Error of partB method caught in main method by calling it in main.");
            System.out.println("Error in main method:"+ error.getMessage());
            System.out.println("------------------------------");
        }

        // it partC method, not used throws keyword and error is not handled.
        // give error in Run time.
        // throw new ArithmeticException(); It is like partC method.
        partC();
    }

// --------------------------------------------------------------------------------------------------------------------------
}
