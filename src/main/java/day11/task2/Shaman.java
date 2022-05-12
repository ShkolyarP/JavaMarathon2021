package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer{

    final int HEAL_HIMSELF_SHAMAN = 50;
    final int HEALTH_SHAMAN = 50;
    final int HEAL_TEAMMATE_SHAMAN = 30;
    final int HEALTH_TEAMMATE_HERO_SHAMAN = 70;
    int magicAtt;

    public Shaman() {
        physAtt = 10;
        magicAtt = 15;
        magicDef = 20;
        physDef = 20;
    }

    @Override
    public void healHimself() {
        if (health<=HEALTH_SHAMAN){
            health = health + HEAL_HIMSELF_SHAMAN;
        } else health = MAX_HEALS;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health<=HEALTH_TEAMMATE_HERO_SHAMAN){
            hero.health = hero.health + HEAL_TEAMMATE_SHAMAN;
        } else hero.health = MAX_HEALS;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health = hero.health - (magicAtt - (int) (magicAtt * hero.magicDef / 100));
        if (hero.health < 0) hero.health = 0;
    }


    public String toString() {
        return "Shaman{health=" + health + "}";
    }
}
