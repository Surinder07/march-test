public class PersonImpl {

    public static void main(String[] args) {

        Person person1 = new Person("Dhruv Tailor", "Kitchener", 27);
        Person person2 = new Person("Elon musk", "Newyork", 55);

        System.out.println("Person-1, Name: "+person1.getName()+" | Location : "+person1.getLocation()+" | Age : "+person1.getAge());
        System.out.println("Person-2, Name: "+person2.getName()+" | Location : "+person2.getLocation()+" | Age : "+person2.getAge());

    }

}
