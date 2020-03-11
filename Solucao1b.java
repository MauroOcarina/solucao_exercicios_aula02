import javax.swing.JOptionPane;

public class Solucao1b {
   public static void main (String [] args) {
      int base = 0;
      int altura = 0;
      
      base = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da base: "));
      altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da altura: "));
      
      int area = base * altura;
      
      JOptionPane.showMessageDialog(null, "O valor da area do retangulo eh: " + area);
   }

}