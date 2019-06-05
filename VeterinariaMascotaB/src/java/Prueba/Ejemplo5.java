/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import entidades.Mascota;
import Utilitarios.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    
    /*ENCONTRAR DE LA BASE DE DATOS LA INFORMACIÓN DE LA MASCOTA CUYO NOMBRE SEA: “SANDOR”*/
    public static void main(String[] args) {
        
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        MascotaDao mascotadao = new MascotaDao();
        List<Mascota> lista = mascotadao.ListarNombre(sesion, "Sandor");
        for (Mascota mascota : lista) {
            System.out.println(mascota.getNombreCliente()+" es el dueño del perro "+
                    mascota.getNombreMascota());
        }
        

    }

}
