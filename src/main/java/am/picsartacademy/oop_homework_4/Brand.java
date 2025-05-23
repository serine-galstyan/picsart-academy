package am.picsartacademy.oop_homework_4;

public class Brand implements IBrand {
    protected String brandName;
    protected String brandLogo;


    public Brand(String brandName, String brandLogo) {
        this.brandName = brandName;
        this.brandLogo = brandLogo;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getBrandLogo() {
        return brandLogo;
    }
}
