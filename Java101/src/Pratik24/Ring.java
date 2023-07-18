package Pratik24;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== NEW ROUND ===========");
                //the random number that determines who will hit first
                double randomHit = Math.random();
                if(randomHit>0.5){
                    f2.health = f1.hit(f2);
                } else {
                    f1.health = f2.hit(f1);
                }
                if (isWin()){
                    break;
                }
                if(randomHit>0.5){
                    f1.health = f2.hit(f1);
                } else {
                    f2.health = f1.hit(f2);
                }
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Fighters' weights is doesn't fit. ");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Wins the game : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Wins the game : " + f1.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " remaining life \t:" + f1.health);
        System.out.println(f2.name + " remaining life \t:" + f2.health);
    }
}
