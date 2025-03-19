import javax.swing.JOptionPane;

public class Q19 {
    public static void main(String[] args) {
        int primeiro = 1;
        int segundo = 1;
        String resultado = "Os 15 primeiros números de Fibonacci são:\n" + primeiro + " " + segundo + " ";

        for (int i = 3; i <= 15; i++) {
            int proximo = primeiro + segundo;
            resultado += proximo + " ";
            primeiro = segundo;
            segundo = proximo;
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}