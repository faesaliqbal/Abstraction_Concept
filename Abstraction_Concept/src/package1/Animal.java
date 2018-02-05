package package1;

public abstract class Animal {
	
	int legs = 0;
	
	/*
	 * Abstraction
	 * Data abstraction provides the outside world with only essential information in a process of representing essential features without including implementation details.
	 * A good real world example is book.
	 * When you hear the term book, you don't know the exact specifics, such as the page count, the color, or the size, but you understand the idea, or abstraction, of a book.
	 * The concept of abstraction is that we focus on essential qualities, rather than the specific characteristics of one particular example.
	 */
	
	/*
	 * In Java, abstraction is achieved using abstract classes and interfaces.
	 *  
	 */
	
	/*
	 * If a class is declared abstract, it can not be instantiated.
	 * To use an abstract class, you will have to inherit it from another class.
	 * Any class that contains an abstract method should be defined as abstract.
	 */
	
	/*
	 * Abstract Method
	 * a method that is declared without an implementation (without braces, and followed by a semicolon)
	 */
	
	//Every animal makes a sound, but each has a different way to do it.
	//That's why we define an abstract class Animal, and leave the implementation of how they make sounds to the subclasses.
	//This is used when there is no meaningful definition for the method in the superclass
	abstract void makeSound();
	
	//non abstract method
	public void walk(){
		System.out.println("Animal walks");
	}

}
