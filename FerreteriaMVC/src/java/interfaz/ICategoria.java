/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.ArrayList;
import transferObject.Categoria;

/**
 *
 * @author HUAMANI
 */
public interface ICategoria {
    public abstract String insertarCategoria(Categoria cate);
    public abstract ArrayList<Categoria> listarCategorias();
    public abstract String actualizarCatergoria(Categoria cate);
    public abstract String eliminarCategoria(int id);
    
}
