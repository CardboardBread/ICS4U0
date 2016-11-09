package shapes;

public class Rectangle {
		
	public float volume (int height, int length) {
		float volume = height * length;
		return volume;
	}
	
	public float perimeter (int height, int length) {
		float perimeter = (2 * height) + (2 * length);
		return perimeter;
	}
}