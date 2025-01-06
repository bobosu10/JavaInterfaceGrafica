// ===========================
// VIEW - CursoGUI
// ===========================

package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Tela de Cadastro de Cursos.
 */
public class CursoGUI extends JFrame {
    private JTextField txtCodigo, txtNome, txtCargaHoraria, txtCoordenador;
    private JComboBox<String> comboArea;
    private JButton btnEnviar, btnLimpar;
    private JTable tabelaCursos;
    private DefaultTableModel modeloTabela;

    public CursoGUI() {
        setTitle("Cadastro de Curso - Sistema de Gerenciamento");
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);

        // Painel de formulário
        JPanel painelFormulario = new JPanel(new GridLayout(6, 2, 10, 10));
        painelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        painelFormulario.setBackground(Color.BLACK);

        JLabel lblCodigo = new JLabel("CÓDIGO:");
        JLabel lblNome = new JLabel("NOME:");
        JLabel lblCargaHoraria = new JLabel("CARGA HORÁRIA:");
        JLabel lblCoordenador = new JLabel("COORDENADOR:");
        JLabel lblArea = new JLabel("ÁREA:");

        lblCodigo.setForeground(Color.WHITE);
        lblNome.setForeground(Color.WHITE);
        lblCargaHoraria.setForeground(Color.WHITE);
        lblCoordenador.setForeground(Color.WHITE);
        lblArea.setForeground(Color.WHITE);

        lblCodigo.setFont(new Font("Consolas", Font.PLAIN, 16));
        lblNome.setFont(new Font("Consolas", Font.PLAIN, 16));
        lblCargaHoraria.setFont(new Font("Consolas", Font.PLAIN, 16));
        lblCoordenador.setFont(new Font("Consolas", Font.PLAIN, 16));
        lblArea.setFont(new Font("Consolas", Font.PLAIN, 16));

        txtCodigo = new JTextField();
        txtNome = new JTextField();
        txtCargaHoraria = new JTextField();
        txtCoordenador = new JTextField();
        comboArea = new JComboBox<>(new String[]{"Ciências Exatas", "Ciências Biológicas", "Ciências Humanas"});

        txtCodigo.setBackground(Color.DARK_GRAY);
        txtCodigo.setForeground(Color.WHITE);
        txtCodigo.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        txtNome.setBackground(Color.DARK_GRAY);
        txtNome.setForeground(Color.WHITE);
        txtNome.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        txtCargaHoraria.setBackground(Color.DARK_GRAY);
        txtCargaHoraria.setForeground(Color.WHITE);
        txtCargaHoraria.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        txtCoordenador.setBackground(Color.DARK_GRAY);
        txtCoordenador.setForeground(Color.WHITE);
        txtCoordenador.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        comboArea.setBackground(Color.DARK_GRAY);
        comboArea.setForeground(Color.WHITE);
        comboArea.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        painelFormulario.add(lblCodigo);
        painelFormulario.add(txtCodigo);
        painelFormulario.add(lblNome);
        painelFormulario.add(txtNome);
        painelFormulario.add(lblCargaHoraria);
        painelFormulario.add(txtCargaHoraria);
        painelFormulario.add(lblCoordenador);
        painelFormulario.add(txtCoordenador);
        painelFormulario.add(lblArea);
        painelFormulario.add(comboArea);

        btnEnviar = new JButton("ENVIAR");
        btnEnviar.setBackground(Color.WHITE);
        btnEnviar.setForeground(Color.BLACK);
        btnEnviar.setFocusPainted(false);

        btnLimpar = new JButton("LIMPAR");
        btnLimpar.setBackground(Color.WHITE);
        btnLimpar.setForeground(Color.BLACK);
        btnLimpar.setFocusPainted(false);

        painelFormulario.add(btnEnviar);
        painelFormulario.add(btnLimpar);

        add(painelFormulario, BorderLayout.NORTH);


        // Tabela de cursos
        modeloTabela = new DefaultTableModel(new Object[]{"Código", "Nome", "Carga Horária", "Coordenador", "Área"}, 0);
        tabelaCursos = new JTable(modeloTabela);
        tabelaCursos.setRowHeight(30);
        tabelaCursos.setFont(new Font("SansSerif", Font.PLAIN, 18));
        tabelaCursos.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 18));
        tabelaCursos.getTableHeader().setBackground(Color.DARK_GRAY);
        tabelaCursos.getTableHeader().setForeground(Color.WHITE);

        add(new JScrollPane(tabelaCursos), BorderLayout.CENTER);


        // Ações dos botões
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtCodigo.getText().isEmpty() || txtNome.getText().isEmpty() || txtCargaHoraria.getText().isEmpty() || txtCoordenador.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    modeloTabela.addRow(new Object[]{
                            txtCodigo.getText(),
                            txtNome.getText(),
                            txtCargaHoraria.getText(),
                            txtCoordenador.getText(),
                            comboArea.getSelectedItem()
                    });
                    JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
                }
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCodigo.setText("");
                txtNome.setText("");
                txtCargaHoraria.setText("");
                txtCoordenador.setText("");
                comboArea.setSelectedIndex(0);
            }
        });
    }
}


