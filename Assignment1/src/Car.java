
public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String color;
    private final String engineType;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.engineType = builder.engineType;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d), Color: %s, Engine: %s",
                brand, model, year, color, engineType);
    }

    public static class Builder {
        private String brand;
        private String model;
        private int year;
        private String color;
        private String engineType;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Car build() {
            validate();
            return new Car(this);
        }


        private void validate() {
            if (brand == null || model == null) {
                throw new IllegalStateException("Brand and model must be provided.");
            }
            if (year <= 0) {
                throw new IllegalStateException("Year must be a positive number.");
            }
        }
    }
}
