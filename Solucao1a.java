import javax.swing.JOptionPane;

public class Solucao1a {
   public static void main (String [] args) {
      int idade = 0;
      int ano = 365;
      
      idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

      int total = idade * ano;
      
      JOptionPane.showMessageDialog(null, "A quantidade de dias aproximadamente eh: " + total);
   }

}