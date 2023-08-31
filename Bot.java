import java.util.Random;

public class Bot {

    public static void play(){
        Random rand = new Random();
        int col = rand.nextInt(7);

        if(Main.arr[col][0] != "_"){
           play();
        }

        for (int i = 5; i >= 0; i--) {
            if(Main.arr[col][i] == "_"){
                Main.arr[col][i] = "O";
                break;
            }
        }
    }
}

