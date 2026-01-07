package Clases;

import java.net.Socket;
//Método para comprobar conexión a internet
public class ComprobarConexionInternet {
    public boolean test()
    {
        String dirWeb = "www.google.com";
        int puerto= 80;
        try
        {
            //Utiliza una dirección web y el puerto 80 para comprobar que se conecta
            Socket s = new Socket(dirWeb, puerto);
            if(s.isConnected()){
                System.out.println("Conexión establecida con la dirección: " + dirWeb + " a través del pueto: " + puerto);
            }
        }
        catch (Exception e)
        {
            //De no establecer la conexión, mostrar el mensaje de error
            System.err.println("No se pudo establecer conexión con: " + dirWeb + " a través del puerto: " + puerto);
            return false;
        }
        return true;
    }
}
