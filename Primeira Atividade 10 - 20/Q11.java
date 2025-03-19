import java.util.Scanner;

public class FatorialDouble {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O fatorial não está definido para números negativos.");
        } else {
            double fatorial = calcularFatorial(numero);
            JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
        }

        entrada.close();
    }

    public static double calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            double fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}