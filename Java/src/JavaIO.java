import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIO {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = new InputStreamReader(System.in);
        char c;
        do{
            c = (char) cin.read();
            System.out.print(c);
        }while(c != 'q');

    }
}
