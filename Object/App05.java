import java.util.*;

abstract class Person {
    String name;
    public void whoami() {
        // System.out.println("我是一个人");
    }
}

class Teacher extends Person {
    // @Override
    public void whoami() {
        System.out.println("我是一个老师");
    }
}

class Student extends Person {
    // @Override
    public void whoami() {
        System.out.println("我是一个学生");
    }
}

class HeadTeacher extends Person {
    // @Override
    public void whoami() {
        System.out.println("我是一个校长");
    }
}

public class App05 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        HeadTeacher h = new HeadTeacher();

        List<Person> p = new ArrayList();
        p.add(t);
        p.add(s);
        p.add(h);

        // for (int i=0; i<p.size(); i++) {
        //     p.get(i).whoami();
        // }

        for (Person x : p) {
            x.whoami();
        }
    }
}