import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner reader = new Scanner(System.in);
        int numero1 = reader.nextInt();
        int numero2 = reader.nextInt();

        try {
            Imprimir(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static void Imprimir(int num1, int num2) throws ParametrosInvalidosException {
        if (num2 < num1) throw new ParametrosInvalidosException();
        for (int i = 1; i <= num2 - num1; i++) {
            System.out.println("Imprimido o número " + i);
        }
    }

}