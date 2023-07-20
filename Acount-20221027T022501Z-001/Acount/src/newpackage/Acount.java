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

//  عمل حساب بنكي
public class Acount {
    
    private int acountNo;      // رقم الحساب
    private String name;      // اسم صاحب الحساب
    private float amount;     // رصيد الحساب
    
    public void insert(int a, String n,float amt ){
        this.acountNo=a;
        this.name=n;
        this.amount=amt;
        System.out.println("acountNo: "+acountNo+"\n"+"name: "+name+"\n"+"amount: "+amount);
    }
                         //50$
    public void deposit(float amt){
        this.amount = this.amount + amt;
        System.out.println("depoited: "+amt);
    }
    
    public void withdraw(float amt){
        if(amount<amt){
            System.out.println("Balance is not enough");
        }else{
            this.amount= this.amount - amt;
            System.out.println("withdrawn: "+amt);
        }         
    }
    
    public void checkBalance(){
        System.out.println("Balance = "+this.amount);
    }
}
