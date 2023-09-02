/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad02;

/**
 *
 * @author david
 */
public class Circulo extends FiguraGeometrica implements Shape{

    private Punto punto;
    private int radio;

    public Circulo(Punto punto, int radio, String nombre) {
        super(nombre);
        this.punto = punto;
        this.radio = radio;
    }
    
    

    
    @Override
    public double calcularAreaFigura() {
        return Math.PI*radio*radio;
    }

    @Override
    public boolean esRegular() {
        return true;
    }

    @Override
    public String toString() {
        return "Circulo " + getNombre() + "\n"+
               "Centro : "+ getPunto().toString() + "\n"+
               " radio :  "+getRadio()+ "\n"+
               " Área: " + calcularAreaFigura()+"\n"+
               "Perimetro : "+ obtenerPerimetro();
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    
}
