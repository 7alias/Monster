abstract class Monster {

    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;



    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    public void attack(Monster monster) {
        this.hp = this.hp - getForce();
    }

    protected int getForce() {
        return force;
    }

    public boolean isDestroyed() {
        return this.destroyed;


    }

    protected boolean damage(int dhp) {
        this.hp -= dhp;
        if (this.hp <= 0) {
            this.destroyed = true;
        } else {
        }
        return this.destroyed;
    }


    public void attack() {
        System.out.println(" Monster " + name + " attacked with damage " + force);
    }

    public void growl() {
        System.out.print("Raaaauuughhhh");
    }
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



