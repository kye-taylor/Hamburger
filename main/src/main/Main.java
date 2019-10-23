/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

/**
 *
 * @author m1801087
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
        int choice = 1;
        int i;
        double d;
        Scanner sc = new Scanner(System.in);
                
        while (choice != 0) {
            switch(choice){
                case 1: 
                    System.out.println("BigMac");
                    //Method call i.e. burger choice
                    BigMac();
                    choice = 0;
                    sc.close();
                    break;
                case 2: 
                    System.out.println("HamBurger");
                    //Method call i.e. burger choice
                    Hamburger();
                    choice = 0;                    
                    break; 
                case 3: 
                    System.out.println("HeatlyBurger");
                    //Method call i.e. burger choice
                    HealthyBurger();
                    choice = 0;
                    break;                  
            }//end of switch
        }//end of while 
        
     
    }
    
         static int menu(){ //displays the main menu and returns user choice to the switch in main method
        int iChoice;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Select an option \n" +
                          "1.  Burger Choice \n" +
                          "2.  Hamburger \n" +
                          "3.  Heatly Burger \n" +
                          "0. Exit");
            
            iChoice = sc.nextInt();
        } while (iChoice < 0 || iChoice > 3); //when the user input is equal to 0, the program will close

        return iChoice;//returning menu choice 
    }
    
    public static void UserChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like: Hamburger, HealthyBurger, BigMac");
            String userChoice = sc.next().toLowerCase();
            if (userChoice.equals("Hambruger")){
                System.out.println("Hamburger it is:");
            } else if (userChoice.equals("BigMac")){
                System.out.println("BigMac it is:");  
            } else if (userChoice.equals("HealthyBurger")){
                System.out.println("Healthy Burger it is:");
            }else {
                System.out.println("Please select one of the options");
            }
    }
    
    public static void BigMac(){
        System.out.println("\n************************\n\n");
            hamburger.BigMac BigMac = new hamburger.BigMac("Basic","Regualur Meat ", 4.99, "BigMac");
               BigMac.addBigMacAddition1("Bacon", 0.40);
               BigMac.addBigMacAddition2("Extra Cheese", 0.20);
               BigMac.addBigMacAddition3("Add TomatoSauce", 0.00);
               BigMac.addBigMacAddition4("Extra Onions", 0.00);
            System.out.printf("Total BigMac price is: %.2f", BigMac.itemiseHamburger()); //added Printf and %.2f to round to two decimal places 
        System.out.println("\n************************\n\n");
        anythingElse();
    }
    
    public static void HealthyBurger(){
        System.out.println("************************\n\n");//to seperate orders  
            hamburger.HealthyBurger healthyBurger = new hamburger.HealthyBurger("Bacon", 5.67);
                healthyBurger.addHealthAddition1("Egg", 5.43);
                System.out.println("Total Healthy Burger price is " + healthyBurger.itemiseHamburger());
                healthyBurger.itemiseHamburger();      
        System.out.println("************************\n\n");//to seperate orders
        anythingElse();
    }
    
    public static void Hamburger(){
        System.out.println("************************\n\n");//to seperate orders        
        hamburger.Hamburger hamburger = new hamburger.Hamburger("Basic", "Sausage", 3.56, "white");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemiseHamburger());
        System.out.println("************************\n\n");//to seperate orders
        anythingElse();
    }
    
    public static void anythingElse(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Is That everything?");
            String userChoice = sc.next().toLowerCase();
            if (userChoice.equals("yes")){
                System.out.println("Cya!");
                System.exit(0);
            } else if (userChoice.equals("no")){
                menu();
            } else {
                System.out.println("Please select one of the options?");
            }
    }        
}
