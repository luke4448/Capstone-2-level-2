package Poised;

public class Project {
	  // Info on Project
	  private double amount;
	  private String deadline;
	  private String buildingname;
	  private String type;
	  private double price;
	  private String customer;
	  private String buildingaddress;
	  private Architect name1;

	  // Method
	  public Project(int amount, String deadline, String buildingname, String type,
	    double price, String customer, String buildingaddress) {
	    this.amount = amount;
	    this.deadline = deadline;
	    this.buildingname = buildingname;
	    this.type = type;
	    this.price = price;
	    this.customer = customer;
	    this.buildingaddress = buildingaddress;
	  }

	public void setDeadline(String Deadline) {
		this.deadline = Deadline;
	}

	public String toString() {
	    String output = "Name: " + this.buildingname;
	    output += "\nType:" + this.type;
	    output += "\nPrice:" + this.price;
	    output += "\nCustomer:" + this.customer;
	    output += "\nAddress:" + this.buildingaddress;
	    output += "\nAmount:" + this.amount;
	    output += "\nArchitect:" + this.name1;
	    
	    return output;
	  }

	}

		
	
