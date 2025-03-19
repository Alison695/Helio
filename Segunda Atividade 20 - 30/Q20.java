import javax.swing.JOptionPane;

public class Q20 {
    public static void main(String[] args) {
        String inputSaldo = JOptionPane.showInputDialog("Digite o saldo médio do cliente:");
        double saldoMedio = Double.parseDouble(inputSaldo);

        double percentualCredito = 0;

        if (saldoMedio <= 200) {
            percentualCredito = 0;
        } else if (saldoMedio <= 1000) {
            percentualCredito = 0.20;
        } else if (saldoMedio <= 2000) {
            percentualCredito = 0.30;
        } else {
            percentualCredito = 0.40;
        }

        double valorCredito = saldoMedio * percentualCredito;

        String resultado = "Saldo médio: R$ " + saldoMedio + "\n" +
                           "Valor do crédito: R$ " + valorCredito;

        JOptionPane.showMessageDialog(null, resultado);
    }
}