import java.util.Scanner;

public class FibonacciPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; // �Ǻ���ġ n��°�� ������ ����
		int first = 0;
		int second = 1;
		int next = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ǻ���ġ ������ ������ ���� �Է��Ͻÿ� : ");
		n = sc.nextInt();
		
		
		for(int i =1; i<=n; i++) {
			if(i <= 2) {
				System.out.print(i-1);
				sum += (i-1);
			}
			else {
				next = first + second;
				System.out.print(next);
				first = second; // next�� ����� �� first ���� �տ� �ִ� second ������ �ٲ��� ��
				second = next;  // next�� ����� �� second ���� �տ� �ִ� next ������ �ٲ��� ��
				sum += next;
			}
			if(i<n) {
				System.out.print(" , ");
			}
		}
		System.out.println();
		System.out.println("���� �հ� : " + sum);
		
	}

}
