package com.mycompany.ecommercesystem;
import java.util.Scanner;
public class Cart {
   int customerId;
    int nproducts;
    static Scanner input = new Scanner(System.in);
    int c;
    public void setcustomerId(int cid){
    if(cid>0){
    customerId = cid;
    }
    else{
        customerId = Math.abs(cid);
    }
    }
    public int getcustomerId(){
     return customerId;
    }
    public void setnproducts(int n){
    nproducts = n;
    }
    public int getnproducts(){
    return nproducts;
    }
    public void Addproduct(Product[]a){
    int n;
    for(int i =0 ;i<a.length;i++){
        System.out.println("which product you would add?");
        System.out.println("1.Smart phone");
        System.out.println("2.T-shirt");
        System.out.println("3.OOP");
        n = input.nextInt();
        switch(n){
        case(1):
            a[i]= new Product("Smart Phone", 1, 599.99f);
            break;
        case (2):
            a[i]= new Product("T-shirt", 2, 19.99f);
            break;
        case(3):
            a[i]= new Product("OOP", 3, 39.99f);
            break;
        default:
            a[i]= new Product(null, 0, 0f);
            break;
        }
    }
    }
    public Product[] removeproduct(Product[]a){
        System.out.println("Would you like to delete and a product: ");
        System.out.println("1-Yes");
        System.out.println("2-No");
        int n = input.nextInt();
        switch (n) {
            case 1:
        System.out.println("What is the number of the product you want to delete: ");
        int N = input.nextInt();
        for(int i = 0;i<a.length;i++){
          if(i==N-1){
              a[i] = new Product("Null", 0, 0f);
               }
                else
                        continue;    
                }
                return a;
                
            default:
                return a;
                
        }
    }
    public void removeproducts(Product[]a){
    for(int i = 0; i<a.length;i++){
    a[i] = null;
    }
    }
    public void CalculatePrice(Product[]a){
    float toatlprice = 0f;
    
   for(int i = 0 ;i<a.length;i++){
       toatlprice+=a[i].price;
   }
        System.out.println("Total price is " + toatlprice);
    }
    
   public void placeorder(){
       System.out.println("Would you like to place order?");
       System.out.println("1-YES");
       System.out.println("2-NO");
       c = input.nextInt();
       switch (c) {
           case 1:
               System.out.println("Here is your order summary: ");
               break;
           case 2:
               System.out.println("Your order is cancelled");
               break;
           default:
               System.out.println("Invalid choice");
       }
   
   } 
}
