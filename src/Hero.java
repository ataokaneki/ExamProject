public class Hero extends Character{
    String weapon;

    public void attack(Creature target){
        System.out.println(this.name + "は" + this.weapon + "で攻撃！" + target.getName() + "に10のダメージを与えた！");
        target.setHp(target.getHp()-10); //？？？
    }

    public void setHp(int hp){
        try {
            Character.setHp();  //？？？？？
        }catch(IllegalArgumentException i) {
            System.out.println("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
    }

    public Hero(String name, int hp, String weapon){
        super(name, hp);
        /*
        this.name = name;
        this.setHp();
        */
        this.weapon = weapon;
    }
}
