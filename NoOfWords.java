import java.io.*;
public class NoOfWords {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String a[] = str.split(" ");

        int b = a.length;
        System.out.println(b);
    }
}
