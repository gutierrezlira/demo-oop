package by.itacademy.alinadarenskikh.javabasics.oop;
import com.github.javafaker.Faker;

public class DemoOOP {
    public static void main(String[] args) {

        Faker fake = new Faker();
        Customer customer1 = new Customer();

        customer1.setId(fake.idNumber().hashCode());
        customer1.setName(fake.name().firstName());
        customer1.setLastName(fake.name().lastName());
        customer1.setFathersName("Mamontovich");

        String add = new String();
        add = fake.address().fullAddress();
        customer1.setAddress(add);

        customer1.setCardNumber(fake.business().creditCardNumber());
        customer1.setBankAccount(fake.finance().iban());

        System.out.println(customer1.toString());

        Customer customer2 = new Customer(fake.idNumber().hashCode(), fake.name().firstName() ,
                fake.name().lastName(), fake.name().lastName(), add, fake.business().creditCardNumber(),
                fake.finance().iban());

        System.out.println(customer2.toString());

        System.out.println(customer1.getName());
        System.out.println(customer1.getLastName());
        System.out.println(customer1.getFathersName());
        System.out.println(customer1.getId());
        System.out.println(customer1.getAddress());
        System.out.println(customer1.getCardNumber());
        System.out.println(customer1.getBankAccount());


        Book book1 = new Book();
        book1.setName("Изучаем Java");
        book1.setAuthor("Берт Бейтс, Кэти Сьерра");
        book1.setPublicationYear(2015);
        book1.setPublisher("Alina");
        book1.setPages(720);
        book1.setPrice(54.45);
        book1.setId(978-5-699-54574-2);

        Book book2 = new Book(22222, "JAVA", "Ihar Blinov", "EPAM",
                2021, 560, 60.0);

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        System.out.println("Название: " + book1.getName());
        System.out.println("Автор: " + book1.getAuthor());
        System.out.println("Год издания: " + book1.getPublicationYear());
        System.out.println("Количество страниц: " + book1.getPages());
        System.out.println("Цена: " + book1.getPrice());
        System.out.println("ID " + book1.getId());


        Car car1 = new Car();
        car1.setBrand("Dodge");
        car1.setModel("Challenger III");
        car1.setColor("black");
        car1.setYearOfProduction(2018);
        car1.setPrice(110_190.0);
        car1.setLicensePlate("AAA555");
        car1.setId(651465);

        Car car2 = new Car(5555, "BMV", "X6", 2020,
                "gold", 50_000, "AAA555");

        System.out.println(car1.toString());
        System.out.println(car2.toString());

    }
}
