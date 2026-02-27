package Day_05.threads;

public class FoodOrder extends Thread {
    String task;

    FoodOrder(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task +" started");
    }

    public static void main(String[] args) {
        FoodOrder cooking = new FoodOrder("Cooking stated");
        FoodOrder packing = new FoodOrder("packing stated");
        FoodOrder delivery = new FoodOrder("delivery stated");
        cooking.start();
        packing.start();
        delivery.start();
    }
}

/*
ℹ️ Points to remember:
⭐ Extend Thread
⭐ Override run()
⭐ use start()
⭐ It is less flexible because of inheritance limitation
*/
