import javax.swing.JOptionPane;

public class Q21 {
    public static void main(String[] args) {
        String inputSalario = JOptionPane.showInputDialog("Digite o salário do funcionário:");
        double salario = Double.parseDouble(inputSalario);

        String inputCargo = JOptionPane.showInputDialog("Digite o código do cargo (91, 92 ou 93):");
        int cargo = Integer.parseInt(inputCargo);

        double percentualAumento = 0;

        switch (cargo) {
            case 91:
                percentualAumento = 0.10;
                break;
            case 92:
                percentualAumento = 0.20;
                break;
            case 93:
                percentualAumento = 0.30;
                break;
            default:
                percentualAumento = 0.355;
                break;
        }

        double aumento = salario * percentualAumento;
        double novoSalario = salario + aumento;

        String resultado = "Salário antigo: R$ " + salario + "\n" +
                           "Novo salário: R$ " + novoSalario + "\n" +
                           "Diferença: R$ " + aumento;

        JOptionPane.showMessageDialog(null, resultado);
    }
}