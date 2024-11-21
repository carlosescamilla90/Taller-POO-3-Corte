package Taller16.Ejercicio3;

public class Prueba { 
    public static void main(String[] args) {
        CanalEnvio correo = new CanalCorreo(); 
        CanalEnvio sms = new CanalSMS();
        CanalEnvio notificacionPush = new CanalNotificacionPush(); 

        correo.enviarMensaje("email@prueba.com", "Hola, este es un correo");
        sms.enviarMensaje("123456789", "Hola, este es un SMS");
        notificacionPush.enviarMensaje("usuario123", "Hola, esta es una notificación push");
    }
}
