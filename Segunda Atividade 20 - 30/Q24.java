import javax.swing.JOptionPane;

public class Q24 {
    public static void main(String[] args) {
        String inputX = JOptionPane.showInputDialog("Digite o valor de x:");
        double x = Double.parseDouble(inputX);

        String inputY = JOptionPane.showInputDialog("Digite o valor de y:");
        double y = Double.parseDouble(inputY);

        if (2 * x + y == 3) {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") pertence à reta 2x + y = 3.");
        } else {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") não pertence à reta 2x + y = 3.");
        }
    }
}