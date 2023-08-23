import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        float a, b;

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo!");
        System.out.println("===========================");
        System.out.print("Digite os valores de A: ");
        a = scan.nextInt();
        System.out.print("Digite os valores de B: ");
        b = scan.nextInt();
        System.out.println("===========================");
        System.out.println("Os valores de A são: " + a + "\nOs valores de B são: " + b);


    }
}