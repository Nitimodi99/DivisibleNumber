//print all the number in a range that is divisible by a given number
import java.util.*;
class divisible{

	public static void main(String[] args) {
		
		int n,n1,n2;
		System.out.println("enter n1 n2 and n");
		int[] a=new int[10];
		Scanner in = new Scanner(System.in);
		n1=in.nextInt();
		n2=in.nextInt();
		n=in.nextInt();
		int k=-1;
		for(int i=n1;i<n2;i++){

			if(i%n==0){
				a[++k]=i;
				System.out.println(a[k]);

			}
		}
	}
}