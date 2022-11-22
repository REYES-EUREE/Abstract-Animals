package lodicakes;

import java.util.*;
public class RunAnimal {
	
public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	
	Bird b = new Bird();
	Cat c = new Cat();
	Dog d = new Dog();
	
	System.out.print("Choose an Animal. Press 'B' for Bird, 'C' for Cat, 'D' for Dog: ");
	String ins = inp.nextLine();
	
	if(ins.equalsIgnoreCase("B")){
		b.eat();
		b.sleep();
		b.makeSound();
		}
	if(ins.equalsIgnoreCase("C")){
		c.eat();
		c.sleep();
		c.makeSound();
		}
	if(ins.equalsIgnoreCase("D")){
		d.eat();
		d.sleep();
		d.makeSound();
		}
	}
}
