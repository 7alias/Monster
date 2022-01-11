public class Monster {
    String name;
    int damage = 5;



    public Monster(String name, int i) {
        this.name = name;
        System.out.println("Monster " + name + " was created");
    }

    public void attack() {
        System.out.println(" Monster " + name  + " attacked with damage " + damage);
    }
    public void growl() {
        System.out.print("Raaaauuughhhh");
    }


/*
This fragment of code has to output

Monster Alice the Zombie was created
Monster Alice the Zombie attacked with damage 5
Raaaauuughhhh Alice the Zombie growled
Monster Bob the Zombie was created
Monster Bob the Zombie attacked with damage 5
Raaaauuughhhh Bob the Zombie growled

NOTE: The code of Zombie class has to output
      SMALL part of this.

The most output class Monster makes.
You cannot see Monster class source,
but can instance objects of it and play with them.


*/
}


