import java.util.Scanner; //importing Scanner.

public class Figures {

    private static Scanner scn = new Scanner (System.in);
    
    private static int size = 0;
    
    public static void main (String[]args) {
    	
    	//Ask for user input.
        System.out.println ("Enter the size of figure (odd number): ");
        
        int n = scn.nextInt ();
        
        //While statement for non-odd number.
        while (n % 2 == 0) {
        	
            System.out.print ("Invalid figure size - must be an odd number ");
            
            System.out.println ("\n\nRe-enter the size of figure: ");
            
            n = scn.nextInt();
            
            System.out.println (" ");
        }
        
        int size = n;
        
        printMenu();
        
        int option = scn.nextInt();
        
        //While statement to cycle through options.
        while (true){
        	
            switch (option) {
            
                case 1:
                	
                	System.out.println (" ");
                    printBox (n);
                    System.out.println ("\n");
                    break;
                    
                case 2:
                	
                	System.out.println (" ");
                    printDiamond (n);
                    System.out.println ("\n");
                    break;
                    
                case 3:
                	
                	System.out.println (" ");
                    printX (n);
                    System.out.println ("\n");
                    break;
                    
                case 4:
                	
                	System.out.println (" ");
                    System.out.println ("Good bye!");
                    System.exit (0);
            }

            printMenu();
            
            option = scn.nextInt();
        }
        
    }

    private static void printMenu () {
        System.out.println ("MENU:");
        
        System.out.println ("1. Print box");
        
        System.out.println ("2. Print diamond");
        
        System.out.println ("3. Print X");
        
        System.out.println ("4. Quit");
        
        System.out.println ("\nPlease select an option: ");
    }
    
    private static void printX (int size) {
        
        for (int x = 1; x <= size; x++) {
        	
            for (int y = 1; y <= size; y++) {
            	
                //x==y diagonal for stars in certain areas.
                if (x == y)
                	
                    System.out.print("X");
                
                //Other side of the diagonal.
                else if (y == size - x + 1)
                    System.out.print ("X");
                
                // else fill with space
                else
                    System.out.print (" ");
            }
            System.out.println ();
        }

        
        
    }

    private static void printDiamond (int size) {
    
        //First half of the diamond.
        int space = size / 2;
        
        for (int x = 0; x < size / 2 + 1; x++) {
        	
            //printing the space
            for (int y = 0; y < space ; y++) {
                
            	System.out.print(" ");
            }
            
            System.out.print("X");
            
            for (int y = 0; y < 2 * x; y++) {
                
            	System.out.print (" ");
            }
            
            System.out.print("X");
            
            System.out.println ();
            
            space--;
        }

        // other other half \/
        space = size/2;
        
        for (int x = 1; x < size /2 + 1; x++) {
        	
            //printing the space
            for (int y = 0; y < x; y++) {
                
            	System.out.print(" ");
            }
            
            System.out.print("X");
            
            for (int y = 0; y < 2* (space - 1); y++) {
                
            	System.out.print (" ");
            }
            
            System.out.print("X");
            
            System.out.println ();
            
            space--;
        }
        
    }

    private static void printBox (int size) {
    	
		//Setting my x,y column/row loops and printing stars that space.
		for(int x = 0; x < size; x++) {

		for(int y = 0; y < size; y++) 

		System.out.print ("X");
		
		System.out.println ();
	}
        
   }

    public static int getSize() {
        return size;
    }
}