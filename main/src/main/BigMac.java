package hamburger;

public class BigMac extends Hamburger {
    private String BasicBigMac1;
    private double BasicBigMac1Price;
    
    private String BasicBigMac2;
    private double BasicBigMac2Price;
    
    private String BasicBigMac3;
    private double BasicBigMac3Price;
    
    private String BasicBigMac4;
    private double BasicBigMac4Price;
    
    private String BigMac1Name;
    private double BigMac1Price;

    private String BigMac2Name;
    private double BigMac2Price;

    private String BigMac3Name;
    private double BigMac3Price;

    private String BigMac4Name;
    private double BigMac4Price;
    
    public BigMac(String name, String meat, double price, String breadRollType) {
          super(name,meat,price,breadRollType);
          this.BasicBigMac1 = "Onions";
          this.BasicBigMac1Price = 0.50;
          this.BasicBigMac2 = "BigMac Sauce";   
          this.BasicBigMac2Price = 0.50;
          this.BasicBigMac3 = "Cheese";
          this.BasicBigMac3Price = 1.30;
          this.BasicBigMac4 = "Pickles";
          this.BasicBigMac4Price = 0.70;
    }//end of contstructors

    public void addBigMacAddition1(String name, double price){
        this.BigMac1Name = name;
        this.BigMac1Price = price;
    }

    public void addBigMacAddition2(String name, double price){
        this.BigMac2Name = name;
        this.BigMac2Price = price;
    }

    public void addBigMacAddition3(String name, double price){
        this.BigMac3Name = name;
        this.BigMac3Price = price;
    }

    public void addBigMacAddition4(String name, double price){
        this.BigMac4Name = name;
        this.BigMac4Price = price;
    }
    
    @Override
    public double itemiseHamburger() {
        double BigMacPrice = super.itemiseHamburger();
        System.out.println("Basic " + this.BasicBigMac1 + " This is " + this.BasicBigMac1Price);
        System.out.println("Basic " + this.BasicBigMac2 + " This is " + this.BasicBigMac2Price);
        System.out.println("Basic " + this.BasicBigMac3 + " This is " + this.BasicBigMac3Price);
        System.out.println("Basic " + this.BasicBigMac4 + " This is " + this.BasicBigMac4Price);
        if(this.BigMac1Name != null){
            BigMacPrice += this.BigMac1Price;
            System.out.println("Added " + this.BigMac1Name + " for an extra " + this.BigMac1Price);
        }

        if(this.BigMac2Name != null){
            BigMacPrice += this.BigMac2Price;
            System.out.println("Added " + this.BigMac2Name + " for an extra " + this.BigMac2Price);
        }
        
        if(this.BigMac3Name != null){
            BigMacPrice += this.BigMac3Price;
            System.out.println("Added " + this.BigMac3Name + " for an extra " + this.BigMac3Price);
        }  
        
        if(this.BigMac4Name != null){
            BigMacPrice += this.BigMac4Price;
            System.out.println("Added " + this.BigMac4Name + " for an extra " + this.BigMac4Price);
        }        

        return BigMacPrice;
        
        
    }
}