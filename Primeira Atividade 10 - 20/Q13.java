import javax.swing.JOptionPane;

public class Q13 {
    public static void main(String[] args) {
        String resultado = "Intervalo de 1000 a 1999: \n";

        for (int numero = 1000; numero <= 1999; numero++) {
            if (numero % 11 == 5) {
                resultado += numero + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}