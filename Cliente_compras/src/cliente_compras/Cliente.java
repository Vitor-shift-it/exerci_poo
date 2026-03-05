/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente_compras;

/**
 *
 * @author Geane
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
    public void realizarCompras(double valor){
        totalCompras += valor;
    }
     public void mostrarDados(){
         System.out.println("nome: " + nome);
         System.out.println ("email: " + email);
         System.out.println("teleone: " + telefone);
         System.out.println("Total das compras: R$" + totalCompras);
     }
}
