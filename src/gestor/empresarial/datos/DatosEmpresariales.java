package gestor.empresarial.datos;

public final class DatosEmpresariales extends DatosPersonales {
    String adscripcion;
    String TelefonoExterior;
    String puesto;
    public DatosEmpresariales(int i, String nom, String ape, String corr, String wtp ) {
    }

    public String getAdscripcion() {
        return adscripcion;
    }

    public void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }

    public String getTelefonoExterior() {
        return TelefonoExterior;
    }

    public void setTelefonoExterior(String telefonoExterior) {
        TelefonoExterior = telefonoExterior;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
