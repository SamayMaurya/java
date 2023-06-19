import java.io.*;

class line{
public static void main(String args[]) throws IOException{
FileReader fr= new FileReader("D:\\study\\java\\practice\\io\\charby char\\abc.txt");
BufferedReader br = new BufferedReader(fr);

String s;
while((s=br.readLine())!=null){
System.out.println(s);
}
br.close();
fr.close();
}

}