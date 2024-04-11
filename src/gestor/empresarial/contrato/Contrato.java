package gestor.empresarial.contrato;

public final class Contrato {
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipodeCargo;
    public Contrato(int id){
    }

    public int getNoContrato() {
        return noContrato;
    }

    public void setNoContrato(int noContrato) {
        this.noContrato = noContrato;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }
    public enum Cargos {
        confianza,
        sindicalizado,
        temporal
    }
}