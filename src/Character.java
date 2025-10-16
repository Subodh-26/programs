import java.util.Random;

class Warrior extends Character{
    int rage ;
    final int MAX_RAGE = 100;
    public Warrior(String name, int health, int attackPower, int defense, int speed) {
        super(name, health, attackPower, defense, speed);
        this.rage=0;
    }

    @Override
    public void attack(Character target) {
        int actualAttack = attackPower;

        if (health < 30) {
            actualAttack *= 2;
            System.out.println( name + " enters BERSERK MODE! Attack power doubled!");
        }
        if (rage == MAX_RAGE) {
            actualAttack += 10;
            rage = 0;
            System.out.println( name + " activated RAGE for extra damage");
        }
        System.out.println( name + " swings with power " + actualAttack);
        target.takeDamage(actualAttack);

    }
}

class Mage extends Character{
    int mana;

    public Mage(String name, int health, int attackPower, int defense, int speed, int mana) {
        super(name, health, attackPower, defense, speed);
        this.mana = mana;
    }

    @Override
    public void attack(Character target) {
       if(mana >= 20){
           System.out.println(name + " casts FIREBALL ");
           int damage = attackPower + 20; // big damage
           target.takeDamage(damage);
           mana -= 20;
           health -= 5;
           System.out.println( name + " loses 5 health due to fireball (Health: " + health + ")");
       } else {
           System.out.println( name + " is out of mana! Uses weak magic attack.");
           target.takeDamage(attackPower / 2);
       }
    }
}

class Archer extends Character{
    int criticalChance;
    Random rand = new Random();


    public Archer(String name, int health, int attackPower, int defense, int speed, int criticalChance) {
        super(name, health, attackPower, defense, speed);
        this.criticalChance = criticalChance;
    }

    @Override
    public void attack(Character target) {
        boolean isCritical = rand.nextInt(100) < criticalChance;
        int damage = attackPower;
        if (isCritical) {
            damage *= 2;
            System.out.println( name + " lands a CRITICAL HIT! Damage doubled!");
        } else {
            System.out.println( name + " shoots an arrow!");
        }
        target.takeDamage(damage);
    }
}

public class Character {
    String name;
    int health;
    int attackPower;
    int defense;
    int speed;

    public Character(String name, int health, int attackPower, int defense, int speed) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.speed = speed;
    }

    public void attack(Character target) {
        System.out.println(name +"attacks" + target.name);
        target.takeDamage(attackPower);
    }

    public void takeDamage(int amount){
        int damage = Math.max(1, amount - defense);
        health -= damage;
        System.out.println(name + " takes " + damage + " damage (Health:" + health + ")");
    }

    public boolean isAlive(){
        return health > 0;
    }
}

class BattleTest {
    public static void main(String[] args) {
        Warrior thor = new Warrior("Thor", 100, 20, 10, 5);
        Mage gandalf = new Mage("Gandalf", 80, 25, 5, 7, 60);
        Archer alex = new Archer("Alex", 85, 18, 6, 10, 30);

        System.out.println(" Battle Starts!\n");

        Character fighter1 = gandalf;
        Character fighter2 = thor;

        Character first, second;
        if (fighter1.speed >= fighter2.speed) {
            first = fighter1;
            second = fighter2;
        } else {
            first = fighter2;
            second = fighter1;
        }

        while (first.isAlive() && second.isAlive()) {
            first.attack(second);
            if (!second.isAlive()) break;

            second.attack(first);
            if (!first.isAlive()) break;
            System.out.println("-----------------------------");
        }

        if (first.isAlive()) {
            System.out.println("\n " + first.name + " wins the battle!");
        } else if (second.isAlive()) {
            System.out.println("\n " + second.name + " wins the battle!");
        } else {
            System.out.println("\n Both fighters have fallen! It's a draw!");
        }
    }
}