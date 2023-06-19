import java.io.*;

class p1{
public static void main(String args[]) throws IOException{
FileReader fr= new FileReader("D:\\study\\java\\practice\\io\\charby char\\abc.txt");
int x=0;
while((x=fr.read())!=-1){
System.out.println((char)x);
}

fr.close();
}

}