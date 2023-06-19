import java.util.Scanner;

class Bank{
String Name;
double account_number;
double amount;

void inputinfo(String Name, double account_number, double amount){
this.name=name;
this.account_number=account_number;
this.amount=amount;
}

void withdraw(){

System.out.println("Enter amount you want to withdraw");

if(with<amount){
amount=amount-with;
}

else if(with=amount){
amount=amount-with;
System.out.println("Now You have 0 balance in your account");
}

else{
System.out.println("Insufficant Balance! Try Again");

}

}


void checkBalance(){

        System.out.println("Your Total balance left is"+amount);

}

void deposit(){

System.out.println("Enter Amount You want to Deposit");

amount=amount+depo;


}


void displayInfo(){
        System.out.println("Name="+name);
        System.out.println("Account Number"+account_number);
        System.out.println("Amount Balance"+amount);
}


  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

    Bank b=new Bank();
    b.inputinfo(args[0], args[1], Double.parseDouble(args[2]));
    b.withdraw();
        int with= sc.nextInt();


    b.checkBalance();
        int depo= sc.nextInt();

    b.deposit();
    b.displayInfo();
}




} 