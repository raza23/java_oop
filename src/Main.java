public class Main {

    public static void main(String[] args) {
//        Obj p = new Obj();
//
//        System.out.println(p.color);

        Player player1 = new Player();
        player1.setName("Lebron");

        Player player2 = new Player("Dwayne","Heat",3);


        System.out.println(player1.name);
        System.out.println(player2.team);

    }
}
