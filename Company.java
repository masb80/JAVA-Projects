//package main.java;

public class Company {
	
	private int num_of_employess;
    private String name;
    
    public Company(String name, int num_of_employess) {
        this.name = name;
        this.num_of_employess = num_of_employess;
    }
    
    public int getNumOfEmployess() {
        return this.num_of_employess;
    }
    
    public String getName() {
        return this.name;
    }
}
