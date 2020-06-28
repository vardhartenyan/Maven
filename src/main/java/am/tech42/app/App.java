package am.tech42.app;
import com.github.javafaker.Faker;

public class App {

	public static void main(String[] args){

	Faker faker = new Faker();

	String name = faker.name().fullName(); 
	String firstName = faker.name().firstName(); 
	String lastName = faker.name().lastName();

	String streetAddress = faker.address().streetAddress();
	System.out.println(name);
	System.out.println(firstName);
	System.out.println(lasttName);
	System.out.println(streetAddress);

	}

}