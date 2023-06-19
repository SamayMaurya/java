class A extends Thread{
public void run(){
for(int i =1; i<=5;i++){
System.out.println("This is Thread class A and i="+i);
}


}

}

class B extends Thread{
public void run(){
for(int i =1; i<=5;i++){
System.out.println("This is Thread class B and i="+i);
}


}

}

class C extends Thread{
public void run(){
for(int i =1; i<=5;i++){
System.out.println("This is Thread class C and i="+i);
}


}

}

class Y{
public static void main(String[] args){
A t1=new A();
t1.start();
B t2= new B();
t2.start();
C t3= new C();
t3.start();

}



}
