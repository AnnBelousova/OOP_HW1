import transport.Car;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person maksim = new Person("Maksim", "Minsk", 34, "brand-manager");
        Person anna = new Person("Anna", "Moscow", 29, "methodologist of educational ");
        Person kate = new Person("Kate", "Kaliningrad", 30, "product-manager");
        Person artem = new Person("Artem", "Moscow", 27, "director of business developing");
        Person personWithoutInfo = new Person(null, "", -21, "");
        Person vladimir = new Person("Vladimir", "Kazan", 21,"");

        System.out.println(maksim + "\n");
        System.out.println(anna + "\n");
        System.out.println(kate + "\n");
        System.out.println(artem + "\n");
        System.out.println(personWithoutInfo + "\n");
        System.out.println(vladimir + "\n");

        Car.Key remoteWithoutKey = new Car.Key(true, false);
        Car.Key remoteWithKey = new Car.Key(true, true);

        Car lada = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia",5,null, "x456sa777", "automate", "sedan", new Car.Key());
        Car audi= new Car("Audi", "A8 50 l TDl quattro", 3.0, "black", 2020, "Germany",5, true, null, null, "hatchback", remoteWithoutKey);
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany",5, false, "456sa777", null, null, remoteWithKey);
        Car kia = new Car("Kia", "Sportage 4", 2.4, "red", 2018, "South Korea",6, null, "d456sa777", "mechanical", "suv", remoteWithKey);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea",6, true, "r456sa", null, null, remoteWithKey);
        Car carWithoutInfo = new Car("", null, 0, "", 0, "",0, null, null, "automate", "sedan", remoteWithKey);

        lada.changeTires();
        System.out.println(lada);
        //lada.changeTires(lada.isSummerTires());
        Car.Insurance insuranceLada = lada.new Insurance(LocalDate.of(2023, 12,01), 0,"5d555s5");
        System.out.println(insuranceLada);

        System.out.println(audi);
        //audi.changeTires(audi.isSummerTires());
        Car.Insurance insuranceAudi = audi.new Insurance(LocalDate.of(2020, 10,05), 2000,"55ask5s5");
        System.out.println(insuranceAudi);

        System.out.println(bmw);
        //bmw.changeTires(bmw.isSummerTires());
        bmw.isSummerTires();

        System.out.println(kia);
        //kia.changeTires(kia.isSummerTires());

        System.out.println(hyundai);
        //hyundai.changeTires(hyundai.isSummerTires());

        System.out.println(carWithoutInfo);
        //carWithoutInfo.changeTires(carWithoutInfo.isSummerTires());
        System.out.println();

        Flower rose = new Flower("Rose", "Holland", 35.59,0);
        Flower hrizantema = new Flower("Hrizantema", null, 15,5);
        Flower pion = new Flower("Pion", "England",69.9,1);
        Flower gipsofila = new Flower("Gipsofila", "Turkish",19.5,10);

        System.out.println(rose + "\n" + hrizantema + "\n" + pion + "\n" + gipsofila);

        /*Flower[] flowers = new Flower[0];*/
        Flower flowers;
        Bouquet bouquets = new Bouquet();

       /* flowers = bouquets.addFlowerToBouquet(rose, flowers, 1);
        flowers = bouquets.addFlowerToBouquet(hrizantema, flowers, 1);
        flowers = bouquets.addFlowerToBouquet(pion, flowers, 3);*/
        bouquets.addFlowerToBouquet(rose,  1);
        bouquets.addFlowerToBouquet(hrizantema,2);

        System.out.println("\nThe bouquet consists :");

        bouquets.printBouquet();
    }
}