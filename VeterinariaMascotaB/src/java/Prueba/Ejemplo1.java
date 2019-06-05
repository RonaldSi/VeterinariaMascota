/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import entidades.Mascota;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    
    /*REGISTRAR EN LA BASE DE DATOS LA INFORMACIÓN DE UNA MASCOTA*/
    public static void main(String[] args) {
        
        MascotaDao mascotadao = new MascotaDao();
        Mascota mascota = new Mascota(2,"Sandor","Juan","chiwawa");
        
        mascotadao.guardarMascota(mascota);
    }
    
}
