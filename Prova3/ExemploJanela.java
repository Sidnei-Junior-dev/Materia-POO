
/*
 * String nome = JOptionPane.showInputDialog("Digite seu nome:");
 * JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
 */

import javax.swing.*;

public class ExemploJanela {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo de JFrame");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);

        JPanel painel = new JPanel();
        JLabel label = new JLabel("Digite seu nome:");
        JTextField campo = new JTextField(20);

        painel.add(label);
        painel.add(campo);

        janela.add(painel);
        janela.setVisible(true);
    }
}
/*
 * JFrame - Janela principal do aplicativo
 * JPanel - Painel de organização de componentes
 * JLabel - Exibição de texto não editável
 * JTextField - Campo de texto de entrada
 * JComboBox - Lista suspensa de opções
 * JTable - Tabela para exibição de dados em linhas e colunas
 * JButton - Botão que executa uma ação ao ser clicado
 */

