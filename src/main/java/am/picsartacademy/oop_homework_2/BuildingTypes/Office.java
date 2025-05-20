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
    }

    public String getRentalContract() {
        return rentalContract;
    }
}
