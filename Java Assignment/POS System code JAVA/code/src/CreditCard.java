/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Bruh
 */
public class CreditCard extends Customer{
    private int cardnum;
    private char cardName;
    private int expiredate;
    
    public CreditCard(String userID, String name, String userPw, String userEmail, int cardnum, char cardName){
        super(userID, name, userPw, userEmail);
        this.cardnum=cardnum;
        this.cardName = cardName;
    }
    
    public int getCardnum(){
        return cardnum;
    }
    public int getcardName(){
        return cardName;
    }
}
