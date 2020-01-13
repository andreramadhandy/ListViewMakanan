package id.ac.poliban.mi.andre.makanannusantara;

public class Food {
    private String picf;
    private String foodName;
    private String foodDetail;



    public Food(String picf, String foodName, String foodDetail) {
        this.picf = picf;
        this.foodName = foodName;
        this.foodDetail = foodDetail;
    }

    public String getPicf() {
        return picf;
    }

    public void setPicf(String picf) {
        this.picf = picf;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDetail() {
        return foodDetail;
    }

    public void setFoodDetail(String foodDetail) {
        this.foodDetail = foodDetail;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getFoodName(), getFoodDetail());
    }
}
