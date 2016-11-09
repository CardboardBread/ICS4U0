package shapes;

public class Sphere {

	public double volume (int radius) {
		double volume = (4 / 3) * Math.PI * radius;
		return volume;
	}
	
	public double surfacearea (int radius) {
		double surface = 4 * Math.PI * Math.pow(radius, 2);
		return surface;
	}
	
	public String location (int radius, int x, int y, int z) {
		String out = (x + "^2 " + y + "^2 " + z + "^2 = " + radius + "^2");
		return out;
	}
}