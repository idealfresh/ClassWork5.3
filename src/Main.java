import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int chislo = sc.nextInt();
		int sum =0;
		while(chislo !=0){
			sum += chislo; 
			System.out.println(sum);
			chislo = sc.nextInt();
			
		}
		System.out.println(sum);
for (int i = 0; i < 100; i++){
			if(i % 7 ==0){
				System.out.println(i);
			}
			if(i % 11 ==0){
				System.out.println(i);
			}
			
			
		}
for (int i = 1; i < 100; i++){
			if(i % 7 ==0 || i % 11 ==0){
				System.out.print(i + " ");
			}
			
		}
	}

}
