abstract class animal{
public abstract void main(){
System.out.println("Animal");
}
}

class dog extends animal{
public void sound(){
System.out.println("Barking");
}
}

class lion extends animal{
public void sound(){
System.out.println("Lion is Roar");
}
}

class test{

public static void main(String[] args){
dog d=new dog();
lion l=new lion();
d.sound();
d.lion();




}