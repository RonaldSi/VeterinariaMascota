/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.CategoriaDao;
import Entidades.Categoria;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CategoriaDao catedao = new CategoriaDao();
        
        Categoria cate = new Categoria(1, "Cemento", 'A');
        catedao.guardar(cate);
    }
    
}
