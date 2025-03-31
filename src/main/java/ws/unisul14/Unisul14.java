

package ws.unisul14;
import javax.swing.JOptionPane;
public class Unisul14 {

    public static void main(String[] args) {
        int nasc = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano que você nasceu?"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano em que estamos?"));
        int idade;
        if (nasc < ano) {
            idade = ano - nasc;
            JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
        }
    }
}
