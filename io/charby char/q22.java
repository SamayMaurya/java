import java.io.*;
import java.util.Scanner; 
class q22{
public static void main(String args[]) throws IOException{
Scanner sc= new Scanner(System.in);

System.out.print("Enter you name ");

String s= sc.nextLine();
FileWriter fw = new FileWriter("D:\\study\\java\\practice\\io\\charby char\\abc.txt");
fw.write(s);
System.out.print("DONE");

fw.close();
//sc.clsoe();


}

}