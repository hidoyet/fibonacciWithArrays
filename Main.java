package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Seri kaç elemanlı olacak: ");
		int serialLength=scanner.nextInt();
		int[] arr=new int[serialLength];
		for(int i=0;i<=serialLength-1;i++) {
			arr[i]=i;
			if(i==2) {
				arr[i]=i-1;
			}
			if(i>2) {
				arr[i]=arr[i-1]+arr[i-2];
			}
			System.out.print(arr[i]+" ");
		}
	}

}
