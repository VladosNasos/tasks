public class Car {
    private String carName;
    private String manufacturerName;
    private int productionYear;
    private double engineVolume;

    // Конструкторы
    public Car(String carName, String manufacturerName, int productionYear, double engineVolume) {
        this.carName = carName;
        this.manufacturerName = manufacturerName;
        this.productionYear = productionYear;
        this.engineVolume = engineVolume;
    }

    // Перегруженный конструктор
    public Car(String carName, String manufacturerName) {
        this(carName, manufacturerName, 0, 0.0);
    }

    // Геттеры и сеттеры
    public String getCarName() { return carName; }
    public void setCarName(String carName) { this.carName = carName; }

    public String getManufacturerName() { return manufacturerName; }
    public void setManufacturerName(String manufacturerName) { this.manufacturerName = manufacturerName; }

    public int getProductionYear() { return productionYear; }
    public void setProductionYear(int productionYear) { this.productionYear = productionYear; }

    public double getEngineVolume() { return engineVolume; }
    public void setEngineVolume(double engineVolume) { this.engineVolume = engineVolume; }

    // Метод для ввода данных
    public void inputData(String carName, String manufacturerName, int productionYear, double engineVolume) {
        this.carName = carName;
        this.manufacturerName = manufacturerName;
        this.productionYear = productionYear;
        this.engineVolume = engineVolume;
    }

    // Метод для вывода данных
    public void printData() {
        System.out.println("Модель автомобиля: " + carName);
        System.out.println("Производитель: " + manufacturerName);
        System.out.println("Год выпуска: " + productionYear);
        System.out.println("Объем двигателя: " + engineVolume + " л");
    }

    // Перегруженный метод для краткого вывода
    public void printData(boolean brief) {
        if (brief) {
            System.out.println(carName + " от " + manufacturerName);
        } else {
            printData();
        }
    }
}
