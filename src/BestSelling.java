import java.util.Arrays;

public class BestSelling {
    public static void main(String[] args) {
        String[] products = {"Nike", "Adidas", "Vans", "Converse", "Puma", "NewBalance", "Asics", "Slazenger", "Columbia", "NorthFace"};
        String[] itemSold = {"Vans","Vans","Adidas","Asics","Asics","Asics","Puma","NorthFace","Vans","Vans","Adidas","Asics","Vans"};
        int[] priceSold = {300,400,350,450,250,250,350,475,325,225,600,700,150};

        int[] totalSold = new int[products.length];

        // Create total sold array
        for(int i = 0; i < products.length; i++) {
            for (int j = 0; j < itemSold.length; j++) {
                if(products[i].equals(itemSold[j])) {
                    totalSold[i] += priceSold[j];
                }
            }
        }

        // Find the biggest one
        int maxSold = Integer.MIN_VALUE;
        String bestSelling = "";
        for (int i = 0; i < totalSold.length; i++) {
            if(totalSold[i] > maxSold) {
                maxSold = totalSold[i];
                bestSelling = products[i];
            }
        }

        System.out.println(Arrays.toString(totalSold));
        System.out.println(bestSelling);





/*        for(int i = 0; i < products.length; i++) {
            String currentProduct = products[i];
            totalSold = new int[products.length];

            for(int j = 0; j < itemSold.length; i++) {
                //if(currentProduct.contentEquals(itemSold[j]))

            }

        }*/
    }
}
