package com.mycompany.sistemadiabetes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;

public class SistemaDiabetes {

    ArrayList<Medicao> lista = new ArrayList<>();

    public void adicionar(Medicao m) {
        lista.add(m);
    }

    public void listar() {
        for (Medicao m : lista) {
            m.exibir();
        }
    }

    public void media() {
        double soma = 0;

        for (Medicao m : lista) {
            soma += m.glicose;
        }

        if (lista.size() > 0) {
            System.out.println("Média: " + (soma / lista.size()));
        } else {
            System.out.println("Nenhuma medição.");
        }
    }
public void salvarBanco(Medicao m) {

        try {
            Connection conn = Conexao.conectar();

            String sql = "INSERT INTO medicao (data, glicose, tipo, observacao) VALUES (?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, m.data);
            stmt.setDouble(2, m.glicose);
            stmt.setString(3, m.tipo);
            stmt.setString(4, m.observacao);

            stmt.execute();
            stmt.close();
            conn.close();

            System.out.println("✅ Salvo no banco!");

        } catch (Exception e) {
            System.out.println("❌ Erro ao salvar: " + e);
        }
    }
public void listarBanco() {

    try {
        Connection conn = Conexao.conectar();

        String sql = "SELECT * FROM medicao";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Data: " + rs.getString("data"));
            System.out.println("Glicose: " + rs.getDouble("glicose"));
            System.out.println("Tipo: " + rs.getString("tipo"));
            System.out.println("Obs: " + rs.getString("observacao"));
            System.out.println("------------------------");
        }

        conn.close();

    } catch (Exception e) {
        System.out.println("❌ Erro ao buscar: " + e);
    }
}
public void deletar(int id) {

    try {
        Connection conn = Conexao.conectar();

        String sql = "DELETE FROM medicao WHERE id = ?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);

        int linhas = stmt.executeUpdate();

        if (linhas > 0) {
            System.out.println("✅ Registro deletado!");
        } else {
            System.out.println("⚠️ ID não encontrado.");
        }

        stmt.close();
        conn.close();

    } catch (Exception e) {
        System.out.println("❌ Erro ao deletar: " + e);
    }
}
public void atualizar(int id, Medicao m) {

    try {
        Connection conn = Conexao.conectar();

        String sql = "UPDATE medicao SET data = ?, glicose = ?, tipo = ?, observacao = ? WHERE id = ?";

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, m.data);
        stmt.setDouble(2, m.glicose);
        stmt.setString(3, m.tipo);
        stmt.setString(4, m.observacao);
        stmt.setInt(5, id);

        int linhas = stmt.executeUpdate();

        if (linhas > 0) {
            System.out.println("✅ Registro atualizado!");
        } else {
            System.out.println("⚠️ ID não encontrado.");
        }

        stmt.close();
        conn.close();

    } catch (Exception e) {
        System.out.println("❌ Erro ao atualizar: " + e);
    }
}
}