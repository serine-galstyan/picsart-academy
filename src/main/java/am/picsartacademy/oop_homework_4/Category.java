package am.picsartacademy.oop_homework_4;

public class Category implements ICategory {
    protected String categoryName;
    protected String categoryImage;
    protected double categoryCommission;

    public Category(String categoryName, String categoryImage, double categoryCommission) {
        this.categoryName = categoryName;
        this.categoryCommission = categoryCommission;
        this.categoryImage = categoryImage;
    }

    @Override
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

    @Override
    public void setCategoryCommission(double categoryCommission) {
        this.categoryCommission = categoryCommission;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public double getCategoryCommission() {
        return categoryCommission;
    }
}
