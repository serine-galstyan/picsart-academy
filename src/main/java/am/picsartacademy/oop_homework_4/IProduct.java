package am.picsartacademy.oop_homework_4;

public interface IProduct {
     void setProductCategory(Category categoryName);

     void setProductCharacteristic(Characteristic characteristicName);

     void setProductCharacteristicValue(CharacteristicValue characteristicValue);

     void setProductBrand(Brand brandName);

     void setProductName(String productName);

     void setProductPrice(double productPrice);

     void setProductImage(String productImage);
}
