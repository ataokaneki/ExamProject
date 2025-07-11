public abstract class Monster implements Creature{
    String name;
    private int hp;
    char suffix;

    public String getName(){
        return this.name;
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        try{
            this.hp = hp;
        }catch(IllegalArgumentException i) {
            this.hp = 0;
        }
    }

    public final boolean isAlive(){
        return this.hp>0;
    }

    public void showStatus(){
        System.out.println(this.name + this.suffix + "：HP" + this.hp);
    }

    public Monster(int hp, char suffix) {
        this.suffix = suffix;
        try {
            this.setHp(hp);
        }catch(IllegalArgumentException i) {
            System.out.println("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
    }
}
