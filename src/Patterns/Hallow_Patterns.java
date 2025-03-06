package Patterns;

public class Hallow_Patterns {
    public static void main(String[] args) {							//******
                                        								//*    *
//		for (int i = 1; i <= 5; i++) {									//*    *
//			for (int j = 1; j<= 6; j++) {								//*    *
//				if (i == 1 || i == 5 || j == 1 || j == 6) {				//******
//				System.out.print("*");
//			} else {
//				System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}



//		for (int i = 1; i<= 5; i++) {								//    *
//			//spaces												//   * *
//			for (int j = 1; j <= 5-i; j++) {						//  *   *
//				System.out.print(" ");								// *     *
//			}														//* * * * *
//			//print star
//			for (int k = 1; k <= i; k++) {
//				if (i == 1 || i == 5 || k == 1 || k == i) {
//				System.out.print("* ");
//			} else {
//				System.out.print("  ");
//			}
//			}
//			System.out.println();
//		}




//		for (int i = 1; i <= 5; i++) {						//    *
//			for (int j = 1; j <= 5-i; j++) {				//   * *
//				System.out.print(" ");						//  *   *
//			}												// *     *
//			for (int k = 1; k <= i; k++) {					//*       *
//				if(i ==1 || k ==1 || k == i) {				// *     *
//					System.out.print("* ");					//  *   *
//				}else {										//   * *
//					System.out.print("  ");					//    *
//				}
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= 5-i; k++) {
//				if(i == 4 || k == 1 || k == 5-i) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}




//		for (char i = 'A'; i <= 'E'; i++) {					//    A
//			for (char j = 'E'; j > i; j--) {				//   B B
//				System.out.print(" ");						//  C   C
//			}												// D     D
//			for (char k = 'A'; k <= i; k++) {				//E       E
//				if(i == 'A' || k == 'A' || k == i) {		// D     D
//					System.out.print(i+" ");				//  C   C
//				}else {										//   B B
//					System.out.print("  ");					//    A
//				}
//			}
//			System.out.println();
//		}
//
//		for (char i = 'D'; i >= 'A'; i--) {
//			for (char j = 'D'; j >= i; j--) {
//				System.out.print(" ");
//			}
//			for (char k = 'A'; k <= i; k++) {
//				if(i == 'A' || k == 'A' || k == i) {
//					System.out.print(i+" ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}

    }
}
