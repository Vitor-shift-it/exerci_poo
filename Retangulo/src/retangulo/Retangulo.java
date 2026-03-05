/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retangulo;

/**
 *
 * @author Geane
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
}
