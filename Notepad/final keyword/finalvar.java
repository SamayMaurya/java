class final_variable
{
//normal final  variable 
final int roll_no=10;
//Blank final variable
final int atm_pin;
final_variable(){
atm_pin=1234;
}

public static void main(String[] args){
final_variable d=new final_variable();
System.out.println(d.roll_no);
System.out.println(d.atm_pin);



}

}