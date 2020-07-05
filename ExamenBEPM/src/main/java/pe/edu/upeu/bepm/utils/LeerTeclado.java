package pe.edu.upeu.bepm.utils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeerTeclado {
    BufferedReader LeerTeclado = new BufferedReader(new InputStreamReader(System.in));
    //Opciones para los ejercicios
    public int leer(int dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=Integer.parseInt(LeerTeclado.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }
    //Posicion del menu
    public String leer(String mensaje01, String mensaje02){
        try {
            System.out.println(mensaje02);
            mensaje01=LeerTeclado.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return mensaje01;
    }
}