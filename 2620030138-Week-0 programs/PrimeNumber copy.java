import java.util.Scanner;
class primedemo{
public static void main(String[] args){
int n , ctr=0;
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
for(int i= 1;i<=n;i++)
{
if(n%i==0)
   ctr=ctr+1;
}
if (ctr==2)
  System.out.println("true");
else
  System.out.println("false");

}
}