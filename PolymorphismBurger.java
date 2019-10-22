/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismburger;

/**
 *
 * @author m1801087
 */
public class PolymorphismBurger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //com.TimBuchalka.Hamburger hamburger = new com.TimBuchalka.Hamburger("Basic", "Sausage", 3.56, "white");
            //double price = hamburger.itemiseHamburger();
            //hamburger.addHamburgerAddition1("Tomato", 0.27);
            //hamburger.addHamburgerAddition2("Lettuce", 0.75);
            //hamburger.addHamburgerAddition2("Lettuce", 0.75);
            //hamburger.addHamburgerAddition3("Cheese", 1.13);
            //System.out.println("Total Burger price is " + hamburger.itemiseHamburger());
            //hamburger.itemiseHamburger();
            
        //com.TimBuchalka.HealthyBurger healthyBurger = new com.TimBuchalka.HealthyBurger("Bacon", 5.67);
            //healthyBurger.addHealthAddition1("Egg", 5.43);
            //System.out.println("Total Healthy Burger price is " + healthyBurger.itemiseHamburger());
            //healthyBurger.itemiseHamburger();
    
        com.TimBuchalka.BigMac BigMac = new com.TimBuchalka.BigMac("Basic","Regualur Meat ", 4.99, "BigMac");
            BigMac.addBigMacAddition1("Bacon", 0.40);
            BigMac.addBigMacAddition2("Extra Cheese", 0.20);
            BigMac.addBigMacAddition3("Add TomatoSauce", 0.00);
            BigMac.addBigMacAddition4("Extra Onions", 0.00);
            System.out.println("Total BigMac price is " + BigMac.itemiseHamburger());
     
    }
    
}
