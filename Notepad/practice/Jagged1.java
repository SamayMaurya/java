import java.util.*;

class Abcd{
public static void main(String[] args)
{
int arr[][]= new int[3][];
arr[0]= new int[5];
arr[1]=new int[3];
arr[2]= new int[4];

Scanner sc= new Scanncer(System.in);

for(int i =0; i<arr.length; i++){
for(int j=0; j<arr[i].length;j++){
int x= sc.nextInt();
arr[i][j]=x;
}
}



for(int i =0; i<arr.length; i++){
for(int j=0; j<arr[i].length;j++){
System.out.println(arr[i][j]);
}
}

}


}