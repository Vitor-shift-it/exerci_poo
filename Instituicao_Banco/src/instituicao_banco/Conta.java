/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituicao_banco;

/**
 *
 * @author Geane
 */
public class Conta {
    private String cliente;
    private double saldo;
    
    public Conta (String cliente){
        this.cliente = cliente;
        this.saldo = 0;
    }
    public void depositar (double valor){
        saldo += valor;
        
    }
    
    public void sacar (double valor){
        saldo -= valor;
        
    }
    public void mostrarSaldo(){
System.out.println("Cliente: " + cliente);
System.out.println("Saldo: " + saldo);
    }
}
