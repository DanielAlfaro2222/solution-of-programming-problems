import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numero_casos = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numero_casos; i++) {
            String[] entrada = bufferedReader.readLine().split(" ");

            int cantidad_cartas = Integer.parseInt(entrada[0]);
            int cartas_boca_arriba = Integer.parseInt(entrada[1]);
            int resta = cantidad_cartas - cartas_boca_arriba;

            if (cantidad_cartas == cartas_boca_arriba) {
                System.out.println("0");
            } else if (resta > cartas_boca_arriba) {
                System.out.println(cartas_boca_arriba);
            } else {
                System.out.println(resta);
            }
        }
    }
}