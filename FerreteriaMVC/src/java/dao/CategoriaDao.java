/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import interfaz.ICategoria;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import transferObject.Categoria;

/**
 *
 * @author HUAMANI
 */
public class CategoriaDao implements ICategoria{

    @Override
    public String insertarCategoria(Categoria cate) {  
        String rpta="";
        //Conectarnos a la BD
        Conexion con= new Conexion();
        Connection cn = con.getConnection();
        //PregutaConnectionr si la conexion es exitosa
        // Para saber el error del insrta -> System.out.println(cn);
        if(cn!=null){
            try {
                //Llamar al procedimiento almacenado con 3 parametros
                CallableStatement cs = cn.prepareCall("CALL sp_insertarcategoria(?,?,?)");
                cs.setInt(1, cate.getIdCategoria());
                cs.setString(2, cate.getDescripcion());
                cs.setString(3, String.valueOf(cate.getEstado()));
                int res = cs.executeUpdate();
                //Si eres es uno quiere decir que se ha insertado
                if(res==1){
                    rpta="Se inserto correctamente";
                }else{
                    rpta="No se pudo insertar";
                }      
            } catch (SQLException ex) {
                System.out.println("error"+ex);
            }finally{
                try {
                    cn.close();
                } catch (SQLException ex) {
                   System.out.println("error"+ex);
                }
            }
        }
        return rpta;
    }
    
    @Override
    public ArrayList<Categoria> listarCategorias() {
        ArrayList<Categoria> lista = new ArrayList<>();
        String procedimientoAlmacenado = "{CALL sp_listarcategorias()}";
        // Conectandonos a la BD
        Conexion con = new Conexion();
        Connection cn=con.getConnection();
        // cn es null si no logra conectarse
        if(cn!=null){
            
            try {
                //
                CallableStatement cs = cn.prepareCall(procedimientoAlmacenado);
                ResultSet rs = cs.executeQuery();
                while(rs.next()){
                    Categoria cate= new Categoria();
                    cate.setIdCategoria(rs.getInt("idCategoria"));
                    cate.setDescripcion(rs.getString("descripcion"));
                    cate.setEstado(rs.getString("estado").charAt(0));
                    lista.add(cate);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        return lista;
        
    }

    @Override
    public String actualizarCatergoria(Categoria cate) {
       String rpta="";
       Conexion con = new Conexion();
       Connection cn = con.getConnection();
       //Pregutar si la conexion es exitosa
        if(cn!=null){
           try {
               CallableStatement cs = cn.prepareCall("CALL sp_actualizarcategoria(?,?,?)");
               cs.setInt(1, cate.getIdCategoria());
               cs.setString(2, cate.getDescripcion());
               cs.setString(3, String.valueOf(cate.getEstado()));
               int res = cs.executeUpdate();
               
               if(res==1){
                   rpta="Se ha actualizado correctamente";
               }else{
                   rpta="No se pudo actualizar";
               }
           } catch (SQLException ex) {
               System.out.println("error"+ex);
           }finally{
               try {
                   cn.close();
               } catch (SQLException ex) {
                   System.out.println("error"+ex);
               }
           }
        }
      
        return rpta;
    }

    @Override
    public String eliminarCategoria(int id) {
      String rpta="";
      Conexion con = new Conexion();
      Connection cn = con.getConnection();
      if(cn!=null){
          try {
              CallableStatement cs = cn.prepareCall("CALL sp_eliminarcategoria");
              cs.setInt(1, id);
              int res = cs.executeUpdate();
              if(res==1){
                  rpta="Se elimino correctamente";
              }else{
                  rpta="No se pudo eliminar";
              }
              
          } catch (SQLException ex) {
              
          }finally{
              try {
                  cn.close();
              } catch (SQLException ex) {
                  
              }
          }
      }
        return rpta;  
     
    }
}
