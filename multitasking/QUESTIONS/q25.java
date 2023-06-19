class Display{
synchronized void wish(String name){

System.out.print("wish");
try{
Thread.sleep(500);
}
catch(InterruptedException e){
System.out.println(e);
}
System.out.println(name);

} 

}

class gthread extends Thread{
Display display;
String name;

gthread(Display display, String name){
this.display= display;
this.name=name;
}

public void run(){
display.wish(name);
}

}

class q25 {
public static void main(String[] args) {
Display display=new Display();

        gthread thread1 = new gthread(display, "John");
        gthread thread2 = new gthread(display, "Alice");
        gthread thread3 = new gthread(display, "Bob");
        gthread thread4 = new gthread(display, "Sarah");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
}

}



