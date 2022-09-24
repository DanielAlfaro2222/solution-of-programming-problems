import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero_casos = scanner.nextInt();
        String respuesta = "";

        for (int i = 0; i < numero_casos; i++) {
            int horas = scanner.nextInt();

            respuesta = (horas >= 7) ? "NO" : "YES";

            System.out.println(respuesta);
        }
    }
}