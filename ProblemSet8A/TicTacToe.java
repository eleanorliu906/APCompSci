import java.util.Scanner;

public class TicTacToe
{
    static boolean continueGame = true;
    static boolean p1valid  = false;
    static boolean p2valid  = false;
    static boolean currplayer = true; // true-player1; false-player2
    static int[][] board = new int[3][3];
    static Scanner sc = new Scanner(System.in);
    static int[] p1 = new int[2];
    static int[] p2 = new int[2];
    static boolean win = false;

    public static void main(String[] args){
        setup();

        while (continueGame){
            promptInput(currplayer);
            checkWin();
            if (win){
                gameAgain();
            }
        }
    }

    public static void setup(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = 0;
            }
        }
        p1valid  = false;
        p2valid  = false;
        currplayer = true;
    }

    public static void promptInput(boolean p){
        if (p){
            while (!p1valid){
                System.out.println("Player 1: Please input the row,column (without space) you want tofill");
                int[] a = readCoordinate(sc.nextLine());

                if (a[0] < 3 &&  a[1] < 3) {
                    if (board[a[0]][a[1]] == 0){
                        board[a[0]][a[1]] = 1;
                        printBoard();
                        p1valid = true;
                        p = !p;
                        currplayer = !currplayer;
                        break;
                    } else {
                        System.out.println("Invalid Input");
                    }
                } else {
                    System.out.println("Invalid Input");
                }
            }
        } else {
            while (!p2valid){
                System.out.println("Player 2: Please input the row,column (without space) you want tofill");

                int[] a = readCoordinate(sc.nextLine());
                if (board[a[0]][a[1]] == 0 && a[0] < 3 &&  a[1] < 3) {
                    board[a[0]][a[1]] = 2;
                    p2valid = true;
                    printBoard();
                    p = !p;
                    currplayer = !currplayer;
                } else {
                    System.out.println("Invalid Input");
                }
            }
        }

        p1valid = false;
        p2valid = false;
    }

    public static void printBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print( "[" + board[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public static void checkWin(){
        int winPlayer = 0;

        for(int i = 0; i < 3; i++) { // check for rows 
            if (board[i][0] == board [i][1] && board [i][1] == board[i][2]) {
                win = true;
                if (winPlayer == 0 ) winPlayer = board [i][1];
                //System.out.println(win + " " + winPlayer);
            }
        }

        for(int j = 0; j < 3; j++) { // check for columns 
            if (board[0][j] == board [1][j] && board [1][j] == board[2][j]) {
                win = true;
                if (winPlayer == 0 ) winPlayer = board [0][j];
                //System.out.println(win + " " + winPlayer);
            }
        }
        //check diagonals
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
            win = true;
            if (winPlayer == 0 )winPlayer = board[1][1];
            //System.out.println(win + " " + winPlayer);
        }
        if (winPlayer == 0) win = false;
        //System.out.println(win + " " + winPlayer);
        if (win) {
            continueGame = false;
            congratulate(winPlayer);
        }
    }  

    public static void congratulate(int p){
        System.out.println("Congratulations to Player " + p + " for winning this round of Tic Tac Toe!");
    }

    public static int[] readCoordinate(String s){
        int[] a = new int[2];
        a[0] = Integer.parseInt(s.substring(0, 1))-1;
        a[1] = Integer.parseInt(s.substring(2, 3))-1;
        // System.out.println(a[0] + " " + a[1]);
        return a;
    }

    public static void gameAgain(){
        System.out.println("Would you like to play again? [Y/N]");
        String s = sc.nextLine();
        s = s.toLowerCase();
        if (s.equals("y")) {
            setup();
            continueGame = true;
        }
        else if (s.equals("n")){
            System.out.println("Have a nice day!");
        }
        else if (!s.equals("n")){
            System.out.println("Invalid input; game terminated. Have a nice day!");
        }
    }
}