package coursesRegistration.scheduler;
/**
 * @author Aaditya Sakharam Patil
 * Provides Structure to store Course details
 */
public class Courses 
{
	String cName;
	int capacity, time;
	
	/**
	 * getters and setters
	 *
	 */
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Courses [cName=" + cName + ", capacity=" + capacity + ", time=" + time + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
