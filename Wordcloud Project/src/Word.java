
public class Word {
	public double importance;
	public String name;
	
	public Word () {
	}
	
	public void setImp(int i) {
		importance = i;
	}
	
	public void setImp(double i) {
		importance = i;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public double getImp() {
		return importance;
	}
	
	public String print() {
		return name + " " + importance;
	}
	
	public String get() {
		 return name + " " + importance; 
	 }
}
