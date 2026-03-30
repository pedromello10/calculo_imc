
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int P;
        double A;
        double imc;
        P = Integer.parseInt(JOptionPane.showInputDialog("Digite seu peso (KG) : "));
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (M) : "));
        imc = P / (A * A);
        JOptionPane.showMessageDialog(null, "O resultado do seu imc é: " + imc);

    }
}
