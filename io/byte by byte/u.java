import java.io.*;

class u{
public static void main(String[] args) throws IOException{
FileInputStream fis= new FileInputStream("D:\\study\\java\\practice\\io\\abc.txt");
BufferedInputStream bis = new BufferedInputStream(fis);
FileOutputStream fos = new FileOutputStream("D:\\study\\java\\practice\\io\\xyz.txt");
BufferedOutputStream bos= new BufferedOutputStream(fos);

int x=0;

while((x=bis.read())!=-1){
bos.write(x);
}
bis.close();
fis.close();
bos.close();
fos.close();


}
}
