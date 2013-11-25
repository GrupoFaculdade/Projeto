/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseDados;

import ClasseBasica.ItensNota;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public interface InterfaceIntensNota {
    
    public void cadastrar( ItensNota intensNot) throws ClassNotFoundException,SQLException,Exception;
    public void alterar(ItensNota intensNot) throws ClassNotFoundException,SQLException,Exception;
    public void remover(ItensNota intensNot) throws ClassNotFoundException,SQLException,Exception;
    public ArrayList<ItensNota> listar(ItensNota intensNot) throws ClassNotFoundException,SQLException,Exception;
}
