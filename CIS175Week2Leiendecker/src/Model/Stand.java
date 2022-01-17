/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Jan 16, 2022
**/
package Model;

/**
 * @author jake
 *
 */
public class Stand {
	private String name;
	private String type;
	private double startCash;
	private String open;
	
	public Stand() {
		setName("Unassigned");
		setType("Empty Stand");
		setStartCash(0);
		setOpen("Closed");
	}
	
	public Stand(String name, String type, double startCash, String open) {
		setName(name);
		setType(type);
		setStartCash(startCash);
		setOpen(open);
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getStartCash() {
		return startCash;
	}

	public void setStartCash(double startCash) {
		this.startCash = startCash;
	}
}
