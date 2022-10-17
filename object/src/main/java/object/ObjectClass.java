package object;

public class ObjectClass {
    public static void main(String[] args) {
        //ex1
        String str1 = "hi";
        String str2 = new String("hi");
        System.out.println(str1.equals(str2));
        //ex2
        Person p1 = new Person(25, "Lee");
        Person p2 = new Person(25, "Lee");
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }

    static class Person{
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Person) {
                Person person = (Person) obj;
                if (this.age == person.age && this.name.equals(person.name)) {
                    return true;
                }
            }
            return false;
        }
    }
}
