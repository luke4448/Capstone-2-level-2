package Poised;

import java.util.*;

public class Poised {
	
  public static void main(String[] args) {

	
	Scanner input = new Scanner(System.in);

	    // Architect input
	    System.out.println("Enter the Architect's name? ");
	    String name = input.nextLine();
	    
	    System.out.println("Enter phone number: ");
	    int Phonenumber = input.nextInt();
	    
	    System.out.println("Enter the email: ");
	    String email = input.nextLine();
	    
	    System.out.println("Enter the address: ");
	    String address = input.nextLine();
	    
	    Architect Architect = new Architect(name, Phonenumber, email, address);
	    
	    System.out.println(Architect);

	    // Project input
	    System.out.println("What is the amount? ");
	    int amount = input.nextInt();
	   	    
	    System.out.println("What is the deadline for the project? ");
	    String deadline = input.nextLine();
	    
	    System.out.println("Name of the building? ");
	    String buildingname = input.nextLine();
	    
	    System.out.println("What type of build is it? ");
	    String type = input.nextLine();
	    
	    System.out.println("What is the value of the building? ");
	    double price = input.nextDouble();
	    	    
	    System.out.println("Enter the customer's name? ");
	    
		input.nextLine();
	    
	    System.out.println("What is the address fo the building? ");
	    String buildingaddress = input.nextLine();
	    
	    System.out.println("Please enter the name of the Architect? ");
	    String name1 = input.nextLine();
	    
	    Project Project = new Project(amount, deadline, buildingname, type, price, buildingaddress, name1);

	    System.out.println(Project);
	   
	  public int inputFileSize(String fn) {
			int lines = 0;
			try {
				BufferedReader reader = new BufferedReader(new FileReader(fn));
				while (reader.readLine() != null) lines++;
				reader.close();
			}
			catch (IOException e) {
					System.out.println("File Size Error: "+e);
			}
			return lines;
		} 
   
	   try{// Creating objects
	      System.out.println("Menu: ");
	        System.out.println("A = update contractor details ");
	        System.out.println("B = update amount paid ");
	        System.out.println("C = update deadline: ");

	        String menu = input.nextLine();

	        // Updating Architect details.

	        if (menu.equals("A")) {
	            System.out.println("Enter the Architect's name: ");
	            input.nextLine();

	            System.out.println("Enter a telephone number: ");
	            input.nextInt();

	            System.out.println("Enter an email: ");
	            input.nextLine();

	            System.out.println("Enter the contractor's address: ");
	            input.nextLine();
	            
	            // User will be prompted to enter a new amount.
	            
	        if(menu.equals("B")) {
	            System.out.println("Enter the deadline: ");
	            input.nextLine();
	            Project.setDeadline(deadline);
	            System.out.println(Project);
	        }

	            // updates the deadline attribute.
	        if (menu.equals("D")) {
	                System.out.println("Enter new deadline: ");
	                String newDeadline = input.nextLine();
	                
	                Project.setDeadline(newDeadline);
	                System.out.println(Project);
	        }
	        }  
	     }catch (Exception e) {
	    	 System.out.println(e);
	     }
	   }
}



