package gestor.empresarial.empleados;

public interface iEmpleados {
    public String getInfoEmpleado(int id);

    public String getInfoEmpleado(String nombre);

    public void showDatosEmpleado();

    public int getAntiguedad();
}
