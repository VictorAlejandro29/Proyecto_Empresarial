package gestor.archivos;

public class ControlArchivos {
    private String archivo;
    public ControlArchivos(String a) {  }
    public boolean crear(){
        return true;
    }
    public boolean eliminar(){
        return false;
    }
    public boolean cambiar(){
        return true;
    }
    public boolean mover(String nuevoLugar){
        return false;
    }
}