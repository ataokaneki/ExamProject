public interface Creature {
    boolean isAlive();
    void showStatus();
    void attack(Creature target);
    String getName();
    int getHp();
    void setName(String name);
    void setHp(int hp);
}
