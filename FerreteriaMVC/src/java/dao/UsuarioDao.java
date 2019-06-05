/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import interfaz.IUsuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import transferObject.Usuario;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public class UsuarioDao implements IUsuario{

    @Override
    public ArrayList<Usuario> listarUsuarios() {
        ArrayList<Usuario> lista = new ArrayList<>();
        
        return lista;
    }

    @Override
    public Usuario buscarUsuario(String user) {
       Usuario usuario = new Usuario();
       Conexion con = new Conexion();
       Connection cn = con.getConnection();
       if(cn!=null){
           try {
               CallableStatement cs = cn.prepareCall("CALL sp_buscarusuariopornombre(?)");
               cs.setString(1, user);
               cs.executeQuery();
           } catch (SQLException ex) {
               
           }
       }
    return usuario;
    }
}

    
