package Taller16.Ejercicio3;

public class CanalCorreo implements CanalEnvio { 
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando correo a " + destinatario + " con el mensaje: " + mensaje);
    }
}

