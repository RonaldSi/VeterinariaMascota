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
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    
    /*LISTAR DE LA BASE DE DATOS LA INFORMACIÓN DE LAS MASCOTAS CUYA RAZA SEA: “PASTOR ALEMÁN”.
*/
    public static void main(String[] args) throws Exception {
        
        List<Mascota> lista = new ArrayList<>();

        MascotaDao mascotadao = new MascotaDao();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        lista = (ArrayList<Mascota>) mascotadao.ListarRaza(sesion);

        for (Mascota mascota : lista) {
            System.out.println("Nombre de mi Mascota es: " + mascota.getNombreMascota()+" y la raza es "+mascota.getRaza());
                  }
    }

}
