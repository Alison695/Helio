import javax.swing.JOptionPane;

public class Q22 {
    public static void main(String[] args) {
        String inputId = JOptionPane.showInputDialog("Digite o número de identificação do aluno:");
        int idAluno = Integer.parseInt(inputId);

        String sNota1 = JOptionPane.showInputDialog("Digite a primeira nota:");
        double nota1 = Double.parseDouble(sNota1);

        String sNota2 = JOptionPane.showInputDialog("Digite a segunda nota:");
        double nota2 = Double.parseDouble(sNota2);

        String sNota3 = JOptionPane.showInputDialog("Digite a terceira nota:");
        double nota3 = Double.parseDouble(sNota3);

        String inputMediaExercicios = JOptionPane.showInputDialog("Digite a média dos exercícios:");
        double mediaExercicios = Double.parseDouble(inputMediaExercicios);

        double mediaAproveitamento = (nota1 + 2 * nota2 + 3 * nota3 + mediaExercicios) / 7;

        char conceito;
        if (mediaAproveitamento >= 9.0) {
            conceito = 'A';
        } else if (mediaAproveitamento >= 7.5) {
            conceito = 'B';
        } else if (mediaAproveitamento >= 6.0) {
            conceito = 'C';
        } else if (mediaAproveitamento >= 4.0) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        String resultado = "Número de identificação: " + idAluno + "\n" +
                           "Notas: " + nota1 + ", " + nota2 + ", " + nota3 + "\n" +
                           "Média dos exercícios: " + mediaExercicios + "\n" +
                           "Média de aproveitamento: " + mediaAproveitamento + "\n" +
                           "Conceito: " + conceito + "\n";

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            resultado += "APROVADO";
        } else {
            resultado += "REPROVADO";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}