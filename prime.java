import java.util.*;

public class prime{

public static void main(String[] args){
//int n=10;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();
boolean flag=true;
if(n==0||n==1){
System.out.println("Invalid number.");
}
else{
for(int i=2;i<=n/2;i++){

if(n%i==0){

flag=false;

}

}


if(flag=false){
System.out.println(n+" not a prime number.");
}
else{
System.out.println(n+" is a prime number.");
}
}



}
}