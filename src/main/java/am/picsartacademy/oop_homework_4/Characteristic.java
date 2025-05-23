package am.picsartacademy.oop_homework_4;

public class Characteristic implements ICharacteristic {
    protected String characteristicType;
    protected String characteristicName;
    protected CharacteristicValue characteristicValue;

    public Characteristic(String characteristicType, String characteristicName, CharacteristicValue characteristicValueName) {
        this.characteristicType = characteristicType;
        this.characteristicName = characteristicName;
        this.characteristicValue = characteristicValueName;
    }

    public void setCharacteristicName(String characteristicName) {
        this.characteristicName = characteristicName;
    }


    public void setCharacteristicType(String characteristicType) {
        this.characteristicType = characteristicType;
    }

    public void setCharacteristicValue(CharacteristicValue characteristicValueName) {
        this.characteristicValue = characteristicValueName;
    }

    public String getCharacteristicName() {
        return characteristicName;
    }

    public String getCharacteristicType() {
        return characteristicType;
    }

    public CharacteristicValue getCharacteristicValue() {
        return characteristicValue;
    }
}
