public class SuperHero extends Hero {
    public void attack(Creature target){
        System.out.println(this.getName() + "は" + this.getWeapon() + "で攻撃！" + target.getName() + "に25のダメージを与えた！");
        target.setHp(target.getHp()-25);
    }

    public SuperHero(Hero h) {
        super(h.getName(), h.getHp(), h.getWeapon());
    }
}
