package exercicio_18;

import javax.swing.JOptionPane;

public class Exercicio_18 {

    public static void main(String[] args) {
        String controle, nome;
        double preco, r;
        nome = JOptionPane.showInputDialog(null, "Qual é o seu nome: ");
        preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o preço do produto: "));
        controle = JOptionPane.showInputDialog("Categoria dos rodutos: \n a - 10% \n b - 15% \n c - 20% \n d - 25% \n e - 50%");
        r = 0;
        char controleCHAR = Character.toLowerCase(controle.charAt(0));
        switch (controleCHAR) {
            case 'a' ->
                r = preco - (preco * 0.10);
            case 'b' ->
                r = preco - (preco * 0.15);
            case 'c' ->
                r = preco - (preco * 0.20);
            case 'd' ->
                r = preco - (preco * 0.25);
            case 'e' ->
                r = preco - (preco * 0.5);
            default ->
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
        if (controleCHAR >= 'a' && controleCHAR <= 'e') {
            JOptionPane.showMessageDialog(null, nome + "\n" +"O valor total a pagar é: " + r);
        }
    }
}