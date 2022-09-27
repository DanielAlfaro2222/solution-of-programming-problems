import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numero_casos = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numero_casos; i++) {
            int cantidad_elementos = Integer.parseInt(bufferedReader.readLine());

            List<String> elementos = Arrays.asList(bufferedReader.readLine().split(" "));

            List<Integer> numeros = elementos.stream().map(num -> Integer.parseInt(num)).collect(Collectors.toList());

            int total = numeros.stream().reduce(1, (a, b) -> a * b);

            if (total >= 0) {
                System.out.println(0);
            } else {
                List<Integer> negativos = numeros.stream().filter(num -> num < 0).collect(Collectors.toList());

                System.out.println((negativos.size() % 2 == 0) ? 0 : 1);
            }
        }
    }
}
