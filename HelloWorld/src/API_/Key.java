package API_;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	@Override 
	public int hashCode() {
		return number;
	}
}
