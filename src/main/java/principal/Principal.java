package principal;

import javax.swing.JOptionPane;

import senha.Senha;

public class Principal {

    public static void main(String[] args) {

        String opcao = "";
        Senha senha = new Senha();
        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura da senha \n2 - É valida \n9 - Sair");
            switch (Integer.parseInt(opcao)) {
                case 1:
                    senha.setSenha(JOptionPane.showInputDialog("Digite a senha"));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "É válida: " + senha.eValida());
                    break;                
                case 9:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Alternativa inválida!");
                    break;
            }
        }
    }
}
