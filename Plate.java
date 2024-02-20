public class Plate  {
    protected int food;

    public Plate(int food){
        if(food <= 1){
            this.food = 50;
        }else{
               this.food = food;
            }
    }

    public void info(){
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
        
    }
}
