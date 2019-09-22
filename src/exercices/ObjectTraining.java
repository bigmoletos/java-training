public class ObjectTraining {

	// TODO 1. Add the following private attributes :
	// - name (String)
	// - age (int)
	// - wilder (boolean)
	private String name;
	private int age;
	private boolean wilder;

	// Do not remove this empty constructor !
	public ObjectTraining() {
	}

	// TODO 2. Add a Constructor with name and age arguments (in this order)
	// This constructor must initialize name and age attributes
	/**
	 * @param name
	 * @param age
	 */
	public ObjectTraining(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// TODO 3. Add getter method for name attribute
	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	// TODO 4. Add setter method for name attribute
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	// TODO 5. Add getter method for age attribute
	/**
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}
	// TODO 6. Add setter method for age attribute

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	// TODO 7. Add getter method for wilder attribute

	/**
	 * @return the wilder
	 */
	public boolean isWilder() {
		return this.wilder;
	}

	// TODO 8. Add setter method for wilder attribute

	/**
	 * @param wilder the wilder to set
	 */
	public void setWilder(boolean wilder) {
		this.wilder = wilder;
	}

	// TODO 9. Create a method 'whoAmI' that returns "My name is {name} and I'm
	// {age}"
	// where you replace {name} and {age} with attributes values
	public String whoAmI() {
		return "My name is " + getName() + " and I'm " + getAge();
	}
}
