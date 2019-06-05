/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import entidades.Mascota;
import Utilitarios.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    
    /*ACTUALIZAR EN LA BASE DE DATOS LA INFORMACIÓN DE UNA MASCOTA*/
    public static void main(String[] args) {
        // TODO code application logic here

        MascotaDao mascotadao = new MascotaDao();
        Session sesion = HibernateUtil.getSessionFactory().openSession();

        Mascota mascota = new Mascota(3, "chiwawa", "Huamani", "Pastor Aleman");
        mascotadao.actualizarMascota(sesion, mascota);
      

    }

}
