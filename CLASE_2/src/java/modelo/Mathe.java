
package modelo;


public class Mathe {
    public boolean esPrimo(int numero){
        boolean respuesta=false;
        for (int i = 2; i < numero; i++){
            if(numero%i==0){
                respuesta=false;
                break;
            }else{
                respuesta=true;
            }
        }
        return respuesta;
    }
    
    public static void main(String []args){
        Mathe mate = new Mathe();
        
        System.out.println(mate.esPrimo(1009));
    }
    
}
