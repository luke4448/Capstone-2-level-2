package Poised;

public class Person {

    //Attributes
    String personName;
    String personAddress;
    int personPhoneNumber;
    String personEmailAddress;

    //Constructor
    public Person() {}

    public String toString() {
        String output = "Name: " + personName;
        output += "\nAddress: " + personAddress;
        output += "\nPhone Number: " + personPhoneNumber;
        output += "\nEmail Address: " + personEmailAddress;
        return output;
    }
}
