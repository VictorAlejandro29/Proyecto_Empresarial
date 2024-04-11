package gestor.archivos;
import gestor.archivos.iFileText;
import java.io.*;
public final class ArchivoTexto extends ControlArchivos implements iFileText {
    private File file;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private boolean ArchivoTexto;
    private boolean ModoLectura;
    private boolean ModoEscritura;
   public void AbrirModoLectura(){
   }
   public String leer() {
       return "a";
   }
    public void AbrirModoEscritura(){
    }
    public void escribir (String texto){
    }
    public void cerrar(){
    }
    public ArchivoTexto(String nombreArchivo) {
       super(nombreArchivo);
   }
    public ArchivoTexto(String nombreArchivo, boolean siLoes){
       super(nombreArchivo);
   }
}