import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Тестирование класса Person
        Person person = new Person.Builder()
                .setFullName("Иванов Иван Иванович")
                .setDateOfBirth("01.01.1990")
                .setContactPhone("+380 23 654 1212")
                .setCity("Курск")
                .setCountry("Украина")
                .setHomeAddress("ул. Пушкина, д. 1")
                .build();
        person.printData();
        System.out.println();

        // Тестирование класса City
        City city = new City.Builder()
                .setCityName("Одесса")
                .setRegionName("Одесская область")
                .setCountryName("Украина")
                .setPopulation(100000)
                .setPostalCode("4000")
                .setPhoneCode("+380")
                .build();
        city.printData();
        System.out.println();

        // Тестирование класса Country
        Country country = new Country.Builder()
                .setCountryName("Украина")
                .setContinentName("Евразия")
                .setPopulation(47123441)
                .setPhoneCode("+380")
                .setCapitalName("Киев")
                .setCityNames(Arrays.asList("Одесса", "Хесрон", "Харьков"))
                .build();
        country.printData();
        System.out.println();

        // Тестирование класса Fraction
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(2, 5);
        Fraction sum = fraction1.add(fraction2);
        Fraction difference = fraction1.subtract(fraction2);
        Fraction product = fraction1.multiply(fraction2);
        Fraction quotient = fraction1.divide(fraction2);

        System.out.println("Дробь 1: " + fraction1);
        System.out.println("Дробь 2: " + fraction2);
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
        System.out.println();

        // Тестирование класса Book
        Book book = new Book("Мастер и Маргарита", "Булгаков Михаил Афанасьевич", 1966, "Издательство", "Роман", 480);
        book.printData();
        System.out.println();

        // Тестирование класса Car
        Car car = new Car("Model S", "Tesla", 2020, 100.0);
        car.printData();
    }
}
