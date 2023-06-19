//read from file and display console

import java.io.*;

class xy{
public static void main(String []args) throws IOException {

FileInputStream fis= new FileInputStream("D:\\study\\java\\practice\\io\\abc.txt");

int x=0;
while((x=fis.read())!=-1){
System.out.println((char)x);
}
fis.close();
}	




}