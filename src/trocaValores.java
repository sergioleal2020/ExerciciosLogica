import javax.swing.JOptionPane;

public class trocaValores {

    public static void main (String args[])
    {

        int A, B, Auxiliar;
        A= 10;
        B =20;

        JOptionPane.showMessageDialog(null,"antes da troca : \nA = "+A+"  e \nB = "+B);
        Auxiliar = A;
        A  =B;
        B =Auxiliar;

        JOptionPane.showMessageDialog(null,"DEPOIS DA troca : \nA = "+A+"  e \nB = "+B);

    }


}


