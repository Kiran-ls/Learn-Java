package Patterns;

public class Pattern2 {
    public static void main(String[] args) {

//		for (int i = 1; i <= 4; i++) {                     //1111
//			for (int j = 1; j <= 4; j++) {				   //2222
//				System.out.print(i);				       //3333
//			}											   //4444
//			System.out.println(" ");
//		}


//		for (int i = 1; i <= 4; i++) {			//1234
//			for (int j = 1; j <= 4; j++) {		//1234
//				System.out.print(j);			//1234
//			}									//1234
//			System.out.println(" ");
//		}




//		for (int i = 4; i >= 1; i--) {			//4444
//			for (int j = 4; j >= 1; j--) {		//3333
//				System.out.print(i);			//2222
//			}									//1111
//			System.out.println(" ");
//		}



        for (int i = 4; i >= 1; i--) {			//4321
            for (int j = 4; j>= 1; j--) {		//4321
                System.out.print(j);			//4321
            }									//4321
            System.out.println(" ");
        }
    }
}

