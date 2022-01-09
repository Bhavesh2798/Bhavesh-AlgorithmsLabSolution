import java.util.Scanner;
public class PayMoney {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int list[];
		int size=0, t=0, target=0, sum=0;
		
		System.out.println("Enter the size of transaction Array");
		size=sc.nextInt();
		list=new int[size];
		System.out.println("Enter the value of array");
		for(int i=0;i<size;i++)
			list[i]=sc.nextInt();
		System.out.println("Enter the total number of targets that needs to be achived");
		t=sc.nextInt();

		System.out.println("Enter the value of target");
		target=sc.nextInt();
		for(int i=0;i<size;i++) {
			sum=sum+list[i];
			if(sum>=target) {
				System.out.println("Target achived after "+(i+1)+" transaction");
				break;
			}
			
		}
		if(sum<target) {
			System.out.println("Target is not achived");
		}
	}
}
