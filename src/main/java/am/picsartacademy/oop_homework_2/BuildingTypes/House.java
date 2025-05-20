package am.picsartacademy.oop_homework_2.BuildingTypes;

import am.picsartacademy.oop_homework_2.Building;

public class House extends Building {
    private String residents;
    private String keyLocation;

    public void setIntercomNumber(String num) {
        intercomNumber = num;
    }

    public String getIntercomeNumber() {
        return intercomNumber;
    }

    public void setResidents(String familyName) {
        residents = familyName;
    }

    public String getResidents() {
        return residents;
    }

    public void setKeyLocation(String safePlace) {
        keyLocation = safePlace;
    }

    public String getKeyLocation() {
        return keyLocation;
    }
}
