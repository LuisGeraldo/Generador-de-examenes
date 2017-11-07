package Contenedor_Principal;
import javax.swing.JFrame;
/**
 *
 * @author luis
 */
public class Contenedor_Principal extends JFrame {
    int Ancho, Alto;
    public Contenedor_Principal(){
        Ancho = 500;
        Alto = 500;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Ancho, Alto);
        setTitle("EXAMEN GENERADOR");
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    public Contenedor_Principal(int Ancho, int Alto){
        this.Ancho = Ancho;
        this.Alto = Alto;
    }
    
    public void setAlto(int Alto){
        this.Alto = Alto;
    }
    
    public int getAlto(){
        return Alto;
    }
    
    public void setAncho(int Ancho){
        this.Ancho = Ancho;
    }
    
    public int getAncho(){
        return Ancho;
    }
    
}
