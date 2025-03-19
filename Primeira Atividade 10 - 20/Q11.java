import javax.swing.JOptionPane;

public class Q11 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro para calcular o fatorial:");
        try {
            int numero = Integer.parseInt(input);

            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "O fatorial não está definido para números negativos.");
            } else {
                double fatorial = calcularFatorial(numero);
                JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número inteiro.");
        }
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