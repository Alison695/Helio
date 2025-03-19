import javax.swing.JOptionPane;

public class Q17 {
    public static void main(String[] args) {
        double capacidadeLitros = 20;
        double capacidadeMililitros = capacidadeLitros * 1000;
        double vazamentoMililitros = 50;
        double tempoMinutosPorVazamento = 30;

        double totalVazamentos = capacidadeMililitros / vazamentoMililitros;
        double tempoTotalMinutos = totalVazamentos * tempoMinutosPorVazamento;
        double tempoTotalHoras = tempoTotalMinutos / 60;

        JOptionPane.showMessageDialog(null, "O garrafão estará vazio em " + tempoTotalHoras + " horas.");
    }
}