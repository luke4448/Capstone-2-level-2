package Poised;

public class Architect extends Person {
	 
	  private String personName;
	  private double personPhoneNumber;
	  private String personEmailAddress;
	  private String personAddress;

	// Constructor
	Architect(String name, int number, String email, String address) {
	    this.personName = name;
	    this.personPhoneNumber = number;
	    this.personEmailAddress = email;
	    this.personAddress = address;
	  }

	  
	    // Getters
	    public String getArchitect() {
	      return personName;
	    }
	   

 	    // Methods
	    public String toString() {
	      String output = "Name: " + this.personName;
	      output += "\nNumber:" + this.personPhoneNumber;
	      output += "\nEmail:" + this.personEmailAddress;
	      output += "\nAddress:" + this.personAddress;
	      
	      return output;
	    }
	  }
 
