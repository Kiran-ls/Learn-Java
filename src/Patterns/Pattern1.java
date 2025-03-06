package Patterns;

public class Pattern1 {
    public static void main(String[] args) { 		//*****
                                        			//*****
//		for (int i =1; i <= 4; i++) {				//*****
//			for (int j = 1; j <= 5; j++) {			//*****
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}




//		for (int i = 1; i <= 3; i++) {				******
//			for (int j = 1; j <= 6; j++) {			******
//				System.out.print("*");				******
//			}
//			System.out.println();
//		}


//		for (int i = 1; i <= 3; i++) {			_******
//			for (int j = 1; j <= i; j++) {		__******
//				System.out.print(" ");			___******
//			}
//			for (int k = 1; k <= 6; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}



//		for (int i = 1; i <= 5; i++) {       //*
//			for (int j = 1; j <= i; j++) {	 //**
//				System.out.print("*");		 //***
//			}								 //****
//			System.out.println();			 //*****
//		}


//		for (int i = 5; i >= 1; i--) {		//*****
//			for (int j = 1; j <= i; j++) {	//****
//				System.out.print("*");		//***
//			}								//**
//			System.out.println();			//*
//		}


        //INVERTED PYRAMID PATTERN 1
//		for (int i = 5; i >= 1; i--) {		//*****
//			//j to leave space				// ****
//			for (int j = 5; j > i; j--) {	//  ***
//				System.out.print(" ");		//   **
//			}								//    *
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}


        //INVERTED PYRAMID PATTERN 2
//		for (int i = 1; i <= 5; i++) {		//    *
//			//j to leave space				//   **
//			for (int j = 5; j > i; j--) {	//  ***
//				System.out.print(" ");		// ****
//			}								//*****
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

        //PYRAMID

//		for (int i = 1; i <= 5; i++) {		//     *
//			//j to leave space				//    * *
//			for (int j = 5; j > i; j--) {	//   * * *
//				System.out.print(" ");		//  * * * *
//			}								// * * * * *
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}



//
//		for (int i = 5; i >= 1; i--) {		//* * * * *
//			for (int j = 5; j > i; j--) {	// * * * *
//				System.out.print(" ");		//  * * *
//			}								//   * *
//			for (int k = 1; k <= i; k++) {	//    *
//				System.out.print("* ");
//			}
//			System.out.println();
//		}


//		for (int i = 1; i <= 5; i++) {			//    *
//			for (int j = 5; j >= i; j--) {		//   * *
//				System.out.print(" ");			//  * * *
//			}									// * * * *
//			for (int k = 1; k <= i; k++) {		//* * * * *
//				System.out.print("* ");			// * * * *
//			}									//  * * *
//			System.out.println();				//   * *
//		}										//    *
//		for (int i = 5-1; i >= 1; i--) {
//			for (int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}



//		for (int i = 5; i >= 2; i--) {					//*********
//			for (int j = 5; j >= i; j--) {				// *******
//				System.out.print(" ");					//  *****
//			}											//   ***
//			for (int k = 1; k <= (i*2)-1; k++) {		//    *
//				System.out.print("*");					//   ***
//			}											//  *****
//			System.out.println();						// *******
//		}												//*********
//
//		for (int i = 1; i <= 5; i ++) {
//		//j to leave space
//		for (int j = 5; j >= i; j--) {
//			System.out.print(" ");
//		}
//		for (int k = 1; k <= (i*2)-1; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}


//
//		for (int i = 3; i >= 1; i--) {					//*****
//			for (int j = 3; j > i; j--) {				// ***
//				System.out.print(" ");					//  *
//			}											// ***
//			for (int k = 1; k <= (i*2)-1; k++) {		//*****
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 2; i <= 3; i++) {
//			for (int j = 3; j > i; j--) {
//				System.out.print("_");
//			}
//			for (int k = 1; k <= (i*2)-1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
    }

}
