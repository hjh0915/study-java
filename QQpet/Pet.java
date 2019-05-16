public class Pet {
	private String qqid;
	private String name;
	private String gender;//性别, 取值为QGG或QMM
	private int grade;//宠物等级
	private int growth;//成长点
	private int power;//体力值
	private int intellect;//智力值
	private int charm; //魅力值
	private int hunger;//饥饿度
	private int cleaning;//清洁度
	
	public String getQqid() {
		return qqid;
	}
	
	public void setQqid(String qqid) {
		this.qqid = qqid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrowth() {
		return growth;
	}
	
	public void setGrowth(int growth) {
		this.growth = growth;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getIntellect() {
		return intellect;
	}
	
	public void setIntellect(int intellect) {
		this.intellect = intellect;
	}
	
	public int getCharm() {
		return charm;
	}
	
	public void setCharm(int charm) {
		this.charm = charm;
	}
	
	public int geHunger() {
		return hunger;
	}
	
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	
	public int getCleaning() {
		return cleaning;
	}
	
	public void setCleaning(int cleaning) {
		this.cleaning = cleaning;
	}
	
	public String toString(){
		String str;
		
		str = gender+"："+name+"\n";
		str += "等级"+grade+"，成长点："+growth+"\n";
		str += "武力值："+power+"，智力值："+intellect+"，魅力值："+charm+"\n";
		str += "饥饿度："+hunger+"/1000，清洁度："+cleaning+"/1000	";
			
		return str;
	}

    //喂养方法
    public void feed(Food x) {
    	System.out.println("食物名称：" + x.getName());
    	hunger += x.getEnergy();
    	if (hunger <= 1000)
    	growth++;	
    }
   
    //清洁方法
    public void detergent(Detergent x) {
    	System.out.println("清洁用品：" + x.getName());
    	cleaning += x.getEnergy();
    	if (cleaning <= 1000)
    	growth++;
    }
   
    //学习方法
    public void study(Course x) {
    	System.out.println("课程：" + x.getName());
    	if (x.getType().equals("体力"))
    		power += x.getEnergy();
    	else if (x.getType().equals("智力"))
    		intellect += x.getEnergy();
    	else
    		charm += x.getEnergy();
    	growth++;
    }
}