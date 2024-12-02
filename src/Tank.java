public class Tank implements Character{
    private int level;
    private double Hp;
    private double maxHp;
    private double Mana;
    private double maxMana;
    private  double Atk = 5;
    private  double Def = 20;

    public Tank(int level) {
        this.level = level;
        maxHp = 100 + 15 * level;
        maxMana = 50 + 2 * level;
        Hp = maxHp;
        Mana = maxMana;
    }

    public void heal() {
        if(Mana < 7) Hp += 5;
        if(Hp > maxHp) Hp = maxHp;
        Mana -= 5;
    }

    public void getAttacked(double atk) {
        Hp -= atk-0.7* Def;
    }

    public void levelUp() {
        level++;
        maxHp = 100 + 15 * level;
        maxMana = 50 + 2 * level;
        System.out.println("--------------------------------------");
        System.out.println("--------TANK---LEVEL---UP----------");
        System.out.println("--------------------------------------");
    }

    public void attack(Character target) {
        target.getAttacked(Atk);
        System.out.println("--------------------------------------");
        System.out.println("--------TANK---ATTACKS---MARKMAN----------");
        System.out.println("--------------------------------------");
    }

    public void EquipAccessories(Accessory a) {
        if(a.typeCheck() == 1){
            System.out.println("--------------------------------------");
            System.out.println("----TANK has a Warrior!! +10 Defense----");
            System.out.println("--------------------------------------");
        }else{
            System.out.println("TANK can not equip accessories!");
        }
    }
    public void play(){
        System.out.println("--------------------------");
        System.out.println("Character Class : TANK");
        System.out.println("Level : " + level);
        System.out.println("MaxHp : " + maxHp);
        System.out.println("Hp : " + Hp);
        System.out.println("MaxMana : " + maxMana);
        System.out.println("Mana : " + Mana);
        System.out.println("Attack : " + Atk);
        System.out.println("Defense : " + Def);
        System.out.println("--------------------------");
    }

}
