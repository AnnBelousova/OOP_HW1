public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;


    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (!flowerColor.isBlank() || !flowerColor.isEmpty() || flowerColor != null) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "white";
        }
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (!country.isBlank() || !country.isEmpty() || country != null) {
            this.country = country;
        } else {
            this.country = "Russia";
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost != 0 || cost > 0){
            this.cost = (double) Math.round(cost * 100)/100;
        }else {
            this.cost = 1;
        }
    }

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerName != null || !flowerName.isEmpty() || !flowerName.isBlank()){
            this.flowerName = flowerName;
        }else {
            this.flowerName = "Information was not provided";
        }
        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank()){
            this.flowerColor = flowerColor;
        }else {
            this.flowerColor = "white";
        }
        if (country != null || !country.isEmpty() || !country.isBlank()){
            this.country = country;
        }else {
            this.country = "Russia";
        }
        if (cost != 0 || cost > 0){
            this.cost = cost;
        }else {
            this.cost = 1;
        }
        if (lifeSpan != 0 || lifeSpan > 0){
            this.lifeSpan = lifeSpan;
        }else {
            this.lifeSpan = 3;
        }
    }

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName != null || !flowerName.isEmpty() || !flowerName.isBlank()){
            this.flowerName = flowerName;
        }else {
            this.flowerName = "Information was not provided";
        }
        if (cost != 0 || cost > 0){
            this.cost = cost;
        }else {
            this.cost = 1;
        }
        if (lifeSpan > 0){
            this.lifeSpan = lifeSpan;
        }else {
            this.lifeSpan = 3;
        }
        if (country == null || country.isEmpty() || country.isBlank()){
            this.country = "Russia";
        }else {
            this.country = country;
        }
    }


    @Override
    public String toString() {
        return flowerName +
                " from " + country + ", the cost per one peace is " + cost + ", life span is " + lifeSpan + " days";
    }
}
