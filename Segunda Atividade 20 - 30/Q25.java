import javax.swing.JOptionPane;

public class Q25 {
    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog("Digite o coeficiente a da reta:");
        double a = Double.parseDouble(inputA);

        String inputB = JOptionPane.showInputDialog("Digite o coeficiente b da reta:");
        double b = Double.parseDouble(inputB);

        String inputC = JOptionPane.showInputDialog("Digite o termo independente c da reta:");
        double c = Double.parseDouble(inputC);

        String inputX = JOptionPane.showInputDialog("Digite o valor de x:");
        double x = Double.parseDouble(inputX);

        String inputY = JOptionPane.showInputDialog("Digite o valor de y:");
        double y = Double.parseDouble(inputY);

        if (a * x + b * y == c) {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") pertence à reta " + a + "x + " + b + "y = " + c + ".");
        } else {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") não pertence à reta " + a + "x + " + b + "y = " + c + ".");
        }
    }
}