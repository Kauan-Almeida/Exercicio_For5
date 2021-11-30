import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n= sc.nextInt();
		
		int soma=n;
		for (int i=1; i<n; i++) {
				soma = soma*i;
		}
		if ( soma==0) {
			System.out.println("1");
		}
		else
		System.out.println(soma);
		
		sc.close();

	}

}
