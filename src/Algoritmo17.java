public class Algoritmo17 {
    public static void main(String[] args) {

        // Mostre números ímpares de 0 a 200 usando while

        int i = 1;

        /*
         * while (i <= 200) {
         * 
         * if (i % 2 != 0) { // trocar "<=" por "!="
         * System.out.println(i);
         * i++;
         * } else {
         * i++;
         * }
         * 
         * }
         */

        // Excluir linha vertical: Ctrl + Shift + L

        // Comentar tudo automaticamente: Shift + Alt + A

        // Mostre números pares de 0 a 200 usando do while

        do {
            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            } else {
                System.out.println("|");
                i++;
            }

        } while (i <= 200);

    }
}
