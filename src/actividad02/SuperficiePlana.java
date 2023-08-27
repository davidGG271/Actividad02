
package actividad02;

import java.util.ArrayList;
import java.util.List;


public class SuperficiePlana {
    private List<FiguraGeometrica> figurasGeometricas;

    public SuperficiePlana() {
        figurasGeometricas = new ArrayList<>();
    }

    public void agregarFigura(FiguraGeometrica figura) {
        figurasGeometricas.add(figura);
    }

    public List<FiguraGeometrica> getFiguras() {
        return figurasGeometricas;
    }
    
    public void obtenerAreas(){
        for (FiguraGeometrica figura : figurasGeometricas) {
            double area = figura.calcularAreaFigura();
            System.out.println("El area de la figura es: " + area);
        }
    }
}
