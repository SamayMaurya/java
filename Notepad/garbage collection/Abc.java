class Ab{

Ab(){
System.out.println("Object Created...");
}
protected void  finalize();



void show(){
System.out.println("x="+x+"y="+y);

}

public static void main(String[] args)
{
Ab z1= new Ab();
z1=null;
System.gc();

}



}