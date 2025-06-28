package am.picsartacademy.oop_homework_4;

public class Brand {
//    protected String brandName;
//    protected String brandLogo;
    public static String brandName;
    public static String brandLogo;
    static{
        brandName = "Apple";
    }
    static{
        brandLogo = "https://drive.google.com/file/d/12t7hU-Zs7mpkO2nE3Ztx5X_I0GkODpK6/view?usp=sharing";
    }



//    public Brand(String brandLogo) {
////        this.brandName = brandName;
//        this.brandLogo = brandLogo;
//    }

//    public void setBrandName(String brandName) {
//        this.brandName = brandName;
//    }
//
//    public void setBrandLogo(String brandLogo) {
//        this.brandLogo = brandLogo;
//    }

    public String getBrandName() {
        return brandName;
    }

    public String getBrandLogo() {
        return brandLogo;
    }
}
