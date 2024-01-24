package Abstraction;

public class Product {
    double price = 100;
    //getter and setter methods
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice(int quantity)
    {
        return price*quantity;
    }
    public static void main(String args[]){
        oops.Product p = new oops.Product();
        double totalquantity = p.getPrice(2);
        System.out.println(totalquantity);
    }
}
