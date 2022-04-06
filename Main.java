package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Seri kaç elemanlý olacak: ");
		int serialLength=scanner.nextInt();
		int[] dizi=new int[serialLength];
		for(int i=0;i<=serialLength-1;i++) {
			dizi[i]=i;
			if(i==2) {
				dizi[i]=i-1;
			}
			if(i>2) {
				dizi[i]=dizi[i-1]+dizi[i-2];
			}
			System.out.print(dizi[i]+" ");
		}
	}

}
