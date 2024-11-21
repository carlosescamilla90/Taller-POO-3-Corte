package Taller16.Ejercicio3;

public class CanalNotificacionPush implements CanalEnvio { 
    @Override
    public void enviarMensaje(String destinatario, String mensaje) { 
        System.out.println("Enviando notificación push a " + destinatario + " con el mensaje: " + mensaje);
    }
}
