package am.picsartacademy.oop_homework_4;

public class Product implements IProduct {
    protected Category categoryName;
    protected Characteristic characteristicName;
    protected CharacteristicValue characteristicValue;
    protected Brand brandName;
    protected String productName;
    protected String productImage;
    protected double productPrice;

    public Product(Category categoryName, Characteristic characteristicName, CharacteristicValue characteristicValue, Brand brandName, String productName, String productImage, double productPrice) {
        this.categoryName = categoryName;
        this.characteristicName = characteristicName;
        this.characteristicValue = characteristicValue;
        this.brandName = brandName;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
    }

    public void setProductCategory(Category categoryName) {
        this.categoryName = categoryName;
    }

    public void setProductCharacteristic(Characteristic characteristicName) {
        this.characteristicName = characteristicName;
    }

    public void setProductCharacteristicValue(CharacteristicValue characteristicValue) {
        this.characteristicValue = characteristicValue;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public void setProductBrand(Brand brandName) {
        this.brandName = brandName;
    }

    public Category getCategory() {
        return categoryName;
    }

    public Characteristic getCharacteristic() {
        return characteristicName;
    }

    public CharacteristicValue getCharacteristicValue() {
        return characteristicValue;
    }

    public Brand getBrand() {
        return brandName;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void changeProductPrice(double productPrice) {
        setProductPrice(productPrice);
    }

    public void changeProductPrice(int discountAmount) {
        double newProductPrice;
        newProductPrice = getProductPrice() - (getProductPrice() * discountAmount / 100);
        setProductPrice(newProductPrice);
    }


}