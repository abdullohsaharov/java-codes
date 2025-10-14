public class BaseConverter implements Converter {
    private double celsius;

    public BaseConverter(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double toKelvin() {
        return celsius + 273.15;
    }

    public void printAllConversions() {
        System.out.println("Celsius: " + celsius + "°C");
        System.out.println("Fahrenheit: " + toFahrenheit() + "°F");
        System.out.println("Kelvin: " + toKelvin() + "K");
    }
}
