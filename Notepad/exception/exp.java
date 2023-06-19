class LowBalanceException extends RuntimeException{

}

class Bank
{
float balance=100.0f;
void withdraw(float f)
{
try
{
if(balance<f)
throw new LowBalanceException();
else
{
balance=balance-f;
}
}

catch(LowBalanceException e){
System.out.println("Withdraw amaount is higher");

}


}

public static void main(String[] args){
Bank b= new Bank();
b.withdraw(500.0f);

}



}