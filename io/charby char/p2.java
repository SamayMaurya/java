import java.io.*;

class p2{
public static void main(String args[]) throws IOException{
FileReader fr = new FileReader("D:\\study\\java\\practice\\io\\charby char\\abc.txt");
BufferedReader br = new BufferedReader(fr);

FileWriter fw = new FileWriter("D:\\study\\java\\practice\\io\\charby char\\xyz.txt");
BufferedWriter bw = new BufferedWriter(fw);

String s;


while((s=br.readLine())!=null){
bw.write(s);
}
br.close();
fr.close();
bw.close();
fw.close();
}

}