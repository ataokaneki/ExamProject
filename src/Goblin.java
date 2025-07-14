public class Goblin extends Monster{
    public void attack(Creature target){
        System.out.println(this.getName()+this.getSuffix()+"はナイフで切り付けた！"+target.getName()+"に8のダメージを与えた！");
        target.setHp(target.getHp()-8);
    }

    public Goblin(String name, int hp, char suffix){
        super(name, hp, suffix);
    }
}
