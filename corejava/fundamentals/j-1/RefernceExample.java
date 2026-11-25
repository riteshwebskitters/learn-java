public class RefernceExample {
    public static void main(String[] args){
        int x = 10;

        Student s1 = new Student();

        s1.age = 25;

        Student s2 = s1;

        s2.age = 30;

        s2 = new Student();

        s2.age = 40;

        System.out.println(x);
        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}

class Student {
    int age;
}
