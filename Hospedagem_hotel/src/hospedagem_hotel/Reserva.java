/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospedagem_hotel;

/**
 *
 * @author Admin
 */
public class Reserva {
    private String nome;
    private String dataCheckin;
    private int quarto;
    private int diasHospedagem;
    private double valorDiaria;
    
   public Reserva (String nome, String dataCheckin, int quarto, int diasHospedagem, double valorDiaria){
       this.nome = nome;
       this.dataCheckin = dataCheckin;
       this.quarto = quarto;
       this.diasHospedagem = diasHospedagem;
       this.valorDiaria = valorDiaria;
   }
       
       public double calcularTotal(){
           return diasHospedagem * valorDiaria;
       }
       public void exibirReserva(){
           System.out.println("Hospede: " + nome);
           System.out.println("A data de Checkin e: " + dataCheckin);
           System.out.println("O quarto do hospede " + nome + " e o numero " + quarto );
           System.out.println ("Quantidade de dias hospedados: " + diasHospedagem);
           System.out.println("Valor da diaria do quarto e de: " + valorDiaria);
           System.out.println("Total da estadia: R$ " + calcularTotal());
       }
   }

