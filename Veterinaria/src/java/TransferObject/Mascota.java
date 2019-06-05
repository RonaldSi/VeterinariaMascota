/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransferObject;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public class Mascota {
    private int Mascota;
    private String NombreMascota;
    private String Raza;
    private String Observaciones;
    private int IdCliente;

    public int getMascota() {
        return Mascota;
    }

    public void setMascota(int Mascota) {
        this.Mascota = Mascota;
    }

    public String getNombreMascota() {
        return NombreMascota;
    }

    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }
    
}
