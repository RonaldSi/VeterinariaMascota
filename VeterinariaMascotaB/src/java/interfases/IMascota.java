/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfases;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public interface IMascota {
    
  public abstract void guardarMascota(Mascota mascota);
  public abstract ArrayList<Mascota> listarMascotas (Session sesion);
  public abstract  void actualizarMascota (Session sesion,Mascota mascota);
  public abstract List<Mascota> ListarRaza(Session sesion)throws Exception;
  public abstract List<Mascota> ListarNombre(Session session,String nombreMascota);
  public abstract Integer contarMascotas(Session sesion)throws Exception;
  
}
