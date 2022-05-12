package day11.task2;

public class Paladin extends Hero implements Healer {

    final int HEAL_HIMSELF_PALADIN = 25;
    final int HEALTH_PALADIN = 75;
    final int HEAL_TEAMMATE_PALADIN = 10;
    final int HEALTH_TEAMMATE_HERO_PALADIN = 90;

    public Paladin() {
        physAtt = 15;
        physDef = 50;
        magicDef = 20;
    }

    @Override
    public void healHimself() {
        if (health <= HEALTH_PALADIN) {
            health = health + HEAL_HIMSELF_PALADIN;
        } else health = MAX_HEALS;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health <= HEALTH_TEAMMATE_HERO_PALADIN) {
            hero.health = hero.health + HEAL_TEAMMATE_PALADIN;
        } else hero.health = MAX_HEALS;
    }

    public String toString() {
        return "Paladin{health=" + health + "}";
    }
}
