package backend.desafio.loans.domain;

public class Customer {

    private final Integer age;
    private String name;
    private final Double income;
    private String location;

    public Customer(Integer age, String cpf, String name, Double income, String location) {
        this.age = age;
        this.name = name;
        this.income = income;
        this.location = location;
    }

    public boolean isIncomeEqualOrLowerThan(double value) {
        return income <= value;
    }

    public boolean isIncomeEqualOrGreaterThan(double value) {
        return income >= value;
    }

    public boolean isIncomeBetween(double minValue, double maxValue) {
        return income >= minValue && income <= maxValue;
    }

    public boolean isAgeLowerThan(int value) {
        return age < value;
    }

    public boolean isFromLocation(String location) {
        return this.location.equalsIgnoreCase(location);
    }
}
