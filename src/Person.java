public class Person {
    private String fullName;
    private String dateOfBirth;
    private String contactPhone;
    private String city;
    private String country;
    private String homeAddress;

    // Конструкторы
    public Person(String fullName, String dateOfBirth, String contactPhone, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.contactPhone = contactPhone;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    // Перегруженный конструктор
    public Person(String fullName, String contactPhone) {
        this(fullName, null, contactPhone, null, null, null);
    }

    // Геттеры и сеттеры
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getContactPhone() { return contactPhone; }
    public void setContactPhone(String contactPhone) { this.contactPhone = contactPhone; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getHomeAddress() { return homeAddress; }
    public void setHomeAddress(String homeAddress) { this.homeAddress = homeAddress; }

    // Метод для ввода данных
    public void inputData(String fullName, String dateOfBirth, String contactPhone, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.contactPhone = contactPhone;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    // Метод для вывода данных
    public void printData() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Дата рождения: " + dateOfBirth);
        System.out.println("Телефон: " + contactPhone);
        System.out.println("Город: " + city);
        System.out.println("Страна: " + country);
        System.out.println("Адрес: " + homeAddress);
    }

    // Перегруженный метод для вывода данных в кратком формате
    public void printData(String format) {
        if ("short".equals(format)) {
            System.out.println(fullName + ", " + contactPhone);
        } else {
            printData();
        }
    }

    // Паттерн Builder для создания объектов Person
    public static class Builder {
        private String fullName;
        private String dateOfBirth;
        private String contactPhone;
        private String city;
        private String country;
        private String homeAddress;

        public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setHomeAddress(String homeAddress) {
            this.homeAddress = homeAddress;
            return this;
        }

        public Person build() {
            return new Person(fullName, dateOfBirth, contactPhone, city, country, homeAddress);
        }
    }
}
