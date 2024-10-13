public class Fraction {
    private int numerator;
    private int denominator;

    // Конструкторы
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("Знаменатель не может быть нулем");
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Перегруженный конструктор
    public Fraction(int numerator) {
        this(numerator, 1);
    }

    // Геттеры и сеттеры
    public int getNumerator() { return numerator; }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() { return denominator; }
    public void setDenominator(int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("Знаменатель не может быть нулем");
        this.denominator = denominator;
        simplify();
    }

    // Метод для ввода данных
    public void inputData(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("Знаменатель не может быть нулем");
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Метод для вывода данных
    public void printData() {
        System.out.println(numerator + "/" + denominator);
    }

    // Сокращение дроби
    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
    }

    // Наибольший общий делитель
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Арифметические операции
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) throw new IllegalArgumentException("Деление на нулевую дробь");
        return new Fraction(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    // Перегруженные методы для операций с целыми числами
    public Fraction add(int number) {
        return this.add(new Fraction(number));
    }

    public Fraction subtract(int number) {
        return this.subtract(new Fraction(number));
    }

    public Fraction multiply(int number) {
        return this.multiply(new Fraction(number));
    }

    public Fraction divide(int number) {
        return this.divide(new Fraction(number));
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
