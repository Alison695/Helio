import javax.swing.JOptionPane;

public class Q12 {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        for (int i = 0; i < 500; i++) {
            String input = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor inteiro e positivo: ");
            try {
                int numero = Integer.parseInt(input);

                if (numero < 0) {
                    JOptionPane.showMessageDialog(null, "Valor inválido. Digite apenas números inteiros e positivos.");
                    i--;
                    continue;
                }

                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }

                soma += numero;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número inteiro.");
                i--;
            }
        }

        double media = (double) soma / 500;

        String resultado = "Maior valor: " + maior + "\n" +
                           "Menor valor: " + menor + "\n" +
                           "Média dos valores: " + media;
        JOptionPane.showMessageDialog(null, resultado);
    }
}