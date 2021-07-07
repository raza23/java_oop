public class Player {
    public static String name;


    public static String team;
    public static Integer jersey_number;

    Player(){}

    Player(String newName, String newTeam, Integer newNumber){
        name = newName;
        team = newTeam;
        jersey_number = newNumber;
    }

    public static void setName(String newName) {
        name = newName;
    }

    public static void setTeam(String newTeam) {
        team = newTeam;
    }

    public static void setNumber(Integer newNumber) {
        jersey_number = newNumber;
    }

}
