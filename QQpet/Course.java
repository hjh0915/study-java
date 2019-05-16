public class Course {
	String name;//课程名称
	String type;//课程类型,课程分为不同的类型，分别增加体力、智力和魅力值，相应的类型取值分别为"体力"、"智力"、"魅力"
	int energy;//能力增长值
	
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
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}

}