package Taller16.Ejercicio3;

public class CanalSMS implements CanalEnvio { 
    @Override
    public void enviarMensaje(String destinatario, String mensaje) { 
        System.out.println("Enviando SMS a " + destinatario + " con el mensaje: " + mensaje);
    }
}
