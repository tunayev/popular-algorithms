public class BestSelling {
    public static void main(String[] args) {
        String[] products = {"Nike", "Adidas", "Vans", "Converse", "Puma", "NewBalance", "Asics", "Slazenger", "Columbia", "NorthFace"};
        String[] itemSold = {"Vans","Vans","Adidas","Asics","Asics","Asics","Puma","NorthFace","Vans","Vans","Adidas","Asics","Vans"};
        int[] priceSold = {300,400,350,450,250,250,350,475,325,225,600,700,150};

        int[] totalSold = new int[products.length];

        for(int i = 0; i < products.length; i++) {
            String currentProduct = products[i];
            totalSold = new int[products.length];

            for(int j = 0; j < itemSold.length; i++) {
                //if(currentProduct.contentEquals(itemSold[j]))

            }

        }
    }
}
