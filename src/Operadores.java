
import javax.swing.JOptionPane;

public class  Operadores {


        public static void main(String args [] )

        {

            float num1, num2, soma, divisao, multiplicacao, subtracao;
            num1 = 10;
            num2 = 5;

            soma = num1 + num2;
            divisao = num1 / num2;
            subtracao = num1 - num2;
            multiplicacao = num1 * num2;

            JOptionPane.showMessageDialog(null, "soma e =" + soma);
            JOptionPane.showMessageDialog(null, "divisão e =" + divisao);
            JOptionPane.showMessageDialog(null, "subtracao e =" + subtracao);
            JOptionPane.showMessageDialog(null, "multiplicação e =" + multiplicacao);


        }

    }