import java.util.List;

public class Country {
    private String countryName;
    private String continentName;
    private int population;
    private String phoneCode;
    private String capitalName;
    private List<String> cityNames;

    // Конструкторы
    public Country(String countryName, String continentName, int population, String phoneCode, String capitalName, List<String> cityNames) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capitalName = capitalName;
        this.cityNames = cityNames;
    }

    // Перегруженный конструктор
    public Country(String countryName, String capitalName) {
        this(countryName, null, 0, null, capitalName, null);
    }

    // Геттеры и сеттеры
    public String getCountryName() { return countryName; }
    public void setCountryName(String countryName) { this.countryName = countryName; }

    public String getContinentName() { return continentName; }
    public void setContinentName(String continentName) { this.continentName = continentName; }

    public int getPopulation() { return population; }
    public void setPopulation(int population) { this.population = population; }

    public String getPhoneCode() { return phoneCode; }
    public void setPhoneCode(String phoneCode) { this.phoneCode = phoneCode; }

    public String getCapitalName() { return capitalName; }
    public void setCapitalName(String capitalName) { this.capitalName = capitalName; }

    public List<String> getCityNames() { return cityNames; }
    public void setCityNames(List<String> cityNames) { this.cityNames = cityNames; }

    // Метод для ввода данных
    public void inputData(String countryName, String continentName, int population, String phoneCode, String capitalName, List<String> cityNames) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capitalName = capitalName;
        this.cityNames = cityNames;
    }

    // Метод для вывода данных
    public void printData() {
        System.out.println("Название страны: " + countryName);
        System.out.println("Континент: " + continentName);
        System.out.println("Население: " + population);
        System.out.println("Телефонный код: " + phoneCode);
        System.out.println("Столица: " + capitalName);
        System.out.println("Города: " + cityNames);
    }

    // Перегруженный метод для краткого вывода
    public void printData(boolean brief) {
        if (brief) {
            System.out.println(countryName + ", Столица: " + capitalName);
        } else {
            printData();
        }
    }

    // Паттерн Builder
    public static class Builder {
        private String countryName;
        private String continentName;
        private int population;
        private String phoneCode;
        private String capitalName;
        private List<String> cityNames;

        public Builder setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }

        public Builder setContinentName(String continentName) {
            this.continentName = continentName;
            return this;
        }

        public Builder setPopulation(int population) {
            this.population = population;
            return this;
        }

        public Builder setPhoneCode(String phoneCode) {
            this.phoneCode = phoneCode;
            return this;
        }

        public Builder setCapitalName(String capitalName) {
            this.capitalName = capitalName;
            return this;
        }

        public Builder setCityNames(List<String> cityNames) {
            this.cityNames = cityNames;
            return this;
        }

        public Country build() {
            return new Country(countryName, continentName, population, phoneCode, capitalName, cityNames);
        }
    }
}
