package am.picsartacademy.oop_homework_2;

import am.picsartacademy.oop_homework_2.BuildingTypes.House;
import am.picsartacademy.oop_homework_2.BuildingTypes.Office;

public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        building.location = "Yerevan, Komitas street";
        building.buildingNumber = "32A";
        building.typeOfBuilding = "Household";
        building.floor = 5;
        building.entrance = 2;

        House house = new House();
        house.setIntercomNumber("1122C");
        house.setResidents("Mr. and Mrs. Karapetyans");
        house.setKeyLocation("The key is under Welcome in front of the door.");

        Office office = new Office();
        office.setWifiPassword("f786J8$79Y99");
        office.setRentalContract("https://drive.google.com/file/d/1288HAAlYXzJPz6gO0GXfxJ3wjOXLGQIH/view?usp=sharing");

        System.out.println("Building information:");
        System.out.println(building.location + " " + building.buildingNumber + ", Building type: " + building.typeOfBuilding);
        System.out.println("number of floors: " + building.floor + " Entrances: " + building.entrance);

        System.out.println("\nBuildings intercom number: " + house.getIntercomeNumber());
        System.out.println("House residents are " + house.getResidents());
        System.out.println(house.getKeyLocation());

        System.out.println("\nOffice wifi pass is " + office.getWifiPassword());
        System.out.println("You can find office rental contract here: \n" + office.getRentalContract());


    }
}
