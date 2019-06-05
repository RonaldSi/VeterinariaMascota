/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import entidades.Mascota;
import Utilitarios.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    
    /*LISTAR DESDE LA BASE DE DATOS LA INFORMACIÓN DE TODAS LAS  MASCOTAS*/
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Mascota> lista = new ArrayList<>();
        MascotaDao mascotadao = new MascotaDao();      
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        
        lista = mascotadao.listarMascotas(sesion);
        
        for(Mascota mascota : lista){
            System.out.println("Nombre de Mascota : "+mascota.getNombreMascota());
        }
    }
    
}
