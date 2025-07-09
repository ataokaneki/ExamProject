public class Wizard extends Character{
    int mp;

    public void attack(Creature target){
        System.out.println(this.getName() + "は火の玉を放った！" + target.getName() + "に3のダメージを与えた！");
        target.setHp(target.getHp()-6);  //6減らす(？？？)
        this.mp -= 1;
    }

    public void setHp(int hp){}

    public Wizard(String name,int hp, int mp){
        super(name,hp);
        this.mp = mp;
    }
}
