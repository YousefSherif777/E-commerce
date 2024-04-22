package com.mycompany.ecommercesystem;
public class ClothingProduct extends Product{
   private String size;
   private String fabric;
    public ClothingProduct(String n , int id, float p,String s,String f){
    name = n;
    productId =id;
    price = p;
    size = s;
    fabric =f;
    }
    public void setsize(String s){
    size =s;
    }
    public String getsize(){
    return size;
    }
    public void setfabric(String f){
    fabric = f;
    }
    public String getfabric(){
    return fabric;
    }
}
