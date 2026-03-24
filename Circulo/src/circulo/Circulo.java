/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

/**
 *
 * @author Admin
 */
public class Circulo {
    private double raio;
  
    
    public Circulo(double raio){
        this.raio = raio;
    }
    public double calcularArea(){
        double pi = 3.14;
        return pi * raio * raio;
    }
    public double calcularPerimetro(){
        double pi = 3.14;
        return 2 * pi * raio;
    }
    
    public void info(){
        
        System.out.println("A area do circulo e: " + calcularArea());
        System.out.println ("O perimetro do circulo e: " + calcularPerimetro());
    }
}
