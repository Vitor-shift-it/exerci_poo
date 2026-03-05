/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instituicao_banco;

/**
 *
 * @author Geane
 */
public class Instituicao_Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta1 = new Conta("Malenia");
        
        conta1.depositar(756);
        conta1.sacar(256);
        
        conta1.mostrarSaldo();
    }
       
}
