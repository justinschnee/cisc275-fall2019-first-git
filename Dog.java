public class Dog extends Animal {

	public Dog(String n, int l) {
		this.name = n;
		this.legs = l;

	}
	
	@Override
	public String toString() {
		return name + " has " + legs + " legs";
	}
	
}