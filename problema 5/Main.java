import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numero_casos = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numero_casos; i++) {
            String[] entrada = bufferedReader.readLine().split(" ");

            int A = Integer.parseInt(entrada[0]);
            int B = Integer.parseInt(entrada[1]);
            int X = Integer.parseInt(entrada[2]);

            if (A == B) {
                System.out.println("YES");
                continue;
            }

            System.out.println((((A - B) % (2 * X) == 0)) ? "YES" : "NO");
        }
    }
}