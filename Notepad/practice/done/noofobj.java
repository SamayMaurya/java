class Abc{
static int c=0;

Abc(){
c++;

}
void show(){
System.out.println(c);

}


public static void main(String[] args){
Abc c = new Abc();
Abc c1 = new Abc();
Abc c2 = new Abc();


c.show();

}



}