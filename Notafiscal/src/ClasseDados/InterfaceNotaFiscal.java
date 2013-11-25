/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseDados;

import ClasseBasica.Notaf;
import java.sql.SQLException;

/**
 *
 * @author NeGo
 */
public interface InterfaceNotaFiscal {
    public void listar(int codNotaFiscal) throws ClassNotFoundException, SQLException;
    public void remover(int codNotaFiscal)throws ClassNotFoundException, SQLException;
    public void alterar(int codNotaFiscal, Notaf notaf)throws ClassNotFoundException, SQLException;
    
}
