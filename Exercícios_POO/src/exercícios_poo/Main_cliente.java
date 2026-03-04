/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercícios_poo;

/**
 *
 * @author Admin
 */
public class Main_cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   Cliente cliente1 = new Cliente(
           "Jose",
           "Jose123@email.com",
           "(11) 99999-3333"
   );
    cliente1.realizarCompra(150);
    cliente1.realizarCompra(750);
    cliente1.realizarCompra(400);
    
    cliente1.mostrarDados();
    }
}
