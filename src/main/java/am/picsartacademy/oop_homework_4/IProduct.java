package am.picsartacademy.oop_homework_4;

public interface IProduct {
    public void setProductCategory(Category categoryName);

    public void setProductCharacteristic(Characteristic characteristicName);

    public void setProductCharacteristicValue(CharacteristicValue characteristicValue);

    public void setProductBrand(Brand brandName);

    public void setProductName(String productName);

    public void setProductPrice(double productPrice);

    public void setProductImage(String productImage);
}
