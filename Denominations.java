import java.util.Scanner;
public class Denominations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=0;
		int note[];
		int amount=0;
		int noteCount[] = new int[9];
		System.out.println("Enter the size of currency denominations");
		size=sc.nextInt();
		note=new int[size];
		System.out.println("Enter the size of currency denominations value");
		for(int i=0;i<size;i++)
			note[i]=sc.nextInt();
		
				
		System.out.println("Enter the amount you want to pay");
		amount=sc.nextInt();

		//Arranging Currency order
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(note[j]<note[j+1]) {
					int temp=note[j];
					note[j]=note[j+1];
					note[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<size;i++)
			System.out.println(note[i]);

		
		System.out.println("Your payment approach in order to give min no of notes will be :-");
		for (int i = 0; i < size; i++) {
            if (amount >= note[i]) {
                noteCount[i] = amount / note[i];
                amount = amount - noteCount[i] * note[i];
            }
        }

        for (int i = 0; i < 9; i++) {
            if (noteCount[i] != 0) {
                System.out.println(note[i] + " : "
                    + noteCount[i]);
            }
        }
	}
}
