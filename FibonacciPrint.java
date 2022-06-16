import java.util.Scanner;

public class FibonacciPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; // 피보나치 n번째를 저장할 변수
		int first = 0;
		int second = 1;
		int next = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피보나치 수열의 마지막 항을 입력하시오 : ");
		n = sc.nextInt();
		
		
		for(int i =1; i<=n; i++) {
			if(i <= 2) {
				System.out.print(i-1);
				sum += (i-1);
			}
			else {
				next = first + second;
				System.out.print(next);
				first = second; // next를 계산한 뒤 first 값은 앞에 있던 second 값으로 바뀌어야 함
				second = next;  // next를 계산한 뒤 second 값은 앞에 있던 next 값으로 바뀌어야 함
				sum += next;
			}
			if(i<n) {
				System.out.print(" , ");
			}
		}
		System.out.println();
		System.out.println("수열 합계 : " + sum);
		
	}

}
