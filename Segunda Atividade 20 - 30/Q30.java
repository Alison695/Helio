import javax.swing.JOptionPane;

public class Q30 {
    public static void main(String[] args) {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do refrigerante:"));
        char tipo = JOptionPane.showInputDialog("Tipo do refrigerante (N/D):").charAt(0);
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
        double precoUnitario = obterPreco(codigo, tipo);
        double valorTotal = precoUnitario * quantidade;
        if (valorTotal > 100.00) valorTotal *= 0.95;
        JOptionPane.showMessageDialog(null, "Total a pagar: R$ " + String.format("%.2f", valorTotal));
    }

    public static double obterPreco(int codigo, char tipo) {
        if (codigo == 1) {
            if (tipo == 'N') return 1.50;
            else return 1.70;
        } else if (codigo == 2) {
            if (tipo == 'N') return 1.60;
            else return 1.70;
        } else if (codigo == 3) {
            if (tipo == 'N') return 1.40;
            else return 1.45;
        } else return 0.0;
    }
}