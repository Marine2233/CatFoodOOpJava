public class Cat{
    
    private int appetite;
    private String name;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }
    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }


    public Cat(String name,int appetite,boolean satiety) {
        this.satiety = satiety;
        this.appetite = appetite;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
        
    }

}