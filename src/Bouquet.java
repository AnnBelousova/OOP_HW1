import java.util.Arrays;

public class Bouquet {
    double price = 0;
    public Flower[] addFlowerToBouquet(Flower flower, Flower[] flowers, int count){
        Flower[] bouquet;
        if (count == 1){
            bouquet = Arrays.copyOf(flowers,flowers.length+1);
            bouquet[flowers.length] = flower;
        }else{
            bouquet = Arrays.copyOf(flowers,flowers.length + count);
            bouquet[flowers.length] = flower;
            for (int i = 0; i < count-1; i++) {
                bouquet[flowers.length+ i + 1] = bouquet[flowers.length+i];
            }
        }
        return bouquet;
    }
    private double calculatePrice(Flower[] bouquet){
        for (int i = 0; i < bouquet.length; i++) {
            price += bouquet[i].getCost();
        }
        double totalPrice = price * 1.1;
        return totalPrice;
    }

    private int getMinLifeSpan(Flower[] bouquet){
        int minLifeSpan=0;
        for (int i = 0; i < bouquet.length-1; i++) {
            minLifeSpan= bouquet[0].getLifeSpan();
            if(bouquet[i+1].getLifeSpan() < minLifeSpan){
                minLifeSpan = bouquet[i+1].getLifeSpan();
            }
        }
        return minLifeSpan;
    }

    public void printBouquet(Flower[] flowers){
        int k=0;
        for (int i = 0; i < flowers.length; i++) {
            for (int j = i+1; j < flowers.length ; j++) {
                if(flowers[i].getFlowerName() == flowers[j].getFlowerName()){
                    k++;
                }
            }
            if(k == 0){
                System.out.println(1 + " " + flowers[i] );
            }else {
                flowers[flowers.length-1] = flowers[i];

            }
        }
        System.out.println(k + " " + flowers[flowers.length-1]);
        System.out.printf("The price is : %.2f, the life span of bouquet is: %d", calculatePrice(flowers), getMinLifeSpan(flowers));
    }
}
