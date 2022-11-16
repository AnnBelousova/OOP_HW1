public class Main {
    public static void main(String[] args) {
        Person maksim = new Person("Maksim", "Minsk", 1988, "brand-manager");
        Person anna = new Person("Anna", "Moscow", 1993, "methodologist of educational ");
        Person kate = new Person("Kate", "Kaliningrad", 1192, "product-manager");
        Person artem = new Person("Artem", "Moscow", 1995, "director of business developing");
        Person personWithoutInfo = new Person(null, "", -1555, "");

        System.out.println(maksim + "\n");
        System.out.println(anna + "\n");
        System.out.println(kate + "\n");
        System.out.println(artem + "\n");
        System.out.println(personWithoutInfo + "\n");

        Car lada = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
        Car audi= new Car("Audi", "A8 50 l TDl quattro", 3.0, "black", 2020, "Germany");
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        Car kia = new Car("Kia", "Sportage 4", 2.4, "red", 2018, "South Korea");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");
        Car carWithoutInfo = new Car("", null, 0, "", 0, "");


        System.out.println(lada + "\n" + audi + "\n" + bmw + "\n" + kia + "\n" + hyundai + "\n" + carWithoutInfo);
    }
}