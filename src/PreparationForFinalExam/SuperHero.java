package PreparationForFinalExam;

public class SuperHero
{
    int energyLevel;
    public SuperHero(int a){
        energyLevel = a;
    }
    public void testEnergy() throws SuperHeroException {
        if(energyLevel < 50)
            throw new SuperHeroException(50);
    }
    public static void main(String[] args){
        SuperHero hero = new SuperHero(40);
        try{
            hero.testEnergy();
        }catch(SuperHeroException e){
            e.printStackTrace();
        }
    }
}
class SuperHeroException extends Exception {
    public SuperHeroException() {
        super();
    }
    public SuperHeroException(String message) {
        super(message);
    }
    public SuperHeroException(int energyLevel) {
        super("Energy level dropped below:" + energyLevel);
    }
}
