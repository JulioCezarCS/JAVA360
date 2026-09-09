public class Algoritmo18 {
    public static void main(String[] args) {

        // Mostre os números pares de 0 a 20 usando um vetor e for

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int numero : numeros) {

            if (numero % 2 == 0) {
                System.out.println(numero);
            } else {
                System.out.println("\n");
            }
        }
        
    }
}
