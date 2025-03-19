import javax.swing.JOptionPane;

public class Q29 {
    public static void main(String[] args) {
        String inputChar = JOptionPane.showInputDialog("Digite um caractere maiúsculo:");
        char caractere = inputChar.charAt(0);

        if (caractere >= 'A' && caractere <= 'Z') {
            if (caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
                JOptionPane.showMessageDialog(null, "VOGAL");
            } else {
                JOptionPane.showMessageDialog(null, "CONSOANTE");
            }
        } else {
            JOptionPane.showMessageDialog(null, "OUTRO");
        }
    }
}