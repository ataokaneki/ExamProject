public class SuperHero extends Hero {
    public void setHp(int hp){}
    public void attack(Creature target){
        System.out.println(this.name + "は" + this.weapon + "で攻撃！" + target.getName() + "に25のダメージを与えた！");
        target.setHp(target.getHp()-25); //25減らす
    }

    public SuperHero(Hero h) {
        super(h.name, h.getHp(), h.weapon);  //終わってる
    }
}
