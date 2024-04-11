package gestor.archivos;
public interface iFileText {
    public void AbrirModoLectura();
    public String leer();
    public void AbrirModoEscritura();
    public void escribir (String palabras);
    public void cerrar();
}