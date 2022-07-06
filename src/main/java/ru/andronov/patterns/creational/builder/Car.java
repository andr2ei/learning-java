package ru.andronov.patterns.creational.builder;

public class Car {
    private int age;
    private String power;
    private String color;

    public void setAge(int age) {
        this.age = age;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static CarBuilder builder() {
        return new CarBuilder(new Car());
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", power='" + power + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    static class CarBuilder {
        private final Car car;

        public CarBuilder(Car car) {
            this.car = car;
        }

        public CarBuilder setAge(int age) {
            car.setAge(age);
            return this;
        }

        public CarBuilder setPower(String power) {
            car.setPower(power);
            return this;
        }

        public CarBuilder setColor(String color) {
            car.setColor(color);
            return this;
        }

        public Car build() {
            return this.car;
        }
    }
}
