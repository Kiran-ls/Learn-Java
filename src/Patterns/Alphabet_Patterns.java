package Patterns;

public class Alphabet_Patterns {
    public static void main(String[] args) {    
//		for (char i = 'A'; i <= 'D'; i++) {         //AAAA
//			for (char j = 'A'; j <= 'D'; j++) {		//BBBB
//				System.out.print(i);				//CCCC
//			}										//DDDD
//			System.out.println();
//		}



//		for (char i = 'A'; i <= 'D'; i++) {         //ABCD
//			for (char j = 'A'; j <= 'D'; j++) {		//ABCD
//				System.out.print(j);				//ABCD
//			}										//ABCD
//			System.out.println();
//		}



//		for (char i = 'D'; i >= 'A'; i--) {      //DDDD
//		for (char j = 'A'; j <= 'D'; j++) {		 //CCCC
//			System.out.print(i);				 //BBBB
//		}										 //AAAA
//		System.out.println();
//	}




//		for (char i = 'A'; i <= 'D'; i++) {			//A
//			for (char j = 'A'; j <= i; j++) {		//AB
//			System.out.print(j);					//ABC
//		}											//ABCD
//		System.out.println();
//	}



//		for (char i = 'A'; i <= 'D'; i++) {			//A
//		for (char j = 'A'; j <= i; j++) {		    //BB
//		System.out.print(i);					    //CCC
//	  }											    //DDDD
//	  System.out.println();							//CCC
//		}											//BB
//	  for (char i = 'C'; i >= 'A'; i--) {			//A
//		  for (char j='A'; j <= i; j++) {
//			  System.out.print(i);
//		  }
//		  System.out.println();
//	  }



//		for (int i = 1; i <= 5; i++) {         //E pattern;
//			for (int j = 1; j <= 5; j++) {
//				if (i == 1 || i == 3 || i == 5 || j == 1) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

        int size=5;
        for(int i = 0; i < size; i++) {
            System.out.print("*");
            for(int j = 0; j < size-1; j++) {
                if((i + j == size /2) ||(i - j == size / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
