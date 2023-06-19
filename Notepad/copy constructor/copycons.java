class Abc{
int x, y;

Abc()
{
x=1;
y=2;
}


Abc( int x, int y)
{
this.x=x;
this.y=y;
}

Abc(Abc c)
{
this(c.x,c.y);
}
void show(){
System.out.println("x="+x+"y="+y);

}


public static void main(String[] args)
{
System.out.println("Main Construstor");
Abc c = new Abc(5,6);
Abc c1=new Abc(c);
c.show();
System.out.println("Copy Construstor");

c1.show();
}



}