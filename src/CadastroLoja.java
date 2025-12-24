   import javax.swing.*;
import java.awt.*;

    
    
    public class CadastroLoja extends JFrame {
panel.add(new JLabel("Valor da Compra:"), gbc);
gbc.gridx = 1;
txtValor = new JTextField(20);
panel.add(txtValor, gbc);
y++;


// Descrição
gbc.gridx = 0; gbc.gridy = y;
panel.add(new JLabel("Descrição:"), gbc);
gbc.gridx = 1;
txtDescricao = new JTextArea(4, 20);
panel.add(new JScrollPane(txtDescricao), gbc);
y++;


// Tipo de pagamento
gbc.gridx = 0; gbc.gridy = y;
panel.add(new JLabel("Pagamento:"), gbc);
gbc.gridx = 1;
cbPagamento = new JComboBox<>(new String[]{"Dinheiro", "Cartão Crédito", "Cartão Débito", "PIX"});
panel.add(cbPagamento, gbc);
y++;


// Botões
gbc.gridx = 0; gbc.gridy = y;
btnSalvar = new JButton("Salvar");
panel.add(btnSalvar, gbc);


gbc.gridx = 1;
btnLimpar = new JButton("Limpar");
panel.add(btnLimpar, gbc);


add(panel);


// Ações
btnSalvar.addActionListener(e -> salvarDados());
btnLimpar.addActionListener(e -> limparCampos());
}


private void salvarDados() {
String dados = "Nome: " + txtNome.getText() + "\n" +
"Documento: " + txtDocumento.getText() + "\n" +
"Endereço: " + txtEndereco.getText() + "\n" +
"Telefone: " + txtTelefone.getText() + "\n" +
"Data da Compra: " + txtDataCompra.getText() + "\n" +
"Valor: " + txtValor.getText() + "\n" +
"Descrição: " + txtDescricao.getText() + "\n" +
"Pagamento: " + cbPagamento.getSelectedItem();


JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!\n\n" + dados);
}


private void limparCampos() {
txtNome.setText("");
txtDocumento.setText("");
txtEndereco.setText("");
txtTelefone.setText("");
txtDataCompra.setText("");
txtValor.setText("");
txtDescricao.setText("");
cbPagamento.setSelectedIndex(0);
}
    
    


public class CadastroCliente extends JFrame {

    public CadastroCliente() {
        setTitle("Cadastro de Cliente - Loja de Roupas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new JLabel("Tela funcionando!"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }
}

    
}
