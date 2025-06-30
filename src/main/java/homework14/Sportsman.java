package homework14;

public abstract class Sportsman {
    public enum SportCategory {
        SINGLE,
        TEAM;
    }

    public String sportName;
    SportCategory type;

    public Sportsman(String sportName, SportCategory type) {
        this.sportName = sportName;
        this.type = type;
    }


    abstract void play(String sportName, SportCategory type);

    public String getQuantity(SportCategory type) {
        if (type == SportCategory.SINGLE)
            return " alone";
        else if (type == SportCategory.TEAM) {
            return " with my team";
        }
        return "";
    }

    public static class Sportsman1 {
        public static void main(String[] args) {
            Sportsman sportsman1 = new Sportsman("football", SportCategory.TEAM) {
                @Override
                void play(String sportName, SportCategory type) {
                    System.out.println("I am playing " + sportName + getQuantity(type));
                }
            };
            sportsman1.play(sportsman1.sportName, sportsman1.type);
        }
    }

    public static class Sportsman2 {
        public static void main(String[] args) {
            Sportsman sportsman2 = new Sportsman("basketball", SportCategory.TEAM) {
                @Override
                void play(String sportName, SportCategory type) {
                    System.out.println("I am playing " + sportName + getQuantity(type));
                }
            };
            sportsman2.play(sportsman2.sportName, sportsman2.type);
        }
    }


    public static class Sportsman3 {
        public static void main(String[] args) {
            Sportsman sportsman3 = new Sportsman("swimming", SportCategory.SINGLE) {
                @Override
                void play(String sportName, SportCategory type) {
                    System.out.println("I am " + sportName + getQuantity(type));
                }
            };
            sportsman3.play(sportsman3.sportName, sportsman3.type);
        }
    }


}
