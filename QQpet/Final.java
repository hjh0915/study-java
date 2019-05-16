import java.util.Scanner;
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet p = new Pet();
    	p.setQqid("513011705");
    	p.setName("小鱼儿");
    	p.setGender("QGG");
    	p.setGrade(58);
    	p.setGrowth(53921);
    	p.setPower(5395);
    	p.setIntellect(5276);
    	p.setCharm(4669);
    	p.setHunger(610);
    	p.setCleaning(782);
    	System.out.println(p.toString()+"\n");
    	
    	Detergent d = new Detergent();
    	d.setName("宝宝金水");
    	d.setEnergy(120);
    	p.detergent(d);
    	System.out.println(p.toString() + "\n");
    	
    	Course c = new Course();
    	c.setName("JAVA");
    	c.setType("智力");
    	c.setEnergy(100);
    	p.study(c);
    	System.out.println(p.toString() + "\n");
    	
    	Food f[] = Food.getFoodsList();
    	Scanner input = new Scanner(System.in);
    	for (int i=0; i<f.length; i++) {
    		System.out.println((i+1)+":" + f[i].getName() + "能量值：" + f[i].getEnergy());
    	}
    	System.out.println("请输入数字选择你要的食物：");
    	int x = input.nextInt();
    	if (x<1 || x>f.length) {
    		System.out.println("没有任何东西！");
    	}
    	else {
    		Food f1 = f[x-1];
    		p.feed(f1);
    	}
 
    	System.out.println(p.toString());
        input.close();  	

	}

}