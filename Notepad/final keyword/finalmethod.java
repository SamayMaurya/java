//ffinal_method
class Bank{
void mNumber(){
System.out.println("123456789");
}

final void matm(){
System.out.println("1234");
}
}
class thief extends Bank{

void mNumber(){
System.out.println("987654321");
}
//over riding not possible in final method
//void matm(){
//System.out.println("1234");
//}

//}

public static void main(String[] args){
thief d=new thief();
d.mNumber();
//d.matam();

}
}