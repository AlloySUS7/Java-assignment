/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author admin
 */

public class Game {
    protected String gameID;
    protected String gameName;
    protected double price;
    protected String gameGenre;
    protected String gameDesc;
    private static int numGameID = 1000;
    private double total;
    
    //Functions
    public Game(){
      
    }
    
    
    //Constructor
    public Game (String gameID, String gameName, double price, String gameGenre, String gameDesc)
    {
        this.gameID = gameID;
        this.gameName = gameName;
        this.price = price;
        this.gameGenre = gameGenre;
        this.gameDesc = gameDesc;
    }
    public Game(String gameID, String gameName, double price){
        this.gameID = gameID;
        this.gameName = gameName;
        this.price = price;
    }
    //Accessors
    public String getGameID()
    {
        this.gameID = "G" + numGameID;
        numGameID++;
        return gameID;
    }
    public String getGameName()
    {
        return gameName;
    }
    public String getGenre(){
        return gameGenre;
    }
    public String getGameDesc()
    {
        return gameDesc;
    }
    public double getPrice()
    {
        return price;
    }
    
    //Mutators
    public void setGameID(String gameID)
    {
        this.gameID = gameID;
    }
    public void setGameName(String gameName)
    {
        this.gameName = gameName;
    }
    public void setGameDesc(String gameDesc)
    {
        this.gameDesc = gameDesc;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setGenre(String gameGenre){
        this.gameGenre = gameGenre;
    }
    public double getTotal(){
        return total;
    }
    public String toString(){
        return String.format(gameName + "   " + price);
    }
}
