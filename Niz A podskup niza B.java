package cetrnaestidomaci;

import java.util.Scanner;

public class DrugiZadatak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n, m;
		System.out.println("Unesite broj elemenata niza A: ");
		n = sc.nextInt();
		int[] a = unesiNiz(n);

		ispisiNiz(a);

		System.out.println("Unesite broj elemenata niza B: ");
		m = sc.nextInt();

		while (m < n) {
			System.out.println("Niz B mora da ima vise elemenata od niza A. Unesite ponovo: ");
			m = sc.nextInt();
		}
		
		int[] b = unesiNiz(m);
		
		ispisiNiz(b);

		System.out.println();
		if (podskup(a, b)) {
			System.out.println("Niz A jeste podskup niza B");
		} else {
			System.out.println("Niz A nije podskup niza B");
		}
	}

	static boolean podskup(int[] A, int[] B) {
		boolean tr = false;
		for (int i = 0; i < A.length; i++) {
			tr = false;
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					tr = true;
					B[j] = 0;
					break;
				}
			}
			if (tr == false) {
				break;
			}
		}
		return tr;
	}
	
	static int[] unesiNiz (int br) {
		int[] niz = new int[br];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random() * 10 + 1);
		}
		return niz;
	}
	
	static void ispisiNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

	}

}
