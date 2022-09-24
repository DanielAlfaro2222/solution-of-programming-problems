import java.util.*;
import java.lang.*;
import java.io.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String[] notas = scanner.nextLine().split(" ");

//         int alice = Integer.parseInt(notas[0]);
//         int bob = Integer.parseInt(notas[1]);

//         System.out.println((alice >= bob * 2) ? "Yes" : "No");
//     }
// }

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] notas = bufferedReader.readLine().split(" ");

        int alice = Integer.parseInt(notas[0]);
        int bob = Integer.parseInt(notas[1]);

        System.out.println((alice >= bob * 2) ? "Yes" : "No");
    }
}