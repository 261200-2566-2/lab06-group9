public class Clothing implements Accessories{
    private String name,type;
    private int level;
    private double bonus;
    private double healBonus;

    Clothing(String name,int level){
        this.name = name;
        this.level = level;
        type = "Clothing";
        bonus = 15 * (1+0.8*level);
        healBonus =(8*(1+0.02*level));
    }
    Clothing(String name){
        this(name,1);
        //set level 1
    }

    /**
     * get clothing level
     * @return clothing level as int
     **/
    @Override
    public int getLevel() {
        return level;
    }

    /**
     * get type of accessories
     * @return type of this accessory as String
     **/
    @Override
    public String getType() {
        return type;
    }

    /**
     * get name of clothing
     * @return a String that give the name of clothing
     **/
    @Override
    public String getName() {
        return name;
    }

    /**
     * Update player defense by using defense bonus that calculating in the constructor
     * @param player to update player defense
     * effect : player defense update
     */
    @Override
    public void AccUpdateStatus(RPGcharacter player) {
        player.defense += bonus;
    }

    /**
     * Get a defense bonus by calculating in the constructor and writing it as a String
     * @return String that tell details about bonus from clothing
     **/
    @Override
    public String getBonus() {
        return "Bonus from " + name + " [ " + type + " ] "+" : +"  + String.format("%.1f",bonus) + " def";
    }

    /**
     * Get a heal bonus by calculating in the constructor and make it int
     * @return heal bonus as int
     */
    public int gethealBonus(){
        return (int)healBonus;
    }

    /**
     * Get a defense bonus by calculating in the constructor and make it int
     * @return defense bonus as int
     */
    public int getDefBonus(){
        return (int)bonus;
    }
}
