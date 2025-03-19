import javax.swing.JOptionPane;

public class Q10 {
    public static void main(String[] args) {
        double[] numeros = new double[5];
        int contadorNegativos = 0;

        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor:");
            try {
                numeros[i] = Double.parseDouble(input);
                if (numeros[i] < 0) {
                    contadorNegativos++;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.");
                i--;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de valores negativos: " + contadorNegativos);
    }
}