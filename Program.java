public class Program {
    public static void main(String[] args) {
        Cat[] cats ={
                    new Cat("Tom", 35,false),
                    new Cat("Bob", 33,false),
                    new Cat("Sam", 20,false),
                    new Cat("Fil",25,false),
                    new Cat("Ad", 28,false)
                    };

        Plate plate = new Plate(1);

        plate.info();
        System.out.println();

        for(Cat cat: cats){
            if(plate.getFood() < cat.getAppetite()){
            System.out.println(plate.getFood()+" Еды в тарелке недостаточно, " + cat.getName()+", голоден " + cat.isSatiety());
            plate.setFood(plate.getFood() + cat.getAppetite());
            cat.setSatiety(true);
            System.out.println(plate.getFood()+" Еды достаточно, "+cat.getName()+" ест " + cat.isSatiety());
            plate.setFood(plate.getFood() - cat.getAppetite());
            System.out.println("Кот " + cat.getName()+", поел ." + cat.isSatiety());
            
            }
            else{
                plate.setFood(plate.getFood() - cat.getAppetite());
                cat.setSatiety(true);
                System.out.println("Кот сыт, " + cat.getName() + " "+ cat.isSatiety());
            }

        }
    }
}
