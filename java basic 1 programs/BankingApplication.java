import java.util.Scanner;
class BankingApplication{

    int balance;
    public void deposit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        int amount = scan.nextInt();
        balance=balance+amount;
        System.out.println("updated balance"+balance);

    }
    public void withdraw(){
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        int amount = scan.nextInt();
        balance=balance-amount;
        System.out.println("updated balance"+balance);


    }
    public void checkbalance(){
        System.out.println("Your balance is :"+balance);

    }
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to Miracle Banking services");
     System.out.println("Enter your choice : ");
     System.out.println(" 1.CHECK BALANCE \n 2.DEPOSIT \n 3.WITHDRAW");
     int choice = scan.nextInt();
     BankingApplication obj = new BankingApplication(); 
      int opt=1;
     while(opt==1){
        System.out.println("Enter your choice : ");
     System.out.println(" 1.CHECK BALANCE \n 2.DEPOSIT \n 3.WITHDRAW");
      choice = scan.nextInt();
        if(choice==1){
        obj.checkbalance();
     } 
     if(choice==2){
        obj.deposit();
        
     } 
     if(choice==3){
        obj.withdraw();
     } 
      System.out.println("Do you want to continue transaction \n 1.CONTINUE \n 2.EXIT");
       opt =scan.nextInt();
       if(opt==2){
        break;
       }
     }
           
    }
}