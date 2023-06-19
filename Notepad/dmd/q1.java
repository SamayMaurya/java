//4.	Create a class “Bank” having method //getRateOfInterest(). Create child classes as HDFC, SBI //and PNB and override getRateOfInterest() and return //interest rates as 4.0, 4.5 and 5% //correspondingly.

class bank{
float getRateOfIntrest(){
return 0.0;
}


class HDFC extends bank{
float getRateOfIntrest(){
return 4.0;
}
}

class SBI extends bank{
float getRateOfIntrest(){
return 4.5;
}
}

class PNB extends bank{
float getRateOfIntrest(){
return 5.0;
}
}

class test{
public static void main(String[] args){
Bank b=new HDFC();
Bank s=new SBI();
Bank p=new PNB();

b.getRateOfIntrest();
s.getRateOfIntrest();
p.getRateOfIntrest();
}
}



}