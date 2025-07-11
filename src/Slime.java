public final class Slime extends Monster{
    public void attack(Creature target){
        System.out.println("スライム"+this.suffix+"は体当たり攻撃！"+target.getName()+"に5のダメージを与えた！");
        target.setHp(target.getHp()-8);
    }

    public Slime(int hp, char suffix){
        super(hp, suffix);
    }
}
