/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferObject;

/**
 *
 * @author RONALD SILVA GUTIERR
 */
public class Usuario {
    private int idUsuario;
    private String user;
    private String password;
    private char state;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }
    
}