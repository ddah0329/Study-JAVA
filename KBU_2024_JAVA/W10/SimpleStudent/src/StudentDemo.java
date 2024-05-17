public class StudentDemo {
    public static void main(String[] args) {
        Address homeAddress_James = new Address("서울시", "강남구", " ");
        Address schoolAddress_James = new Address("서울시", "노원구", " ");

        Address homeAddress_Jimmy = new Address("강원도", "강릉시", "심사임당로");
        Address schoolAddress_Jimmy = new Address("서울시", "노원구", " ");

        Student student1 = new Student("James", homeAddress_James, schoolAddress_James);
        Student student2 = new Student("Jimmy", homeAddress_Jimmy, schoolAddress_Jimmy);

        System.out.println(student1.getInfo());
        System.out.println();
        System.out.println(student2.getInfo());
    }
}

