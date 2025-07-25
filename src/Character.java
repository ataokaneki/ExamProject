public abstract class Character implements Creature {
    private String name;
    private int hp;

    public String getName(){
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHp(int hp){
        this.hp = Math.max(0, hp);
    }

    public final boolean isAlive(){
        return this.hp>0;
    }

    public void showStatus() {
        System.out.println(this.getName() + "：HP " + this.getHp());
    }



    public Character(String name, int hp) {
        this.setName(name);
        if(hp < 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.setHp(hp);
    }
}
