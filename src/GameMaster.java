import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        Hero h = new Hero("勇者", 100, "剣");
        Wizard w = new Wizard("魔法使い",60,10);
        Thief t = new Thief("盗賊", 70);

        ArrayList<Character> c = new ArrayList<>();
        c.add(h);
        c.add(w);
        c.add(t);


        /*
        ArrayList<Hero> h = new ArrayList<>();
        ArrayList<Wizard> w = new ArrayList<>();
        ArrayList<Thief> t = new ArrayList<>();

        ArrayList<Goblin> g = new ArrayList<>();
        ArrayList<Matango> m = new ArrayList<>();
        ArrayList<Slime> s = new ArrayList<>();
        */

    }
}
