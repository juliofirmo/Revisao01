/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionarioDAO;
import java.util.List;
import javax.swing.JOptionPane;

public class JanelaFuncionario {

    public void menuFuncionario(List<Funcionario> funcionarios) {

        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: "
                    + "\n1 - Inserir"
                    + "\n2 - Excluir"
                    + "\n3 - Alterar"
                    + "\n4 - Buscar "
                    + "\n5 - Listar "
                    + "\n6 -  Sair "));

            switch (opcao) {

                case 1:
                    adicionaFuncionario(funcionarios);
                    break;
                case 2:
                    removeFuncionario(funcionarios);
                    break;
                case 3:
                    alteraFuncionario(funcionarios);
                    break;
                case 4:
                    break;
                case 5:
                    listaFuncionarios(funcionarios);
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Vc digitou uma opção incorreta");


            }
        } while (opcao != 6);
    }

    void adicionaFuncionario(List<Funcionario> funcionarios) {
        Funcionario f = new Funcionario();
        f.setNome(JOptionPane.showInputDialog("Informe o noe do Funcionario"));
        f.setDataNascimento(JOptionPane.showInputDialog("Insira data de nascimento"));
        f.setRg(JOptionPane.showInputDialog("Digite seu rg"));
        f.setCpf(JOptionPane.showInputDialog("Digite seu cpf"));
        f.setCargo(JOptionPane.showInputDialog("Informe o cargo do funcionário"));
        f.setEndereco(JOptionPane.showInputDialog("Digite seu endereço"));
        f.setTelefone(JOptionPane.showInputDialog("Digite seu telefone"));
        f.setDataCadastro(JOptionPane.showInputDialog("Digite seu data cadastro"));
        f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu Salario")));
        f.setDataAdmissao(JOptionPane.showInputDialog("Digite sua data de admissão"));;
        f.setCtps(JOptionPane.showInputDialog("Digite seu ctps: "));
        f.setCargo(JOptionPane.showInputDialog("Digite seu cargo: "));


        FuncionarioDAO dao = new FuncionarioDAO();
        dao.adicionar(f, funcionarios);



    }

    private void listaFuncionarios(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.listar(funcionarios);

    }

    private void removeFuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog("Informe o numero de funcionario a ser excluido");
        dao.excluir(nome, funcionarios);

    }

    private void alteraFuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário a ser alterado:  ");

        Funcionario fAltera = new Funcionario();

        fAltera = dao.buscaFuncionarioByNome(nome, funcionarios);
        if (fAltera != null) {
            fAltera.setNome(JOptionPane.showInputDialog("Insira o nome", fAltera.getNome()));
            fAltera.setDataNascimento(JOptionPane.showInputDialog("Insira data de nascimento", fAltera.getDataNascimento()));
            fAltera.setRg(JOptionPane.showInputDialog("Digite seu rg", fAltera.getRg()));
            fAltera.setCpf(JOptionPane.showInputDialog("Digite seu cpf", fAltera.getCpf()));
            fAltera.setCargo(JOptionPane.showInputDialog("Informe o cargo do funcionário", fAltera.getCargo()));
            fAltera.setEndereco(JOptionPane.showInputDialog("Digite seu endereço", fAltera.getEndereco()));
            fAltera.setTelefone(JOptionPane.showInputDialog("Digite seu telefone", fAltera.getTelefone()));
            fAltera.setDataCadastro(JOptionPane.showInputDialog("Digite seu data cadastro", fAltera.getDataCadastro()));
            fAltera.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu Salario", fAltera.getSalario())));
            fAltera.setDataAdmissao(JOptionPane.showInputDialog("Digite sua data de admissão", fAltera.getDataAdmissao()));;
            fAltera.setCtps(JOptionPane.showInputDialog("Digite seu ctps: ", fAltera.getCtps()));
            fAltera.setCargo(JOptionPane.showInputDialog("Digite seu cargo: ", fAltera.getCargo()));


            dao.altera(nome, funcionarios, fAltera);

        } else {

            JOptionPane.showMessageDialog(null, "Funcionario" + nome + "Nao existente");
        }
    }
}
