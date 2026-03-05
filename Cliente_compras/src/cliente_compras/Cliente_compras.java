/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente_compras;

/**
 *
 * @author Geane
 */
public class Cliente_compras {

   
    public static void main(String[] args) {
     Cliente cliente1 = new Cliente(
                "Jeremias",
                "jeremy@email.com",
                "11 97777-6676"
             
     );
     cliente1.realizarCompras(1000);
     cliente1.realizarCompras(350);
     cliente1.realizarCompras(780);
     
     cliente1.mostrarDados();
    }
    
}
