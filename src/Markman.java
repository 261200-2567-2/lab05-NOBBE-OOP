public class Markman implements Character {
    private int level;
    private double Hp;
    private double maxHp;
    private double Mana;
    private double maxMana;
    private double Atk = 15;
    private double Def = 5;

    public Markman(int level) {
        this.level = level;
        maxHp =50 + 10 * level;
        maxMana = 50 + 5 * level;
        Hp = maxHp;
        Mana = maxMana;
    }

    public void heal() {
        if(Mana < 10) Hp += 10;
        if(Hp > maxHp) Hp = maxHp;
        Mana -=10;
    }

    public void getAttacked(double atk) {
        Hp -= atk-0.3* Def;
        if(Hp < 0) Hp = 0;
    }

    public void levelUp() {
        level++;
        maxHp =50 + 10 * level;
        maxMana = 50 + 5 * level;
        System.out.println("--------------------------------------");
        System.out.println("--------MARKMAN---LEVEL---UP----------");
        System.out.println("--------------------------------------");
    }

    public void attack(Character target) {
        target.getAttacked(Atk);
        System.out.println("--------------------------------------");
        System.out.println("--------MARKMAN---ATTACKS---TANK----------");
        System.out.println("--------------------------------------");
    }

    public void EquipAccessories(Accessory a) {
        if(a.typeCheck() == 2){
            System.out.println("--------------------------------------");
            System.out.println("----MARKMAN has a gun!! +10 Attack----");
            System.out.println("--------------------------------------");
        }else{
            System.out.println("MARKMAN can not equip accessories!");
        }
    }
    public void play(){
        System.out.println("-------------------------------------");
        System.out.println("Charactor Class : Markman");
        System.out.println("Level : " + level);
        System.out.println("Hp : " + Hp);
        System.out.println("MaxHp : " + maxHp);
        System.out.println("MaxMana : " + maxMana);
        System.out.println("Mana : " + Mana);
        System.out.println("Attack : " + Atk);
        System.out.println("Defense : " + Def);
        System.out.println("-------------------------------------");
    }

}
