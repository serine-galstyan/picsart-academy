package am.picsartacademy.oop_homework_2.BuildingTypes;

import am.picsartacademy.oop_homework_2.Building;

public class Office extends Building {
    private String wifiPassword;
    private String rentalContract;

    public void setWifiPassword(String password) {
        wifiPassword = password;
    }

    public String getWifiPassword() {
        return wifiPassword;
    }

    public void setRentalContract(String contractUrl) {
        rentalContract = contractUrl;
//                "https://drive.google.com/file/d/1288HAAlYXzJPz6gO0GXfxJ3wjOXLGQIH/view?usp=sharing";
    }

    public String getRentalContract() {
        return rentalContract;
    }
}
