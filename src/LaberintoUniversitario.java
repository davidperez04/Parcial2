import java.util.Random;
import java.util.Scanner;

public class LaberintoUniversitario {

    public static void main(String[] args) {
        int[][] laberinto = new int[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generar el laberinto con valores aleatorios del 1 al 9
        for (int fila = 0; fila < laberinto.length; fila++) {
            for (int col = 0; col < laberinto[fila].length; col++) {
                laberinto[fila][col] = random.nextInt(9) + 1;
            }
        }

        // Mostrar el laberinto generado
        System.out.println("=== LABERINTO UNIVERSITARIO ===");
        mostrarMatriz(laberinto);

        // Instrucciones del reto
        System.out.println("""
        ¡Bienvenido al Laberinto Universitario!
        Este sistema representa los pasillos secretos de tu facultad.
        Cada número indica un nivel de energía en ese punto.
        Tu misión es explorar este laberinto cumpliendo los siguientes desafíos:

        1. Contar cuántos números pares hay mayores a 4. ⚡
        
        2. Calcular el promedio de los números impares. 🎯
        3. Calcular la suma de los valores de cada fila. 🧮
        4. BONUS: Encuentra la posición del mayor número del laberinto. 👑
        """);

        // Aquí puedes invocar los métodos para cada uno de los puntos anteriores
        // Por ejemplo:
        // contarParesMayoresA4(laberinto);
        // promedioImpares(laberinto);
        // etc...
        System.out.println(" la cantidad de pares mayores a 4 es : "+contarParesMayoresA4(laberinto));
        System.out.println("el promedio de l.os númeñros impñares es : "+PromedioImpares(laberinto));
        PosiciónMayor(laberinto);

        scanner.close();
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int contarParesMayoresA4(int [][] laberinto){
        int paresMayoresA4 = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(laberinto[i][j] % 2 == 0 && laberinto[i][j] > 4){
                    paresMayoresA4++;
                }
            }
        }
        return paresMayoresA4;
    }

    public static int PromedioImpares(int [][] laberinto){
        int suma = 0;
        int contadorImpares = 0;
        int promedioImpares;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(!(laberinto[i][j] % 2 == 0)){
                    suma += laberinto[i][j];
                    contadorImpares++;
                }
            }
        }

        promedioImpares = suma / contadorImpares;
    
        return promedioImpares;
    }

    
    public static void PosiciónMayor(int [][] laberinto){
        int numMayor = 0;
        int posicionFila = 0;
        int posicionColumna = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(laberinto[i][j]> numMayor){
                    numMayor = laberinto[i][j];
                    posicionFila = i ;
                    posicionColumna = j;

                }
            }
        }
    
        System.out.println("la posicion del mayor numero del laberinto es fila :"+posicionFila+" y columna : "+posicionColumna);
    }

    // Aquí puedes agregar los métodos necesarios para resolver el laberinto
    // Ejemplo:
    // public static void contarParesMayoresA4(int[][] matriz) { ... }

}