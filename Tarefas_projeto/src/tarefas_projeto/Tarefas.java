/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefas_projeto;

/**
 *
 * @author Admin
 */
public class Tarefas {
    
    private String nome;
    private String descricao;
    private String prazo;
    private boolean concluida;
    
   public Tarefas (String nome, String descricao, String prazo){
       this.nome = nome;
       this.descricao = descricao;
       this.prazo = prazo;
       this.concluida = true;
   }
   public void concluirTarefa(){
        concluida = false;
   }
   public void mostrarTarefa(){
       System.out.println("Tarefa: " + nome);
       System.out.println("Descricao: " + descricao);
       System.out.println("Prazo: " + prazo);
       
       if (concluida){
           System.out.println ("Status: concluida");
       
       } else {
           System.out.println("Status: pendente");
       } 
   }
}
