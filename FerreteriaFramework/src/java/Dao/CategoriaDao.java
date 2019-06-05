/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Categoria;
import Interfaces.ICategoria;
import Utilitarios.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
/*
public class CategoriaDao implements ICategoria{

    @Override
    public void guardar(Categoria cate) {
       
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion =session.beginTransaction();
        
        session.save(cate);
        transaccion.commit();
        
        session.close();
        
    }

    @Override
    public void actualizar(int id) {
       
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion =session.beginTransaction();
    }

    @Override
    public void eliminar(int id) {
        
    }

    @Override
    public ArrayList<Categoria> listar() {
        
    
}
}
*/