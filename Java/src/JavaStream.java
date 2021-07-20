import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class JavaStream {
    public static void main(String[] args) {
        try{
            FileOutputStream file = new FileOutputStream("/home/csk/Downloads/test.txt");
            file.write(65);
            file.write(66);

            String s = "Learning Java Stream";
            byte[] b = s.getBytes();
            System.out.println(Arrays.toString(b));

            file.write(b);
            file.close();
            System.out.println("Success");

        }
        catch (Exception error){
            System.out.println(error);
        }

        try{
            FileInputStream file = new FileInputStream("/home/csk/Downloads/test.txt");
            int i;
            while ((i=file.read()) != -1){
                System.out.print((char) i);
            }
            file.close();
        }
        catch (Exception error){
            System.out.println(error);
        }
    }
}
