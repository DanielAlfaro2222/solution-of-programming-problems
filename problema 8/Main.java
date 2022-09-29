import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numero_casos = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numero_casos; i++) {
            List<String> entrada = Arrays.asList(bufferedReader.readLine().split(" "));

            List<Integer> numeros = elementos.stream().map(num -> Integer.parseInt(num)).collect(Collectors.toList());

            int carrerasLogradas = numeros[0];
            int objetivo = numeros[1];

            System.out.println(Math.abs(carrerasLogradas - objetivo));
        }
    }
}