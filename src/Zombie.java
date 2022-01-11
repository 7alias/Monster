public class Zombie extends Monster {
    public String scream = "Raaaauuughhhh";

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }
    // Overload this method to make SCREAMS
    @Override
    public void growl(){
        System.out.print(scream);

    }

    @Override
    public void attack(){
        super.attack();

    }
    public void growl(boolean caps){
        if (caps){
            System.out.print(scream.toUpperCase());

        } else {
            System.out.print(scream);

        }

    }

}