import javax.swing.JOptionPane;

public class Q15 {
    public static void main(String[] args) {
        String resultado = "Os 5 primeiros números perfeitos são:\n";
        int contador = 0;
        int numero = 1;

        while (contador < 5) {
            if (ehPerfeito(numero)) {
                resultado += numero + "\n";
                contador++;
            }
            numero++;
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static boolean ehPerfeito(int numero) {
        if (numero <= 1) {
            return false;
        }

        int somaDivisores = 1;
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == numero;
    }
}