public class Matango extends Monster{
    public void attack(Creature target){
        System.out.println("お化けキノコ"+this.suffix+"は体当たり攻撃！"+target.getName()+"に6のダメージを与えた！");
        target.setHp(target.getHp()-6);  //6減らす
    }
}
