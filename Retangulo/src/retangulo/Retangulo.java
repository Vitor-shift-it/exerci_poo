/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retangulo;

/**
 *
 * @author Admin
 */
public class Retangulo {
    private double largura;
      private double altura;
      
      public Retangulo (double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    
}
    public double calcularArea(){
        return largura * altura;
    }
    
    public double calcularPerimetro(){
        return 2 * (largura + altura);
    }

    public void Info(){
        
        System.out.println("A area do retangulo e: " + calcularArea() + " centimetros");
        
        
        System.out.println("O perimetro do retangulo e: " + calcularPerimetro() + " centimetros");
        
    }
    
}
