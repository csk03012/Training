public class CustomExceptionHandling extends Exception {
    CustomExceptionHandling (String s){
        super(s);
    }
}

class DriverCode{
    public static void validate(int a) throws CustomExceptionHandling {
        if(a <= 18)
            throw new CustomExceptionHandling("Not allowed to vote");
        else
            System.out.println("Welcome to Vote");
    }


    public static void main(String[] args) {
        int age = 10;
        try{
            validate(age);
        }
        catch (Exception e){
            System.out.println("Error: "+ e);
        }
    }
}
