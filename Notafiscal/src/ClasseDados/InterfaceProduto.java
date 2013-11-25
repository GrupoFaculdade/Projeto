/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseDados;

import ClasseBasica.Produto;
import java.sql.SQLException;
import java.util.ArrayList;





/**
 *
 * @author NeGo
 */
public interface InterfaceProduto {
    
    public void cadastrar(Produto prod) throws ClassNotFoundException,SQLException ;   
    public void alterar(int codProduto, Produto prod)throws ClassNotFoundException,SQLException ;
    public void remover(int codProduto )throws ClassNotFoundException,SQLException ;
    public ArrayList<Produto> listar(String list)throws ClassNotFoundException,SQLException ;
    
}