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
     *
     * @return
     */
    @Override
    public String getBonus() {
        return "Bonus from " + name + " [ " + type + " ] "+" : +"  + String.format("%.1f",bonus) + " dmg";
    }

    public int AtkBonus(){
        return (int)AtkBonus;
    }
    public int getDamageBonus(){
        return (int)bonus;
    }
}
