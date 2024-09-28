public class Pokemon {

    String name;
    Type type;
   private double life;
    Power [] skills;

    public Pokemon(String name, Type type, Power[] skills) {
        this.name = name;
        this.type = type;
        this.life = 100.0;
        this.skills = skills;
    }

    public double attack()
    {
        int max = skills.length;
        int min = 0;
        int range = max-min;

        int attack = (int)(Math.random()*range)+min;
        double damage = (skills[attack].magnitude)*(Math.random());
        System.out.println(this.name+" uso "+this.skills[attack]);

        return damage;

    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    @Override
    public String toString() {

        return this.name+" "+this.life;
    }
}
