import javax.swing.JOptionPane;

public class Q14 {
    public static void main(String[] args) {
        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturaMulheres = 0;
        int contadorMulheres = 0;
        double somaAlturaTurma = 0;

        for (int i = 0; i < 5; i++) {
            String inputAltura = JOptionPane.showInputDialog("Digite a altura da " + (i + 1) + "ª pessoa:");
            String inputSexo = JOptionPane.showInputDialog("Digite o sexo da " + (i + 1) + "ª pessoa (M/F):");

            double altura = Double.parseDouble(inputAltura);
            char sexo = inputSexo.toUpperCase().charAt(0);

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }

            somaAlturaTurma += altura;

            if (sexo == 'F') {
                somaAlturaMulheres += altura;
                contadorMulheres++;
            }
        }

        double mediaAlturaMulheres = (contadorMulheres > 0) ? somaAlturaMulheres / contadorMulheres : 0;
        double mediaAlturaTurma = somaAlturaTurma / 5;

        String resultado = "Maior altura: " + maiorAltura + "\n" +
                           "Menor altura: " + menorAltura + "\n" +
                           "Média altura das mulheres: " + mediaAlturaMulheres + "\n" +
                           "Média altura da turma: " + mediaAlturaTurma;

        JOptionPane.showMessageDialog(null, resultado);
    }
}