/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarefas_projeto;

/**
 *
 * @author Admin
 */
public class Tarefas_projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tarefas tarefa1 = new Tarefas(
            "relatorio de química",
             "fazer relatorio sobre a aula de oxidicacao de metais",
             "31/08/2026"   
        );
        
        tarefa1.mostrarTarefa();
        tarefa1.concluirTarefa();
        
    }
    
}
