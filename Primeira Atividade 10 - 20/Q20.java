import javax.swing.JOptionPane;

public class Q20 {
    public static void main(String[] args) {
        int votosFirmino = 0;
        int votosEugenia = 0;
        int votosBranco = 0;
        int votosNulos = 0;
        int totalVotos = 0;

        while (true) {
            String inputVoto = JOptionPane.showInputDialog("Digite o voto (1 para Firmino, 2 para Eugênia, 0 para branco, 9 para nulo, ou 'fim' para terminar):");

            if (inputVoto.equalsIgnoreCase("fim")) {
                break;
            }

            try {
                int voto = Integer.parseInt(inputVoto);

                if (voto == 1) {
                    votosFirmino++;
                    totalVotos++;
                } else if (voto == 2) {
                    votosEugenia++;
                    totalVotos++;
                } else if (voto == 0) {
                    votosBranco++;
                    totalVotos++;
                } else if (voto == 9) {
                    votosNulos++;
                    totalVotos++;
                } else {
                    JOptionPane.showMessageDialog(null, "Voto inválido. Digite 1, 2, 0 ou 9.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número inteiro ou 'fim'.");
            }
        }

        String candidatoVencedor = (votosFirmino > votosEugenia) ? "Firmino" : "Eugênia";

        String resultado = "Candidato vencedor: " + candidatoVencedor + "\n" +
                           "Votos em branco: " + votosBranco + "\n" +
                           "Votos nulos: " + votosNulos + "\n" +
                           "Total de eleitores: " + totalVotos;

        JOptionPane.showMessageDialog(null, resultado);
    }
}