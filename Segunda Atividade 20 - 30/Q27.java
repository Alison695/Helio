import javax.swing.JOptionPane;

public class Q27 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        int[] idades = new int[3];
        double[] alturas = new double[3];

        for (int i = 0; i < 3; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa " + (i + 1) + ":"));
            alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa " + (i + 1) + " (em metros):"));
        }

        int maisAlto = 0, maisBaixo = 0, maisVelho = 0, maisNovo = 0;
        double somaAlturas = alturas[0];

        for (int i = 1; i < 3; i++) {
            if (alturas[i] > alturas[maisAlto]) {
                maisAlto = i;
            }
            if (alturas[i] < alturas[maisBaixo]) {
                maisBaixo = i;
            }
            if (idades[i] > idades[maisVelho]) {
                maisVelho = i;
            }
            if (idades[i] < idades[maisNovo]) {
                maisNovo = i;
            }
            somaAlturas += alturas[i];
        }

        double mediaAlturas = somaAlturas / 3;

        String resultado = "Pessoa mais alta: " + nomes[maisAlto] + "\n" +
                           "Pessoa mais baixa: " + nomes[maisBaixo] + "\n" +
                           "Altura média: " + mediaAlturas + " metros\n" +
                           "Pessoa mais velha: " + nomes[maisVelho] + "\n" +
                           "Pessoa mais nova: " + nomes[maisNovo];

        JOptionPane.showMessageDialog(null, resultado);
    }
}