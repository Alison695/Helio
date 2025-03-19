import javax.swing.JOptionPane;

public class Q16 {
    public static void main(String[] args) {
        String inputNumero = JOptionPane.showInputDialog("Jogador 1, digite um número inteiro:");
        int numeroSecreto = Integer.parseInt(inputNumero);

        int tentativas = 0;
        int palpite;

        do {
            String inputPalpite = JOptionPane.showInputDialog("Jogador 2, tente adivinhar o número:");
            palpite = Integer.parseInt(inputPalpite);
            tentativas++;

            if (palpite < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Seu número é menor do que o meu.");
            } else if (palpite > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Seu número é maior do que o meu.");
            }
        } while (palpite != numeroSecreto);

        JOptionPane.showMessageDialog(null, "Parabéns! Você acertou em " + tentativas + " tentativas.");
    }
}