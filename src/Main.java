public class Main {


    public static void main(String[] args) {
/*

You have to overload class Zombie

*/

        Zombie zombie1 = new Zombie("Alice");
        zombie1.growl();
        zombie1.attack();
        zombie1.growl(true);
        zombie1.attack();
        zombie1.growl(false);
        zombie1.attack();


/*
This fragment of code has to output

Monster Alice the Zombie was created
Raaaauuughhhh Alice the Zombie growled
RAAAAUUUGHHHH Alice the Zombie growled
Raaaauuughhhh Alice the Zombie growled

*/
    }

}
