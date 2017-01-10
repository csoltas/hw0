package uchidb;


/**
 * @author aelmore
 */
public class HW0Runner {

	//TODO you likely will need to add member variable
	private static HW0Runner hw0runner = new HW0Runner();
	private HW0Runner() {}
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		return hw0runner;
	}

	public static void main(String[] args){
		
	}
}