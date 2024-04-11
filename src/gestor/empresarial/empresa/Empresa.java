package gestor.empresarial.empresa;
import gestor.empresarial.empleados.*;
import gestor.errores.*;
public final class Empresa {
    String NombreEmpresa;
    String RepresentanteLegal;
    String telefono;
    String RFC;
    Empleados datosRH;
    GestionErrores error;
    public Empresa(String nombre, String direccion ){
    }
    public void setRepresentanteLegal(String nombreRepre){
    }
    public String getRepresentanteLegal(){
        return "nombrerepre"; }
    public void setTelefono(String tel) {
    }
    public String getInfo() {
        return "info";
    }
}