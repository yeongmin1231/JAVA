package sec05.exam05;

public class person {
    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567". "홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);
    }
}