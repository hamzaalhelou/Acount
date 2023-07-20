/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Moatasem
 */
public class Main {
    public static void main(String[] args) {
   
    Acount user=new Acount();
    
    user.insert(888, "mahmoud" , 1000);
    user.deposit(2000);
    user.withdraw(200);
    user.checkBalance();
    
   
      
    }   
}
