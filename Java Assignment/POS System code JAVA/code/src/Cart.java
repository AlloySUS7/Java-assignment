/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Bruh
 */
public class Cart extends Game {
    private double totalPrice;
    public Cart(){
    }
    public Cart(String gameID, String gameName, double price){
        super(gameID, gameName, price);
    }
    
    public double getTotalPrice(){
        return totalPrice;
    }
   
    
    
}
