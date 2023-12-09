public class Shield {
    private String name;
    private int SHlevel;
    private double defense;
    private double SHItemSpeed;


    Shield(String name,int baseDef,int level){
        this.name = name;
        SHlevel = level;
        defense = baseDef*(1+0.05*SHlevel);
        SHItemSpeed = 10*(1+0.7*SHlevel);
    }


    Shield(String name,int baseDef){
        this(name,baseDef,1);
        //set Default level to 1
    }

    /**
     * get SHItemSpeed(speed decrease when hold shield) that calculating in constructor
     * @return SHItemSpeed as double
     */
    public double DecreaseSped(){
        return SHItemSpeed;
    }

    /**
     * get name of shield
     * @return a String that give the name of shield
     */
    public String getName(){
        return name;
    }

    /**
     * get defense of shield that calculating in constructor
     * @return defense of shield as double
     */
    public double getDefense() {return defense; }

    /**
     * get shield level
     * @return shield level as int
     **/
    public int getLevel() {return SHlevel;}
}
