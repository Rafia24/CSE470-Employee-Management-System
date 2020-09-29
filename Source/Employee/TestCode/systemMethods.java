/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author User
 */
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
public class systemMethods {
    
    
    public boolean login(String username, String password){
        String u = username;
        String p = password;
        if(u.equals("rafia") && p.equals("rafia")){
            return true;
        }
        else{
        return false;
        }
    }
   
    public ArrayList<String> AddEmployee() {
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("1");
    arr.add("Rafia");
    arr.add("20");
    arr.add("2");
    arr.add("John");
    arr.add("22");
    arr.add("3");
    arr.add("Tom");
    arr.add("24");
    return(arr);
    }
    
    
    
    public ArrayList<String> RemoveEmployee(){
    ArrayList<String> arr = new ArrayList<String>();
    arr.clear();
    return arr;   
    }
    
    
    public String UpdateEmployee(){
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("1");
    arr.add("Rafia");
    arr.add("20");
    arr.add("2");
    arr.add("John");
    arr.add("22");
    arr.set(4, "Maliha");
    return arr.get(4);
    }
    
    public boolean SearchEmployee(){
    ArrayList<String> arr = new ArrayList<String>();
    if(!arr.contains("Rafia")){
      return true;   
    }
    return false;
    }
    
    public String ForgotPassword(String oldpass, String newpass){
        if(!oldpass.equals(newpass)){
            return "New Password Set Successfully";
            
        }
        return "You have entered your previous password. Please change";
    }
    
    
    public String ViewDetails(){
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("1");
    arr.add("Rafia");
    arr.add("20");
    arr.add("2");
    arr.add("John");
    arr.add("22");
    if(!arr.isEmpty()){
       return "You can now view the details"; 
    }
    return "Please fillup all the columns";
    }
    
       
 
    public String salary(int s){
          if(s <5000){
             return "Approved";
          }
          else{
             return "Declined";
              }
     }
    
    
    public int Overtime(int s, int hours, int amountPerHour){
        
        int salary = s;
        int extra_workinghours = hours;
        int extra_amountPerHour = amountPerHour;
        
        int overtime_bonus = salary + extra_workinghours*extra_amountPerHour;
        return overtime_bonus;     
    
    
    }
    
    public double Tax(int earnings, double percent){
    
        int e = earnings;
        double p = percent;
        double tax = e*p;
        
        return tax;
    
    
    }   
    
    
}

