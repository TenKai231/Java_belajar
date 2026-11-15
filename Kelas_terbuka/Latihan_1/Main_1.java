// package Latihan_1;

class Player  {
    String name;
    double health;
    int lavel;
    Weapon weapon;
    Armor armor;

    Player (String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " Hp");
        this.weapon.display();
        this.armor.display();
    }

    void atatck(Player opponent){
        double AttackPower = this.weapon.AttackPower;
        System.out.println(this.name + "attacking" + opponent.name);
        opponent.defense(AttackPower);
        
    }

    void defense(double AttackPower){
        
        double demage;
        if (this.armor.DiffensePower < AttackPower){
            demage = AttackPower - this.armor.DiffensePower;
        }else{
            demage = 0;
        }
        

        this.health -= demage;
        System.out.println(this.name +" gets demage " + AttackPower);

    }
}


class Weapon {
    double AttackPower;
    String name;

    Weapon (String name,double AttackPower) {
        this.name = name;
        this.AttackPower = AttackPower;
    }

    void display(){
        System.out.println("Weapon :" + this.name + ", Power : " + AttackPower);
    }
}

class Armor {
    double DiffensePower;
    String name;
    Armor (String name, double DiffensePower) {
        this.name = name;
        this.DiffensePower = DiffensePower;
    }

        void display(){
        System.out.println("Armor :" + this.name + ", Diffens : " + DiffensePower);
    }
}

public class Main_1 {

    public static void main(String[] args) {
        Player player1 = new Player("Rizky", 100);
        Weapon weapon1 = new Weapon("Gold_Sword", 200);
        Armor armor1 = new Armor("Gold_Armor",10);

        Player player2 = new Player("Wahyu", 300);
        Weapon weapon2  = new Weapon("Diamond_Sword", 400);
        Armor  armor2 = new Armor("Diamond_Armor", 500);
        player1.equipWeapon(weapon1);
        player1.equipArmor(armor1);
        player1.display();

        player2.equipWeapon(weapon2);
        player2.equipArmor(armor2);
        player2.display();

        System.out.println("\nPERTEMPURAN");
        System.out.println("\nEpisode 1\n");
        player1.atatck(player2);
        player1.display();
        player2.display();
        System.out.println("\nEpisode 2\n");
        player2.atatck(player1);
        player1.display();
        player2.display();
    }
}