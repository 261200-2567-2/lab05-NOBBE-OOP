//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GUN G =new GUN();
        Armor A = new Armor();
        Markman M = new Markman(0);
        M.EquipAccessories(G);

        Tank T = new Tank(0);
        T.EquipAccessories(A);

        M.play();
        T.play();

        T.levelUp();
        T.play();

        System.out.println("Battle Start!\n-----------------------");

        M.attack(T);
        T.attack(M);
        M.attack(T);

        M.play();
        T.play();
    }
}