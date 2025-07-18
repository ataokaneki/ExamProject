import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<>();
        party.add(new Hero("勇者", 100, "剣"));
        party.add(new Wizard("魔法使い",60,20));
        party.add(new Thief("盗賊", 70));

        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(new Matango(45, 'A'));
        monsters.add(new Goblin(50, 'A'));
        monsters.add(new Slime(40, 'A'));

        System.out.println("---味方パーティ---");
        for(Character character : party) {
            System.out.println(character.getName()+"：HP "+character.getHp());
        }
        System.out.println("---敵グループ---");
        for(Monster monster : monsters){
            System.out.println(monster.getName()+monster.getSuffix()+"：HP "+monster.getHp());
        }

        System.out.println("\n味方の総攻撃！");
        for(Character character : party) {
            for(Monster monster : monsters){
                character.attack(monster);
            }
        }
        System.out.println("\n敵の総攻撃！");
        for(Monster monster : monsters){
            for(Character character : party){
                monster.attack(character);
            }
        }

        System.out.println("\nダメージを受けた"+party.getFirst().getName()+"が突然光だした！");
        System.out.println(party.getFirst().getName()+"はスーパーヒーローに進化した！");
        SuperHero sh = new SuperHero((Hero)party.getFirst());
        for(Monster monster : monsters){
            sh.attack(monster);
        }

        System.out.println("\n---味方パーティ最終ステータス---");
        for(Character character : party) {
            System.out.println(character.getName()+"：HP "+character.getHp());
            System.out.print("生存状況：");
            if(character.isAlive()) {
                System.out.println("生存");
            }else{
                System.out.println("戦闘不能");
            }
        }
        System.out.println("---敵グループ最終ステータス---");
        for(Monster monster : monsters){
            System.out.println(monster.getName()+monster.getSuffix()+"：HP "+monster.getHp());
            System.out.print("生存状況：");
            if(monster.isAlive()) {
                System.out.println("生存");
            }else{
                System.out.println("討伐済み");
            }
        }

    }
}
