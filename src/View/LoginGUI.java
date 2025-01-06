// ===========================
// VIEW - LoginGUI
// ===========================

package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginGUI extends JFrame {
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JButton btnEntrar,btnLimpar;

    public LoginGUI(){
        setTitle("Login - Sistema de Gerenciamento");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);

        // Fonte
        Font font = new Font("Consolas", Font.PLAIN, 16);

        // Componentes estilizados
        JLabel lblLogin = new JLabel("LOGIN:");
        lblLogin.setFont(font);
        lblLogin.setForeground(Color.WHITE);
        JLabel lblSenha = new JLabel("SENHA:");
        lblSenha.setFont(font);
        lblSenha.setForeground(Color.WHITE);

        txtLogin = new JTextField(15);
        txtSenha = new JPasswordField(15);

        txtLogin.setBackground(Color.DARK_GRAY);
        txtLogin.setForeground(Color.WHITE);
        txtLogin.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        txtSenha.setBackground(Color.DARK_GRAY);
        txtSenha.setForeground(Color.WHITE);
        txtSenha.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        btnEntrar = new JButton("ENTRAR");
        btnLimpar = new JButton("LIMPAR");

        // Estilo dos botões
        btnEntrar.setBackground(Color.WHITE);
        btnEntrar.setForeground(Color.BLACK);
        btnLimpar.setBackground(Color.WHITE);
        btnLimpar.setForeground(Color.BLACK);

        btnEntrar.setFocusPainted(false);
        btnLimpar.setFocusPainted(false);

        // Layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblLogin, gbc);
        gbc.gridx = 1;
        add(txtLogin, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblSenha, gbc);
        gbc.gridx = 1;
        add(txtSenha, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(btnEntrar, gbc);
        gbc.gridx = 1;
        add(btnLimpar, gbc);

        // Ações dos botões
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = txtLogin.getText();
                String senha = new String(txtSenha.getPassword());
                if ("user".equals(login) && "12345".equals(senha)) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                    new CursoGUI().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLogin.setText("");
                txtSenha.setText("");
            }
        });
    }
}

