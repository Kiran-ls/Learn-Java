package Patterns;

public class Num_Patterns {
    public static void main(String[] args) {    //1      			//1
        // TODO Auto-generated method stub		//12				//1 2
//		for (int i = 1; i <= 5; i++) {			//123				//1 2 3
//			for (int j = 1; j<= i; j++) {		//1234				//1 2 3 4
//				System.out.print(j);			//12345				//1 2 3 4 5 for this add (s.o.p(j + " "); to the printing line
//			}
//			System.out.println(" ");
//		}


//		for (int i = 5; i >= 1; i--) {		//12345
//			for (int j = 1; j <= i; j++) {	//1234
//				System.out.print(j);		//123
//			}								//12
//			System.out.println(" ");		//1
//		}



//		for(int i = 1; i <= 5; i++) {			//5
//			for(int j = 5; j >= 6-i; j--) {		//54
//				System.out.print(j);			//543
//			}									//5432
//			System.out.println(" ");			//54321
//		}
//


//		for (int i = 5; i >= 1; i--) {			//54321
//			for (int j = 5; j >= 6-i; j--) {	//5432
//				System.out.print(j);			//543
//			}									//54
//			System.out.println(" ");			//5
//		}



//		for (int i = 1; i <= 5; i++) {		//1
//		for (int j = 1; j<= i; j++) {		//1 * 2
//			System.out.print(j);			//1 * 2 * 3
//			if(j < i){						//1 * 2 * 3 * 4
//				System.out.print(" * ");	//1 * 2 * 3 * 4 * 5
//			}
//		}
//		System.out.println(" ");
//	}


//
//		for (int i = 1; i <= 5; i++) {		//10
//		for (int j = 1; j<= i; j++) {		//10 * 20
//			System.out.print(j * 10);		//10 * 20 * 30
//			if(j < i){						//10 * 20 * 30 * 40
//				System.out.print(" * ");	//10 * 20 * 30 * 40 * 50
//			}
//		}
//		System.out.println(" ");
//	}


//		int x = 1;
//		for (int i = 1; i <= 4; i++) {		//1
//		for (int j = 1; j<= i; j++) {		//2 3
//			System.out.print(x + " ");		//4 5 6
//			x++;							//7 8 9 10
//		}
//		System.out.println(" ");
//	}


//		for (int i = 1; i <= 5; i++) {			//1
//			for (int j = 1; j <= i; j++) {		//1 2 1
//				System.out.print(j+ " ");		//1 2 3 2 1
//			}									//1 2 3 4 3 2 1
//			for (int j = i-1 ; j >= 1; j--) {	//1 2 3 4 5 4 3 2 1
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}



//		for (int i = 1; i <= 5; i++) {					//    1
//			for (int j = 5; j > i; j--) {				//   2 2
//				System.out.print(" ");					//  3   3
//			}											// 4     4
//			for (int k = 1; k <= i; k++) {				//5       5
//				if (i == 1 || k == 1 || k == i) {		// 4     4
//				System.out.print(i + " ");				//  3   3
//			} else {									//   2 2
//				System.out.print("  ");					//    1
//				}
//			}
//			System.out.println();
//		}
//
//		for (int i = 4; i >= 1; i--) {
//			for (int j = 5; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				if (i == 1 || k == 1 || k == i) {
//				System.out.print(i + " ");
//			} else {
//				System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}


    }
}
