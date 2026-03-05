/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Geane
 */
public class Circulo {
    private double raio;
  
    
    public Circulo(double raio, double pi){
        this.raio = raio;
    }
    public double calcularArea(){
        double pi = 3.14;
        return pi * raio * raio;
    }
    public double carcularPerimetro(){
        double pi = 3.14;
        return 2 * pi * raio;
    }
}
