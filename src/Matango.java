public class Matango extends Monster{
    public void attack(Creature target){
        System.out.println(this.getName()+this.getSuffix()+"は体当たり攻撃！"+target.getName()+"に6のダメージを与えた！");
        target.setHp(target.getHp()-6);
    }

    public Matango(String name, int hp, char suffix){
        super(name, hp, suffix);
    }
}
