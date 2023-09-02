/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad02;

/**
 *
 * @author david
 */
public class Rectangulo extends Cuadrilatero implements Shape{

    public Rectangulo(Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4, String nombre) {
        super(vertice1, vertice2, vertice3, vertice4, nombre);
        if (!esRegular()) {
            System.out.println("El rectángulo no es regular.");
        }
    }

    @Override
    public String toString() {
        return "Rectángulo " + getNombre() + "\n"+
                "Vertices : "+ getVertice1().toString()+getVertice2().toString()+getVertice3().toString()+getVertice4().toString()+ "\n"+
                " Área: " + calcularAreaFigura()+ "\n"+ 
                "Perimetro : "+ obtenerPerimetro();
    }

    @Override
    public double obtenerPerimetro() {
        double lado1 = vertice1.getDistancia(vertice2);
        double lado2 = vertice2.getDistancia(vertice3);
        return 2 * (lado1 + lado2);
    }

    @Override
    public double calcularAreaFigura() {
        double area;
        if (!esRegular()) {
            area = 0;
            System.out.println("El area no se puede determinar");
        }
        else{
            double base = Math.min(getVertice1().getDistancia(getVertice2()), getVertice1().getDistancia(getVertice4()));
            double altura = Math.min(getVertice1().getDistancia(getVertice2()), getVertice1().getDistancia(getVertice3()));
            area = base * altura;
        }
        
        return area;
    }
    

}
