package app.flores.com.friendlybot.ChatEspecialista;

import java.util.Map;

/**
 * Created by JARVIS on 23/09/2017.
 */

public class MensajeEnviar extends Mensaje {
    private Map hora;

    public MensajeEnviar(Map hora){
        this.hora = hora;
    }
    public MensajeEnviar(String mensaje, String nombre, String fotoPerfil, String type_mensaje, Map hora) {
        super(mensaje, nombre, fotoPerfil, type_mensaje);
        this.hora = hora;
    }
  public MensajeEnviar(String mensaje, String urlFoto, String nombre, String fotoPerfil, String type_mensaje, Map hora){
      super(mensaje, urlFoto, nombre, fotoPerfil, type_mensaje);
      this.hora = hora;
  }

  public Map getHora(){
      return hora;
  }
  public void setHora(Map hora){
      this.hora = hora;
  }
}
