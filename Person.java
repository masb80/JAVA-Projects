//package main.java;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }

	@Override
	public int compareTo(Person per) {
		if(this.age == per.age)
            return 0;
        else
            return this.age > per.age ? 1 : -1;
	}
	
    @Override
    public String toString() {
    	return "<" + name + ", " + age + ">";
    }
	
	public static void main(String[] args) {
        Person e1 = new Person("Adam", 45);
        Person e2 = new Person("Steve", 60);
        
        int retval = e1.compareTo(e2);
        switch(retval) {
            case -1: {
                System.out.println(e2.getName() + " is older!");
                break;
            }
            case 1: {
                System.out.println(e1.getName() + " is older!");
                break;
            }
            default:
                System.out.println("The two persons are of the same age!");
        }
    }
}
