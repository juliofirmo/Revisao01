/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */ 
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/** Classe que guarda as informacões referentes aos funcionarios 
 *
 * @author julio_firmo
 * add um func no vetor dos func
 */
public class FuncionarioDAO {
    
    //Vetor dinamico para armazenar os funcionarios cadastrados.
    
    private List<Funcionario> funcionario = new ArrayList <> ();
    
    public void adicionar (Funcionario f ){
        funcionario.add(f);
        JOptionPane.showMessageDialog (null, "Funcionario"
                + "adicionado com sucesso");
        
    
            }    
}
