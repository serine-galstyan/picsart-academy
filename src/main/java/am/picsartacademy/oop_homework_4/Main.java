package am.picsartacademy.oop_homework_4;

public class Main {
    public static void main(String[] args) {
        Category smartphone = new Category("Smartphone", "smartphoneLogo.png", 22.5);
        CharacteristicValue memoryValue1 = new CharacteristicValue("256GB");
        Characteristic memory = new Characteristic("text", "Memory", memoryValue1);
        Brand apple = new Brand();

        Product productID1 = new Product(smartphone, memory, memoryValue1, apple, "iPhone 16 Pro", "https://drive.google.com/file/d/13mc1puvQQXEtLCF_0scLopIvcah_vvpj/view?usp=sharing", 532000);
        Product productID2 = new Product(smartphone, memory, memoryValue1, apple, "iPhone 16", "https://drive.google.com/file/d/1-_Ys-mPHZ4apRR3cQMuFKi4DTs_ZU2JN/view?usp=sharing", 421000);

        System.out.println();
        System.out.println(productID1.getProductName());
        System.out.println("\uD83D\uDCF1\uD83D\uDC49" + productID1.getProductImage());

        System.out.println();
        System.out.println("Product description: ");
        System.out.println();

        System.out.println("Category: " + productID1.getCategory().getCategoryName());

        //Print brand name
        System.out.println("Brand: " + productID1.getBrand().getBrandName() + " (" + productID1.getBrand().getBrandLogo() + ")");

        //Print characteristic name with characteristic value
        System.out.print(productID1.getCharacteristic().getCharacteristicName() + ": ");
        System.out.println(productID1.getCharacteristicValue().getCharacteristicValueName());


        //Print product price before discount
        System.out.println("OLD price: " + productID1.getProductPrice() + " " + productID1.currency);
        //Print product price after discount
        productID1.changeProductPrice(22);
        System.out.println("NEW price: " + productID1.getProductPrice() + " " + productID1.currency);

    }
}
