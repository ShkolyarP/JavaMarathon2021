package day11.task2;

public abstract class Hero implements PhysAttack {
    final int MIN_HEALS = 0;
    final int MAX_HEALS = 100;
    int health;
    int physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (physAtt - (int) (physAtt * hero.physDef / 100));
        if (hero.health < MIN_HEALS) hero.health = MIN_HEALS;
    }
}
