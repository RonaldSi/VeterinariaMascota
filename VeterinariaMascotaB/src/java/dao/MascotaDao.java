/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import entidades.Mascota;
import Utilitarios.HibernateUtil;
import interfases.IMascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public class MascotaDao implements IMascota{

    @Override
    public void guardarMascota(Mascota mascota) {
        
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = sesion.beginTransaction();
        
        sesion.save(mascota);
        transaction.commit();
        sesion.close();
    }
    
    @Override
    public ArrayList<Mascota> listarMascotas(Session sesion) {
        ArrayList<Mascota> lista = new ArrayList<>();
        //Crear la consulta hacia la base de datos
        Query query = sesion.createQuery("FROM Mascota");
        
        //Ejecutar la consulta y obtener la lista
        lista = (ArrayList<Mascota>)query.list();
        
        return lista;
    
    }

    @Override
    public void actualizarMascota(Session sesion, Mascota mascota) {
        Transaction transaction = sesion.beginTransaction();
        sesion.update(mascota);
        transaction.commit();
        sesion.close();
        
    }

    @Override
    public List<Mascota> ListarRaza(Session sesion)throws Exception{
       
        String mascota = "from Mascota where Raza='Pastor Alemán'";        
        Query query = sesion.createQuery(mascota);
        List< Mascota > lista= (List< Mascota >) query.list();
	return lista;

    }

     @Override
    public List<Mascota> ListarNombre(Session session, String nombreMascota) {
          String mascota = "from Mascota where nombreMascota='"+nombreMascota+"'";        
        Query query = session.createQuery(mascota);
        List< Mascota > lista= (List< Mascota >) query.list();
	return lista;
    }

    @Override
    public Integer contarMascotas(Session sesion) throws Exception {

        String hql = "select count(*) from Mascota";
        Query query = sesion.createQuery(hql);
        Long FilasTab=(Long) query.uniqueResult();
        Integer cont=FilasTab.intValue();
        return cont;

        
    }

 
   
}
