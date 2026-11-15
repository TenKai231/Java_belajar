package Kelas_terbuka.Latihan_2;



class Player{
    private String name;
    private int baseHealth;
    private Weapon weapon;
    private Armor armor;
    private int level;
    private int inceremntHealth;
    private int inceremntAttack;
    private int baseAttack;
    private int totalDamag;
    private boolean iSAlive;


    public Player(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.inceremntHealth = 20;
        this.inceremntAttack = 30;
        this.iSAlive = true;
        
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDamag;
    }

    public void display(){
        System.out.println("Player \t\t: " + this.name );
        System.out.println("Level \t\t: " + this.level);
        System.out.println("MaxHealth \t: " + this.maxHealth());

        System.out.println("Attack \t\t: " + this.getAttackPowor());
        System.out.println("Alive \t\t: " + this.iSAlive + "\n");
    }

    public void defance(int damag){
        int defancePower = this.armor.getDefancePower();
        int deltaDemeg;

        System.out.println(this.name + " defance power = " + defancePower);
        if (damag > defancePower){
            deltaDemeg = damag - defancePower;
        }else {
            deltaDemeg = 0;
        }
        System.out.println("demeg earned = " + deltaDemeg + "\n");

        this.totalDamag += deltaDemeg;

        if (this.getHealth() <= 0){
            this.iSAlive = false;
            this.totalDamag = this.maxHealth();
        }

        this.display();
    }
    
    public void attack(Player opponent){
        int damag = this.getAttackPowor();
        System.out.println(this.name + " is attacking " + opponent.getName() + " with " + damag);
        opponent.defance(damag);
        this.lavelUp();
    }


    public void lavelUp(){
        this.level++;
    }

    public void setArmor(Armor armor){
        this.armor = armor; 
    }

    public  int maxHealth(){
        return this.baseHealth + this.level *this.inceremntHealth + this.armor.getAddString();
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    public  int getAttackPowor(){
        return this.baseAttack + this.level *this.inceremntAttack + this.weapon.getAttack();
    }

}

class Weapon{
    private String name;
    private int attack;

    public Weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public int getAttack(){
        return this.attack;
    }
}

class Armor {
    private String name;
    private int Strength;
    private int health;
    
    public  Armor(String name, int Strength, int health){
        this.name = name;
        this.Strength = Strength;
        this.health = health;
    }

    public  int getAddString(){
        return this.Strength*10 + this.health;
    }

    public int getDefancePower(){
        return this.Strength*2;
    }
}

public class Latihan_1 {
    public static void main(String[] args) {
        System.out.println("hello");
        Player player1 = new Player("Marni");
        Armor Armor1 = new Armor("Blesizbus",60,1000);
        Weapon Weapon1 = new Weapon("Bloodfang",30);
        player1.setArmor(Armor1);
        player1.setWeapon(Weapon1);
        player1.display();
        
        Player player2 = new Player("Rizki");
        Armor Armor2 = new Armor("Baju pisang",2,10);
        Weapon Weapon2 = new Weapon("buah pisang",3);
        player2.setArmor(Armor2);
        player2.setWeapon(Weapon2);
        player2.display();

        player1.attack(player2);
        player2.attack(player1);
        player2.attack(player1);
    }
}
