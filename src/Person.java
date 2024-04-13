public class Person {
    private String name;
    private String location;
    private int age;
    public Person(String name, String location, int age) {
        this.name = name;
        this.location = location;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public int getAge() {
        return age;
    }
}
