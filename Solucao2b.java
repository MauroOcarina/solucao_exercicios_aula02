import javax.swing.JOptionPane;

public class Solucao2b {
   public static void main (String [] args) {
      String primeiraString = "";
      String segundaString = "";
      String terceiraString = "";
      
      primeiraString = JOptionPane.showInputDialog("Digite a primeira palavra: ");
      segundaString = JOptionPane.showInputDialog("Digite a segunda palavra: ");
      terceiraString = JOptionPane.showInputDialog("Digite a terceira palavra: ");
      
      int soma = 0;
      
      int aux1 = primeiraString.length();
      int aux2 = segundaString.length();
      int aux3 = terceiraString.length();
      
      
      soma = aux1 + aux2 + aux3;
      
      JOptionPane.showMessageDialog(null, "O total de caracteres eh: " + soma);
   }

}