/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Bruh
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Staff extends User {
    
    public Staff(String userID,String username, String userPw, String userEmail)
    {
        super(userID, username, userPw, userEmail);
    }
    public String toString(){
        return String.format("Staff");
    }
}
