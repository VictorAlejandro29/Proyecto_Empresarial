package gestor.empresarial.empleados;
import gestor.empresarial.contrato.*;
import gestor.errores.*;

public final class Empleados implements iEmpleados {
    private int indice;
    public GestionErrores error;

    public Empleados() {
    }
    public void agregarDatosPersonales(String nombre, String apellidos, String correo) {
    }
    public void agregarContrato(int noContrato, int anio, String horario, Contrato.Cargos cargo) {
    }
    private int encontrarEmpleado(int id) {
        return 1;
    }
    private int encontrarEmpleado(String nombre) {
        return 2;
    }
    public void setWhatsapp(int a, String b) {
    }
    private String datosPersonales(int a) {
        return "a";
    }
    public String getInfoEmpleado(int a) {
        return "b";
    }
    public String getInfoEmpleado(String a) {
        return "c";
    }
    public void setAdscripcion(int a, String b) {
    }
    public void setTelefonoExtension(int a, String b) {
    }
    public void setPuesto(int a, String b) {
    }
    public void showDatosEmpleado() {
    }

    public int getAntiguedad() {
        return 1;
    }
}

