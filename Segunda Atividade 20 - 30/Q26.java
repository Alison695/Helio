import javax.swing.JOptionPane;

public class Q26 {
    public static void main(String[] args) {
        String inputA1 = JOptionPane.showInputDialog("Digite o coeficiente a1 da primeira reta:");
        double a1 = Double.parseDouble(inputA1);

        String inputB1 = JOptionPane.showInputDialog("Digite o coeficiente b1 da primeira reta:");
        double b1 = Double.parseDouble(inputB1);

        String inputC1 = JOptionPane.showInputDialog("Digite o termo independente c1 da primeira reta:");
        double c1 = Double.parseDouble(inputC1);

        String inputA2 = JOptionPane.showInputDialog("Digite o coeficiente a2 da segunda reta:");
        double a2 = Double.parseDouble(inputA2);

        String inputB2 = JOptionPane.showInputDialog("Digite o coeficiente b2 da segunda reta:");
        double b2 = Double.parseDouble(inputB2);

        String inputC2 = JOptionPane.showInputDialog("Digite o termo independente c2 da segunda reta:");
        double c2 = Double.parseDouble(inputC2);

        double determinante = a1 * b2 - a2 * b1;

        if (determinante == 0) {
            JOptionPane.showMessageDialog(null, "As retas são paralelas e não possuem ponto de interseção.");
        } else {
            double x = (c1 * b2 - c2 * b1) / determinante;
            double y = (a1 * c2 - a2 * c1) / determinante;

            JOptionPane.showMessageDialog(null, "Ponto de interseção: (" + x + ", " + y + ")");
        }
    }
}