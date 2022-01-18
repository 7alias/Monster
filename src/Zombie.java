public class Zombie extends Monster {

    public static String scream = "Raaaauuughhhh";

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl() {
        System.out.print(scream);

    }

    public void growl(boolean loud) {
        if (!loud) {
            growl();
        } else {
            System.out.print(scream.toUpperCase());
            growl();
        }
    }

    @Override
    public void attack() {
        growl();
        super.attack();

    }

}