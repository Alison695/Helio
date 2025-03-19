import javax.swing.JOptionPane;

public class Q28 {
    public static void main(String[] args) {
        String inputNumero = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numero = Integer.parseInt(inputNumero);

        if (numero >= 1000 && numero <= 9999) {
            int parte1 = numero / 100;
            int parte2 = numero % 100;

            if ((parte1 + parte2) * (parte1 + parte2) == numero) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " satisfaz a característica.");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + numero + " não satisfaz a característica.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número inteiro de 4 dígitos.");
        }
    }
}