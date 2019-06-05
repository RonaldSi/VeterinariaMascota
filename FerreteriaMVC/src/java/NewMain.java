
import dao.CategoriaDao;
import java.util.ArrayList;
import transferObject.Categoria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CategoriaDao catedao = new CategoriaDao();
        ArrayList<Categoria> lista = new ArrayList<>(); //Declarar la lista
      /*Categoria cate = new Categoria();
        cate.setIdCategoria(1);
        cate.setDescripcion("Metal");
        cate.setEstado('C');
        catedao.insertarCategoria(cate); */
      
      lista = catedao.listarCategorias();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Dato:"+lista.get(i).getDescripcion());
        }
    }
    
}
