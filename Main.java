

public class Main{
    static String[][] arr = new String[7][6];
    static int count = 0;

    public static void Board() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                arr[j][i] = ("_");
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }

    public static void Print(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(Main.arr[j][i]);
            }
            System.out.println();
        }
    }

    public static String Loop(){
        if(count == 21){
            System.out.println("Draw Game!");
            return "-";

        }
        Game.play();
        if(Game.checkWin("X") == true){
            Main.Print();
            System.out.println("Player Wins");
            return "Win";
        }
        Bot.play();
        if(Game.checkWin("O") == true){
            Main.Print();
            System.out.println("Bot Wins");
            return "Lose";
        }
        Main.Print();
        Main.Loop();
        return "Game Over";
    }

    public static void main(String[] args){
        Main.Board();
        Loop();

    }
}
