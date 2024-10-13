public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private int population;
    private String postalCode;
    private String phoneCode;

    // Конструкторы
    public City(String cityName, String regionName, String countryName, int population, String postalCode, String phoneCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    // Перегруженный конструктор
    public City(String cityName, String countryName) {
        this(cityName, null, countryName, 0, null, null);
    }

    // Геттеры и сеттеры
    public String getCityName() { return cityName; }
    public void setCityName(String cityName) { this.cityName = cityName; }

    public String getRegionName() { return regionName; }
    public void setRegionName(String regionName) { this.regionName = regionName; }

    public String getCountryName() { return countryName; }
    public void setCountryName(String countryName) { this.countryName = countryName; }

    public int getPopulation() { return population; }
    public void setPopulation(int population) { this.population = population; }

    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    public String getPhoneCode() { return phoneCode; }
    public void setPhoneCode(String phoneCode) { this.phoneCode = phoneCode; }

    // Метод для ввода данных
    public void inputData(String cityName, String regionName, String countryName, int population, String postalCode, String phoneCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    // Метод для вывода данных
    public void printData() {
        System.out.println("Название города: " + cityName);
        System.out.println("Регион: " + regionName);
        System.out.println("Страна: " + countryName);
        System.out.println("Население: " + population);
        System.out.println("Почтовый индекс: " + postalCode);
        System.out.println("Телефонный код: " + phoneCode);
    }

    // Перегруженный метод для краткого вывода
    public void printData(boolean brief) {
        if (brief) {
            System.out.println(cityName + ", " + countryName);
        } else {
            printData();
        }
    }

    // Паттерн Builder
    public static class Builder {
        private String cityName;
        private String regionName;
        private String countryName;
        private int population;
        private String postalCode;
        private String phoneCode;

        public Builder setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public Builder setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }

        public Builder setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }

        public Builder setPopulation(int population) {
            this.population = population;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setPhoneCode(String phoneCode) {
            this.phoneCode = phoneCode;
            return this;
        }

        public City build() {
            return new City(cityName, regionName, countryName, population, postalCode, phoneCode);
        }
    }
}
