import javax.swing.JOptionPane;

public class Q18 {
    public static void main(String[] args) {
        double capacidadeLitros = 20;
        double capacidadeMililitros = capacidadeLitros * 1000;
        double vazamentoMililitros = 50;
        double tempoMinutosPorVazamento = 30;
        double consumoMililitrosPorHora = 300;

        double totalVazamentos = capacidadeMililitros / vazamentoMililitros;
        double tempoTotalMinutos = totalVazamentos * tempoMinutosPorVazamento;
        double tempoTotalHoras = tempoTotalMinutos / 60;

        double consumoTotalMililitros = tempoTotalHoras * consumoMililitrosPorHora;
        double capacidadeRestanteMililitros = capacidadeMililitros - consumoTotalMililitros;

        if (capacidadeRestanteMililitros <= 0) {
            JOptionPane.showMessageDialog(null, "O garrafão estará vazio em " + tempoTotalHoras + " horas.");
        } else {
            double tempoConsumoTotalHoras = capacidadeMililitros / (vazamentoMililitros / (tempoMinutosPorVazamento / 60) + consumoMililitrosPorHora);
            JOptionPane.showMessageDialog(null, "O garrafão estará vazio em " + tempoConsumoTotalHoras + " horas.");
        }
    }
}