package com.mycompany.ecommercesystem;
public class Product {
   protected int productId;
   protected String name;
   protected float price;
    public Product(){}
    public Product(String n , int id, float p){
    name = n;
    productId =id;
    price = p;
    }
    public  void setproductId(int id){
    if(id>0){
    productId = id;
    }
    else{
        productId = Math.abs(id);
    }
    }
    public int getproductId(){
      return productId;
    }
    public void setname( String n){
    name = n;
    }
    public String getname(){
    return name;
    }
    public void setprice(float p){
    if(p>0){
    price = p;
    }
    else{
        price = Math.abs(p);
    }
    }
    public float getprice(){
    return price;
    }
    
}
