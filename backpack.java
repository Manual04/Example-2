import java.util.*;
public class backpack{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String avatar = "";
		String[] backpack = new String[10];
		boolean play = true;
		
		
		System.out.println("Enter player name: ");
		avatar = input.next(); 
		
		System.out.println("Hello "+ avatar);
		System.out.print("This is an adventure game and you will begin by filling your backpack.");
		
		while(play) {
			System.out.println("Would you like to:");
			System.out.println("1 - fill your backpack");
			System.out.println("2 - look in backpack");
			System.out.println("3 - search your backpack");
			System.out.println("4 - empty your backpack");
			System.out.println("5 - quit");
			
			int answer = input.nextInt();
			
			switch(answer) {
			
			    case 1:
			    	backpack[] = fill(backpack[]);  
			    case 2:
		    	    backpack[] = look(backpack[]);
			    case 3:
		    	    backpack[] = search(backpack[]);  
			    case 4:
		    	    backpack[] = empty(backpack[]);
			    case 5:
		    	        play = false;
		    	        System.out.print("Bye.");
			    	
			}//closes switch
		}//closes while loop
	}//closes main
	
	
	public static String[] fill(String[] pack) {
		for(int i = 0; i < pack.length; i++) {
			System.out.println("What would you like to add to your bakcpack?");
			backpack[i] = input.next();
		}//closes for loop
		System.out.println("All filled."); 
	}//closes fill
	
}//closes Backpack class