public class Ring implements Accessories{
    private String name,type;
    private int level;
    private double bonusMana;
    private double bonusSpeed;

    Ring(String name,int level){
        this.name = name;
        this.level = level;
        type = "Ring";
        bonusMana = 13 * (1+0.7*level);
        bonusSpeed = 0.7 * level;
    }

    Ring(String name){
        this(name,1);
    }

    /**
     * get ring level
     * @return ring level as int
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
     * get name of ring
     * @return a String that give the name of ring
     **/
    @Override
    public String getName() {
        return name;
    }

    /**
     * Update player MaxMana , MaxSpeed by using bonusMana and bonusSpeed that calculating in the constructor
     * @param player to update player MaxMana , MaxSpeed
     * effect : player MaxMana and Max Speed update
     */
    @Override
    public void AccUpdateStatus(RPGcharacter player) {
        player.MaxMana += (int) bonusMana;
        player.MaxSpeed += (int) bonusSpeed;
        player.baseSpeed = player.MaxSpeed;
    }

    /**
     * Get a MaxMana bonus by calculating in the constructor and writing it as a String
     * @return String that tell details about bonus from ring
     **/
    @Override
    public String getBonus() {
        return "Bonus from " + name + " [ " + type + " ] "+" : +"  + String.format("%.1f",bonusMana) + " MaxMana";
    }
    /**
     * Get a MaxSpeed bonus by calculating in the constructor and make it int
     * @return bonusSpeed as int
     */
    public int getSpeedbonus(){
        return (int)bonusSpeed;
    }

    /**
     * Get a MaxMana bonus by calculating in the constructor and make it int
     * @return bonusMana as int
     */
    public int getManabonus(){
        return  (int)bonusMana;
    }
}
