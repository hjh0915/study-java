class StudentTest {
    public static void main(String[] args) {
        Student p1 = new Student("abc", 18, "男");
        Student p2 = new Student("abcd", 22, "男");

        System.out.println("姓名：" + p1.getName());
        System.out.println("年龄：" + p1.getAge());
        System.out.println("性别：" + p1.getSex());

        System.out.println("姓名：" + p2.getName());
        System.out.println("年龄：" + p2.getAge());
        System.out.println("性别：" + p2.getSex());
    }
}