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
public class Cliente {
    private int Cliente;
    private String Nombres;
    private String Apellidos;
    private String Telefono;

    public int getCliente() {
        return Cliente;
    }

    public void setCliente(int Cliente) {
        this.Cliente = Cliente;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}
