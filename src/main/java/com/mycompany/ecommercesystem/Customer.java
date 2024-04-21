package com.mycompany.ecommercesystem;
public class Customer {
    int customerId;
    String name;
    String address;
    public void setcustomerId(int cid){
    if(cid>0){
    customerId = cid;
    }
    else{
        System.out.println("Customer ID sould be positive");
    }
    }
    public int getcustomerId(){
     return customerId;
    }
    public void setname(String n){
    name =n;
    }
    public String getname(){
    return name;
    }
    public void setaddress(String ad){
    address = ad;
    }
    public String getaddress(){
    return address;
    }
}
