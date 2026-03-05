/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora_veiculos;

/**
 *
 * @author Geane
 */
public class Veiculo {
    
    private String modelo;
    private double aluguel;
    
    public Veiculo (String modelo, double aluguel){
        this.modelo = modelo;
        this.aluguel = aluguel;
    }
    public double calcularAluguel(int dias)
    {
        return dias * aluguel;
    }
    public void mostrarAluguel (int dias){
        System.out.println("Modelo: " + modelo);
        System.out.println("Dias: " + dias);
        System.out.println("Calcular aluguel total: R$ " + calcularAluguel(dias));
    }
}       
    

  
      
  