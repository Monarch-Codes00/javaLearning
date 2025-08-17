package abc.com;

public class Test {
    long id;
    String name;
    String stack;
    int age;
    Gend gender;

    public Test(long id, String name, String stack, int age, Gend gender) {
        this.id = id;
        this.name = name;
        this.stack = stack;
        this.age = age;
        this.gender = gender;
    }

    public void display() {
        System.out.println(
                "ID: " + id +
                        ", Name: " + name +
                        ", Stack: " + stack +
                        ", Age: " + age +
                        ", Gender: " + gender
        );
    }
}
