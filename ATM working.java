import java.util.*;
class bank{
    String name,branch,ifsc;
    int accno,amt,p,pin,bal;
    bank(){
        name="saran";
        accno=35678;
        ifsc="SBI00123";
        pin=9876;
        bal=5000;
    }
    Scanner sc=new Scanner(System.in);
    void deposit(){
        System.out.println("enter the pin");
        p=sc.nextInt();
        if(pin==p){
             System.out.println("enter the amount you want to deposit");
            int amt=sc.nextInt();
            bal=bal+amt;
            System.out.println("amt is deposited : "+bal);
        }
        else{
            System.out.println("enter the correct pin!!");
        }
    }
    void withdraw(){
        
        System.out.println("enter the pin");
        p=sc.nextInt();
       
        if(amt>=bal){
        if(pin==p){
            System.out.println("enter the amount");
            amt=sc.nextInt();
            bal=bal-amt;
            System.out.println("amt is withdrawed:) balance : "+bal);
        }
        else{
            System.out.println("enter the correct pin!!");
        }
        }else{
            System.out.println("Insufficient amt");
        }
    }
    void checkbal(){
        System.out.println("enter the pin");
        p=sc.nextInt();
        if(pin==p){
            System.out.println("the balance is : "+bal);
        }
        else{
            System.out.println("enter the correct pin!!");
        }
    }
    void pinchnge(){
        System.out.println("enter the pin");
        p=sc.nextInt();
        if(pin==p){
            System.out.println("enter the new pin : ");
            p=sc.nextInt();
            pin=p;
            System.out.println("your pin has been changed");
        }
        else{
            System.out.println("enter the correct pin!!");
        }
    }
    void display(){
        System.out.println("enter the pin");
        p=sc.nextInt();
        if(pin==p){
          System.out.println("name\n:"+name);
          System.out.println("accno:"+accno);
          System.out.println("ifsc:"+ifsc);
       }
       else{
         System.out.println("enter the correct pin!!");
       }
    }
}
    class Main{
        public static void main(String[] args){
            System.out.println("Insert your card..");
            Scanner sc=new Scanner(System.in);
            int  opt1;
            bank d=new bank();
            do
            {
            System.out.println("enter the option \n 1.deposit \n 2.withdraw \n 3.checkbal \n 4.pinchnge \n 5.display");
            int opt=sc.nextInt();
            switch(opt)
            {
            case(1):
            {
            d.deposit();
            break;
            }
            case(2):{
            d.withdraw();
            break;
            }
            case(3):{
            d.checkbal();
            break;
            }
            case(4):{
            d.pinchnge();
            break;
            }
            case(5):{
            d.display();
            break;
            }
            default:{
            System.out.println("invalid option!!!");
            }
            }
           System.out.println("want to continue press 1 else press 0");
           opt1=sc.nextInt();
          } while(opt1!=0);
    }
}

