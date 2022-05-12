package day11.task2;

public class Magician extends Hero implements MagicAttack {

    int magicAtt;

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicDef = 80;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health = hero.health - (magicAtt - (int) (magicAtt * hero.magicDef / 100));
        if (hero.health < MIN_HEALS) hero.health = MIN_HEALS;
    }

    public String toString() {
        return "Magician{health=" + health + "}";
    }
}
