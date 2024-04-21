package com.mycompany.ecommercesystem;
import java.util.Scanner;
public class EcommerceSystem {
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       gui g1 = new gui();
       ElectronicProduct elec = new ElectronicProduct("Smart Phone",1 ,599.99f , "Samsung",1);
       ClothingProduct cloth = new ClothingProduct("T-Shirt",2 , 19.99f, "Meduim", "Cotton");
       BookProduct book = new BookProduct("OOP", 3, 39.99f, "O'Reilly", "X Publishet");
       Customer cou = new Customer();
       Cart car = new Cart();
       Order ord = new Order();
       ord.setOrderId(1);
        System.out.println("Welcome to the E-commerce system !");
        System.out.println("Please enter your name: ");
        String Name = input.nextLine();
        cou.setname(Name);
        System.out.println("Please Enter your ID: ");
        int ID = input.nextInt();
        cou.setcustomerId(ID);
        ord.setCustomerId(ID);
        System.out.println("Please Enter your address : ");
        String Adsress = input.next();
        cou.setaddress(Adsress);
        System.out.println("How many products you want buy ?");
        int N = input.nextInt();
        car.setnproducts(N);
        Product pro[] = new Product[N];
        car.Addproduct(pro);
        car.CalculatePrice(pro);
        Product Pro[] = car.removeproduct(pro);
        car.placeorder();
        if(car.c==1){
            ord.PrintOrderInformation(pro);
          car.CalculatePrice(pro);
        }
        else{
        car.removeproducts(pro);
        }
    }
    
}
