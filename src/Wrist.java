public class Wrist implements Accessories{
    private String name,type;
    private int level;
    private double bonus,AtkBonus;

    Wrist(String name,int level){
        this.name = name;
        this.level = level;
        type = "Wrist";
        bonus = 10 * (1+0.7*level);
        AtkBonus = (6 * (1+0.7*level));
    }
    Wrist(String name){
        this(name,1);
    }

    /**
     * get wrist level
     * @return wrist level as int
     */
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
     * get name of wrist
     * @return a String that give the name of wrist
     **/
    @Override
    public String getName() {
        return name;
    }

    /**
     * Update player damage by using bonus that calculating in the constructor
     * @param player to update player damage
     * effect : player damage update
     */
    @Override
    public void AccUpdateStatus(RPGcharacter player) {
        player.damage += bonus;
    }


    /**
     * Get a damage bonus by calculating in the constructor and writing it as a String
     * @return String that tell details about bonus from wrist
     **/
    @Override
    public String getBonus() {
        return "Bonus from " + name + " [ " + type + " ] "+" : +"  + String.format("%.1f",bonus) + " dmg";
    }

    /**
     * Get an Attack bonus by calculating in the constructor and make it int
     * @return AtkBonus as int
     */
    public int AtkBonus(){
        return (int)AtkBonus;
    }

    /**
     * Get a damage bonus by calculating in the constructor and make it int
     * @return bonus as int
     */
    public int getDamageBonus(){
        return (int)bonus;
    }
}
