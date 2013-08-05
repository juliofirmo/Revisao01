/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que guarda as informacões referentes aos funcionarios
 *
 * @author julio_firmo add um func no vetor dos func
 */
public class FuncionarioDAO {

    public void adicionar(Funcionario f,
            List<Funcionario> funcionarios) {
        funcionarios.add(f);
        JOptionPane.showMessageDialog(null, "Funcionario"
                + "adicionado com sucesso");


    }

    public void listar(List<Funcionario> funcionarios) {
        String msg = "";
        for (Funcionario f : funcionarios) {

            msg = msg + "\n\nNome: " + f.getNome() + f.getDataNascimento()
                    + "\nRG: " + f.getRg() + "\nCPRF: " + f.getCpf() + "\nEndereço: " + f.getEndereco()
                    + "\nTelefone: " + f.getTelefone() + "\nData de Cadastro: " + f.getDataCadastro()
                    + "\nSalario: " + f.getSalario() + "\nData de Admissão: " + f.getDataAdmissao()
                    + "\nCtps: " + f.getCtps() + "\nCargo: " + f.getCargo();

        }
        JOptionPane.showMessageDialog(null, msg);
    }

    public void excluir(String nome,
            List<Funcionario> funcionarios) {
        Funcionario fRemove = null;
        for (Funcionario f : funcionarios) {
            if (f.getNome().equals (nome)){
                fRemove = f;
            }
        }
        funcionarios.remove (fRemove);
        }
    }
