package transport;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private final int numberOfSeats;
    private final String typeOfBodyCar;
    private String registrationNumber;
    private Boolean isSummerTires;
    private final String transmission;
    private Key key;
    private Insurance insurance;

    public static class Key {
        private final Boolean remoteStartingEngine;
        private final Boolean accessWithoutKey;

        public Boolean getRemoteStartingEngine() {
            return remoteStartingEngine;
        }

        public Boolean getAccessWithoutKey() {
            return accessWithoutKey;
        }

        public Key(Boolean remoteStartingEngine, Boolean accessWithoutKey) {
            this.remoteStartingEngine = remoteStartingEngine == null ? false : remoteStartingEngine;
            this.accessWithoutKey = accessWithoutKey == null ? false : accessWithoutKey;
        }

        @Override
        public String toString() {
            return "Key" +
                    "remoteStartingEngine=" + remoteStartingEngine +
                    ", accessWithoutKey=" + accessWithoutKey;
        }
    }

    public class Insurance {
        private final LocalDate duration;
        private final double price;
        private final String number;

        public Insurance(LocalDate duration, double price, String number) {
            this.duration = checkDuration(duration);
            this.price = price <=0 ? 1500 : price;
            if(Pattern.matches("[a-zA-Z-zA-Z0-9]{9}",number)){
                this.number = number;
            }else {
                this.number = "this number is invalid";
            }
        }


        @Override
        public String toString() {
            return "Insurance: " +
                    "duration " + duration +
                    ", price " + price +
                    ", number: " + number ;
        }

        public LocalDate getDuration() {
            return duration;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        private LocalDate checkDuration(LocalDate duration) {
            if (LocalDate.now().isAfter(duration)) {
                System.out.println("You have to extend the insurance.");
                return duration;
            }else {
                return duration;
            }
        }
    }

        public Insurance getInsurance() {
            return insurance;
        }


        public void changeTires(Boolean summerTires) {
            if ((LocalDate.now().getMonthValue() < 5 || LocalDate.now().getMonthValue() > 10) && !summerTires) {
                System.out.println("Tires is Ok for current season!");
            } else if ((LocalDate.now().getMonthValue() < 5 || LocalDate.now().getMonthValue() > 10) && summerTires) {
                System.out.println("You have to change tires to winter tires!");
            } else if ((LocalDate.now().getMonthValue() >= 5 || LocalDate.now().getMonthValue() <= 10) && summerTires) {
                System.out.println("Tires is Ok for current season!");
            } else if ((LocalDate.now().getMonthValue() >= 5 || LocalDate.now().getMonthValue() <= 10) && !summerTires) {
                System.out.println("You have to change tires to winter tires!");
            }
        }


        public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, int numberOfSeats, Boolean summerTires, String registrationNumber, String transmission, String typeOfBodyCar) {
            this.typeOfBodyCar = typeOfBodyCar == null || typeOfBodyCar.isEmpty() || typeOfBodyCar.isBlank() ? "sedan" : typeOfBodyCar;

            this.isSummerTires = summerTires == null ? true : false;

            this.transmission = transmission == null || transmission.isEmpty() || transmission.isBlank() ? "mechanical" : transmission;

            this.numberOfSeats = numberOfSeats == 0 ? 4 : numberOfSeats;
            if (brand == null || brand.isEmpty() || brand.isBlank()) {
                this.brand = "BMW";
            } else {
                this.brand = brand + " ";
            }
            if (model == null || model.isEmpty() || model.isBlank()) {
                this.model = "X6";

            } else {
                this.model = model;
            }
            if (productionCountry == null || productionCountry.isBlank() || productionCountry.isEmpty()) {
                this.productionCountry = "Germany";
            } else {
                this.productionCountry = productionCountry;
            }
            if (Double.compare(engineVolume, 0) == 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
            if (color == null || color.isBlank() || color.isEmpty()) {
                this.color = "white";
            } else {
                this.color = color;
            }

            if (productionYear > 0) {
                this.productionYear = productionYear;
            } else {
                this.productionYear = 2000;
            }
            if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
                this.registrationNumber = "000000000";
            } else {
                Pattern pattern = Pattern.compile("([a-z][0-9]{3}[a-z]{2}[0-9]{3})");
                Matcher matcher = pattern.matcher(registrationNumber);
                if (matcher.matches()) {
                    this.registrationNumber = registrationNumber;
                } else {
                    this.registrationNumber = "000000000";
                }
            }
        }

        @Override
        public String toString() {
            return brand + " " + model + ", " +
                    "production year is " + productionYear +
                    ", was built in " + productionCountry +
                    ", color is " + color +
                    ", engine Volume is " + engineVolume +
                    ", number of seats is " + numberOfSeats +
                    ", tires is summer " + isSummerTires +
                    ", registration number " + registrationNumber +
                    ", transmission is " + transmission +
                    ", type of body car is " + typeOfBodyCar;
        }

        public Key getKey() {
            return key;
        }

        public void setKey(Key key) {
            this.key = key;
        }

        public Boolean getSummerTires() {
            return isSummerTires;
        }

        public String getTransmission() {
            return transmission;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public double getEngineVolume() {
            return engineVolume;
        }

        public String getColor() {
            return color;
        }

        public int getProductionYear() {
            return productionYear;
        }

        public String getProductionCountry() {
            return productionCountry;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public void setColor(String color) {
            this.color = (color == null || color.isBlank() || color.isEmpty()) ? "white" : color;
        }

        public String getTypeOfBodyCar() {
            return typeOfBodyCar;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public void setRegistrationNumber(String registrationNumber) {
            if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
                this.registrationNumber = "000000000";
            } else {
                Pattern pattern = Pattern.compile("([a-z][0-9]{3}[a-z]{2}[0-9]{3})");
                Matcher matcher = pattern.matcher(registrationNumber);
                if (matcher.matches()) {
                    this.registrationNumber = registrationNumber;
                } else {
                    this.registrationNumber = "000000000";
                }
            }
        }

        public boolean isSummerTires() {
            return isSummerTires;
        }

        public void setSummerTires(Boolean summerTires) {
            isSummerTires = summerTires == null ? isSummerTires : !isSummerTires;
        }
    }
