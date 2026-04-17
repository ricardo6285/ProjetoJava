package com.mycompany.sistemadiabetes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
public class TelaCadastro extends JFrame {

    JTextField txtData, txtGlicose, txtTipo, txtObs;
    JButton btnSalvar;

    JTable tabela;
DefaultTableModel modelo;
JButton btnListar;
    
    public TelaCadastro() {

        setTitle("Cadastro de Medição");
        setSize(300, 420);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblData = new JLabel("Data:");
        lblData.setBounds(10, 10, 100, 25);
        add(lblData);

        txtData = new JTextField();
        txtData.setBounds(120, 10, 150, 25);
        add(txtData);

        JLabel lblGlicose = new JLabel("Glicose:");
        lblGlicose.setBounds(10, 40, 100, 25);
        add(lblGlicose);

        txtGlicose = new JTextField();
        txtGlicose.setBounds(120, 40, 150, 25);
        add(txtGlicose);

        JLabel lblTipo = new JLabel("Tipo:");
        lblTipo.setBounds(10, 70, 100, 25);
        add(lblTipo);

        txtTipo = new JTextField();
        txtTipo.setBounds(120, 70, 150, 25);
        add(txtTipo);

        JLabel lblObs = new JLabel("Obs:");
        lblObs.setBounds(10, 100, 100, 25);
        add(lblObs);

        txtObs = new JTextField();
        txtObs.setBounds(120, 100, 150, 25);
        add(txtObs);

        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(90, 150, 100, 30);
        add(btnSalvar);
        
        // BOTÃO LISTAR
btnListar = new JButton("Listar");
btnListar.setBounds(90, 190, 100, 30);
add(btnListar);

// MODELO DA TABELA
modelo = new DefaultTableModel();
modelo.addColumn("ID");
modelo.addColumn("Data");
modelo.addColumn("Glicose");
modelo.addColumn("Tipo");
modelo.addColumn("Obs");

// TABELA
tabela = new JTable(modelo);

// SCROLL (rolagem)
JScrollPane scroll = new JScrollPane(tabela);
scroll.setBounds(10, 230, 260, 150);
add(scroll);

btnListar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {

        try {
            Connection conn = Conexao.conectar();

            String sql = "SELECT * FROM medicao";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            modelo.setRowCount(0); // limpa tabela

            while (rs.next()) {
                modelo.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("data"),
                        rs.getDouble("glicose"),
                        rs.getString("tipo"),
                        rs.getString("observacao")
                });
            }

            conn.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }
});

        // AÇÃO DO BOTÃO
        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String data = txtData.getText();
                double glicose = Double.parseDouble(txtGlicose.getText());
                String tipo = txtTipo.getText();
                String obs = txtObs.getText();

                Medicao m = new Medicao(data, glicose, tipo, obs);
                SistemaDiabetes sistema = new SistemaDiabetes();

                sistema.salvarBanco(m);

                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

            }
        });
    }
}