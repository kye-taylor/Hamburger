/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
                
        hamburger.Hamburger hamburger = new hamburger.Hamburger("Basic", "Sausage", 3.56, "white");
        double price = hamburger.itemiseHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemiseHamburger());
        hamburger.itemiseHamburger();
        System.out.println("************************\n\n");//to seperate orders

        hamburger.HealthyBurger healthyBurger = new hamburger.HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Egg", 5.43);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemiseHamburger());
        healthyBurger.itemiseHamburger();
        System.out.println("************************\n\n");//to seperate orders

        hamburger.BigMac BigMac = new hamburger.BigMac("Basic","Regualur Meat ", 4.99, "BigMac");
        BigMac.addBigMacAddition1("Bacon", 0.40);
        BigMac.addBigMacAddition2("Extra Cheese", 0.20);
        BigMac.addBigMacAddition3("Add TomatoSauce", 0.00);
        BigMac.addBigMacAddition4("Extra Onions", 0.00);
        System.out.printf("Total BigMac price is: %.2f", BigMac.itemiseHamburger()); //added Printf and %.2f to round to two decimal places 
        
        System.out.println("\n************************\n\n");
     
    }
    
}
