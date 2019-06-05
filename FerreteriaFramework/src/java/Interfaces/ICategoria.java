/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Categoria;
import java.util.ArrayList;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public interface ICategoria {
    public abstract void guardar(Categoria cate);
    public abstract void actualizar(int id);
    public abstract void eliminar(int id);
    public abstract ArrayList<Categoria> listar();
}
