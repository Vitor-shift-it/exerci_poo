/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercícios_poo;

/**
 *
 * @author Admin
 */
public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private double totalCompras;
    
    public Cliente (String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.totalCompras = 0;
    }
    public void realizarCompra(double valor)
    {
        totalCompras += valor;
    }
    public void mostrarDados(){
        System.out.println ("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Valor total de compras: R$ " + totalCompras );
    }
}