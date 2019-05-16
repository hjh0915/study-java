public class Food {
	String name;//食物名称
	int energy;//食物的能量值
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public static Food[] getFoodsList() {
		Food foods[] = new Food[2];
		
		Food x = new Food();
		x.setName("特仑苏");
		x.setEnergy(100);
		foods[0] = x;
		
		x.setName("茶饼");
		x.setEnergy(200);
		foods[1] = x;
		
		return foods;
	}

}