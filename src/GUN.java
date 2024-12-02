public class GUN implements Accessory{
    private double Atk;
    GUN(){
        Atk = 10;
    }
    public double getStats(){
        return Atk;
    }
    public int typeCheck(){
        return 2;
    }
}