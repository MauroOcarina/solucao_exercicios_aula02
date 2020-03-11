import javax.swing.JOptionPane;

public class Solucao2a {
   public static void main (String [] args) {
      int numeroInteiro = 0;
      
      numeroInteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero a ser elevado: "));
      
      JOptionPane.showMessageDialog(null, "O valor elevado eh: " + Math.pow(numeroInteiro, 2.0));
   }

}