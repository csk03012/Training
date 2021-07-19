package Assignment4.Question1;

import java.io.IOException;

public class Question1 {

// ---------------------------------------------------------------------------------------------------------------------
    public static void partA(){
        try {
            throw new IOException("Error in partA method");
        }
        catch (IOException error){
            System.out.println("Error: "+error.getMessage());
            System.out.println("------------------------------");
        }
    }
// --------------------------------------------------------------------------------------------------------------------
    public static void partB() throws IOException{
        throw new IOException("Error in partB method");
    }
// -------------------------------------------------------------------------------------------------------------------------
    /* (if it is not handled)checked exception cannot be thrown in method without adding exception to
       method signature(throws).*/

    /*
    In partC when checked exception is thrown then
    1) it should be handle in same method like partA or
    2) if it is not handled in same method then it should (use throws keyword) declare exception
    to be thrown up the call stack for next higher level method to handle like partB used throws
     keyword, so that exception can be handled in higher level method(main method).
     */

//    public static void partC() {
//        throw new IOException("Error in partC method");
//    }

    /*
    here syntax is wrong for partC method. because checked exception is thrown and does not declared it using throws.
    this give compile time error because checked exception are not propagate by default. It should be declared using throws keyword.
    */

// -----------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        partA();

        //partB method exception handled in other method (main method).
        try{
            partB();
        }
        catch (IOException error){
            System.out.println("Error of partB method caught in main method by calling it in main.");
            System.out.println("Error in main method:"+ error.getMessage());
            System.out.println("------------------------------");
        }

        // it partC method, not used throws keyword and error is not handled.
        // give error in Compile time.

        //throw new IOException(); (it is like partC method)
//        partC();
    }
// ---------------------------------------------------------------------------------------------------------------------------------------

}
