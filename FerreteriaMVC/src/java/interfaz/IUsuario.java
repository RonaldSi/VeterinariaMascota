/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.ArrayList;
import transferObject.Usuario;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public interface IUsuario {
    public abstract ArrayList<Usuario> listarUsuarios();
    public abstract Usuario buscarUsuario(String user);
}
