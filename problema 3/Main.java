import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int total = 0;

        for (int i = 1; i < num; i++) {
            numeros.add(i);
        }

        if (num != 1 && num != 2) {
            for (Integer i : numeros) {
                for (Integer j : numeros) {
                    int suma = i + j;

                    if (suma == num) {
                        total += 1;
                    }
                }
            }
        } else if (num == 2) {
            total += 1;
        }

        System.out.println(total);
    }
}
