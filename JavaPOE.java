/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.po;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class JavaPOE {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner scanner =  new Scanner(System.in);
       
        System.out.println("Enter username");
       String username = scanner.nextLine();
             
        if(username.matches("_")&username.length() <=5){
            System.out.println(" username successful captured");
       }
        else{
            System.out.println("usrname is unsucessfully captured");
                }
        System.out.println("Enter password");
        String Password = scanner.nextLine();
        
        if (Password.matches(Password)){
            System.out.println("password is sucessful");
        }
        else{
            System.out.println("Password unsuccessful");
        }
        
        System.out.println("Enter South African cell phone number");
        String PhoneNumber = scanner.nextLine();
        
        if (PhoneNumber.matches(PhoneNumber)){
            System.out.println("Phone number is successful");
        }
        else{
            System.out.println("Phone number is unsuccessful");
        }
        
        }
    public class login {
         public static void main(String[] args) {
            String UsedUsername = null;
            String UsedPassword = null; 
                    
            try (Scanner Scanner = new Scanner(System.in)) {
                System.out.println("Enter username");
                String enteredUsername;
                enteredUsername = Scanner.nextLine();
                
                System.out.println("Enter password");
                String enteredPassword = Scanner.nextLine();
                
                
                if (enteredUsername.matches(UsedUsername)&& enteredPassword.matches(UsedPassword)){
                    System.out.println("The entered username and password is sucessfully");
                }
                else{
                    System.out.println("incorrect username or password. login unsuccessful");
                }
            }
                    

        }
    }

public class log {
    
    String savedUsername;
    String savedPassword;
    String savedPhoneNumber;
    boolean isLoggedIn = false;
    
public boolean isValidUsername(String username){
    return username != null && username.length() >=5;
}
public boolean isValidPassword(String password){
    if(password == null || password.length() <6){
        return false;
    }
    for(int i = 0;i < password.length();i++){
        if(Character.isDigit(password.charAt(i))){
        return true;
    }
}
        return false;
}
    public boolean isValidPhoneNumber(String phoneNumber){
        if(phoneNumber == null || phoneNumber.length()< 10){
        return false;
    }
        for(int i = 0; i < phoneNumber.length();i++){
            if (Character.isDigit(phoneNumber.charAt(i)))
                return false;
        }
        return true;
    }
    public boolean registerUser(String username, String password,String phonNumber, String phoneNumber ){
        if(isValidUsername(username)&& isValidPassword(password)&&isValidPhoneNumber(phoneNumber)){
        savedUsername = username;
        savedPassword = password;
       savedPhoneNumber = phoneNumber;
        return true;
    }
        return false;
    }
    public boolean loginUser(String username, String password){
        boolean credentialsMatch = username!= null && password != null && username. matches(savedUsername) && password.matches(savedPassword);
        isLoggedIn = credentialsMatch;
        return isLoggedIn;
    }
    public String LoginStatus(){
        return isLoggedIn ?" Login succesful.":"login unsucessful";
    }
}            
  
    
}

   


    
    
    

                    
               
        
        
        
        
        
        
        
  
