import java.util.Scanner;

public class Game {


    public static void play() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Column");
        int col = myObj.nextInt();
        if (col > 7 || col < 1) {
            System.out.println("Please enter a valid number between 1-7.");
            while (col > 7 || col < 1) {
                col = myObj.nextInt();
            }
        }
        col = col - 1;

        if (Main.arr[col][0] != "_") {
            System.out.println("Column already fll, please select another one.");
            play();
        }

        for (int i = 5; i >= 0; i--) {
            if (Main.arr[col][i] == "_") {
                Main.arr[col][i] = "X";
                break;
            }
        }
    }

    public static boolean checkWin(String team) {
        //vert
        for (int i = 0; i < 7; i++) {
            if (Main.arr[i][5] == team) {
                if (Main.arr[i][4] == team) {
                    if (Main.arr[i][3] == team) {
                        if (Main.arr[i][2] == team) {
                            System.out.println(team + " wins");
                            return true;
                        }
                    }
                }
            } else if (Main.arr[i][4] == team) {
                if (Main.arr[i][3] == team) {
                    if (Main.arr[i][2] == team) {
                        if (Main.arr[i][1] == team) {
                            System.out.println(team + " wins");
                            return true;
                        }
                    }
                }
            } else if (Main.arr[i][3] == team) {
                if (Main.arr[i][2] == team) {
                    if (Main.arr[i][1] == team) {
                        if (Main.arr[i][0] == team) {
                            System.out.println(team + " wins");
                            return true;
                        }
                    }
                }
            }
        }
        //hor
        for (int i = 0; i < 6; i++) {
            if (Main.arr[0][i] == team) {
                if (Main.arr[1][i] == team) {
                    if (Main.arr[2][i] == team) {
                        if (Main.arr[3][i] == team) {
                            System.out.println(team + " wins");
                            return true;
                        }
                    }
                }
            } else if (Main.arr[1][i] == team) {
                if (Main.arr[2][i] == team) {
                    if (Main.arr[3][i] == team) {
                        if (Main.arr[4][i] == team) {
                            System.out.println(team + " wins");
                            return true;
                        }
                    }
                }
            } else if (Main.arr[2][i] == team) {
                if (Main.arr[3][i] == team) {
                    if (Main.arr[4][i] == team) {
                        if (Main.arr[5][i] == team) {
                            System.out.println(team + " wins");
                            return true;
                        }
                    }
                }
            } else if (Main.arr[3][i] == team) {
                if (Main.arr[4][i] == team) {
                    if (Main.arr[5][i] == team) {
                        if (Main.arr[6][i] == team) {
                            System.out.println(team + " wins");
                            return true;
                        }
                    }
                }
            }
        }
        //right diag
        for (int i = 0; i < 4; i++) {
            if (Main.arr[0][i] == team) {
                if (Main.arr[1][i + 1] == team) {
                    if (Main.arr[2][i + 2] == team) {
                        if (Main.arr[3][i + 3] == team) {
                            System.out.println(team + " wins");
                            return true;
                        }
                    }
                }
            } else if (Main.arr[1][i] == team) {
                if (Main.arr[2][i + 1] == team) {
                    if (Main.arr[3][i + 2] == team) {
                        if (Main.arr[4][i + 3] == team) {
                            System.out.println(team + " wins");
                            return true;
                        }
                    }
                }
            } else if (Main.arr[2][i] == team) {
                if (Main.arr[3][i + 1] == team) {
                    if (Main.arr[4][i + 2] == team) {
                        if (Main.arr[5][i + 3] == team) {
                            System.out.println(team + " wins");
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}