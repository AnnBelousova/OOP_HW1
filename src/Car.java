public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand != null && brand != ""){
            this.brand= brand + " ";
        }else {
            this.brand = "default";
        }
        if (model != null && model != ""){
            this.model = model;
        }else {
            this.model = " default";
        }
        if (productionCountry != null && productionCountry != ""){
            this.productionCountry = productionCountry;
        }else {
            this.productionCountry = "default";
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        }else{
            this.engineVolume = engineVolume;
        }
        if (color != null && color != ""){
            this.color = color;
        }else {
            this.color = "white";
        }

        if (productionYear > 0) {
            this.productionYear = productionYear;
        }else{
            this.productionYear = 2000;
        }
    }

    @Override
    public String toString() {
        return    brand + " " + model + ", " +
                "production year is " + productionYear +
                ", was built in " + productionCountry +
                ", color is " + color +
                ", engine Volume is " + engineVolume;
    }
}
