import java.util.*;

interface Person {
    public void whoami(); 
}

class Teacher implements Person {
    // @Override
    public void whoami() {
        System.out.println("我是一个老师");
    }
}

class Student implements Person {
    // @Override
    public void whoami() {
        System.out.println("我是一个学生");
    }
}

class HeadTeacher implements Person {
    // @Override
    public void whoami() {
        System.out.println("我是一个校长");
    }
}

public class App04 {
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