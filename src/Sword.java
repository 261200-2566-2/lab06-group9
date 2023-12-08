public class Sword {
    protected String name;
    private int SWlevel;
    private double damage;
    private double SItemSpeed;

    Sword(String name,int baseDmg,int level){
        this.name = name;
        SWlevel = level;
        damage = baseDmg*(1+0.1*SWlevel);
        SItemSpeed = 10*(1+0.5*SWlevel);
    }

    Sword(String name,int baseDmg){
        this(name,baseDmg,1);
        //set Default level to 1
    }
    /**
     * get SItemSpeed(speed decrease when hold sword) that calculating in constructor
     * @return SItemSpeed as double
     */
    public double DecreaseSped(){
        return SItemSpeed;
    }

    /**
     * get name of sword
     * @return a String that give the name of sword
     */
    public String getName(){
        return name;
    }

    /**
     * get damage of sword that calculating in constructor
     * @return damage of sword as double
     */
    public double getDamage() {return  damage; }

    /**
     * get sword level
     * @return sword level as int
     **/
    public int getLevel() {return SWlevel;}


}
