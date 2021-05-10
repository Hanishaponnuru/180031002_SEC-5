package class3;

import java.util.Scanner;

public class problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			sum=sum*10+n%10;
			n=n/10;
		}
		System.out.println(sum);
		sc.close();

	}

}