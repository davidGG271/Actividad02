
package actividad02;


public class Actividad02 {

    
    public static void main(String[] args) {
        Punto punto1 = new Punto(0,0);
        System.out.println(punto1.toString());
        Punto punto2 = new Punto(3,0);
        System.out.println(punto2.toString());
        Punto punto3 = new Punto(0,4);
        System.out.println(punto3.toString());
        Punto punto4 = new Punto(5,1);
        System.out.println(punto4.toString());
        
        Triangulo triangulo = new Triangulo(punto1,punto2,punto3,"Figura de 3 lados");
        System.out.println(triangulo.toString());
        Circulo circulo = new Circulo(punto1, 4, "Circulo xd");
        System.out.println(circulo.toString());
        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3, punto4, "Rectangulo");
        
        SuperficiePlana superficie = new SuperficiePlana();
        superficie.agregarFigura(triangulo);
        superficie.agregarFigura(circulo);
        superficie.agregarFigura(rectangulo);
        
        superficie.obtenerAreas();
        
        
        
    }
    
}
