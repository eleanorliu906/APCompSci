import java.util.Scanner;

public class TicTacToe
{
    static boolean continueGame = true;
    static int currplayer = 1; 
    static int[][] board = new int[3][3];
    static Scanner sc = new Scanner(System.in);
    static boolean win = false;
    static int round = 1;

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
        currplayer = 1;
        continueGame = true;
    }

    public static void promptInput(int p){ // pass in who is the current player
        int curr = p;
        boolean valid = false;

        while (!valid){
            System.out.println("Player " + curr + ": Please input the row,column (without space) you want to fill");
            String s = sc.nextLine();
            if (s.length() >= 2 && Character.isDigit(s.charAt(0)) && Character.isDigit(s.charAt(2))) {
                int[] a = readCoordinate(s);
                if (a[0] < 3 &&  a[1] < 3) {
                    if (board[a[0]][a[1]] == 0){
                        board[a[0]][a[1]] = curr;
                        printBoard();
                        valid = true;
                        if (currplayer == 1) currplayer = 2;
                        else currplayer = 1;
                        break;
                    } else {
                        System.out.println("The space you have indicated is already filled");
                    }
                } else {
                    System.out.println("Invalid Input");
                }
            } else {
                System.out.println("Invalid Input");
            }
        }
    }

    public static void printBoard(){
        System.out.println("ROUND " + round);
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
            }
        }

        for(int j = 0; j < 3; j++) { // check for columns 
            if (board[0][j] == board [1][j] && board [1][j] == board[2][j]) {
                win = true;
                if (winPlayer == 0 ) winPlayer = board [0][j];
            }
        }
        //check diagonals
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
            win = true;
            if (winPlayer == 0 )winPlayer = board[1][1];
        }
        // make sure it's not the "0" that repeats
        if (winPlayer == 0) win = false;
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
        return a;
    }

    public static void gameAgain(){
        System.out.println("Would you like to play again? [Y/N]");
        String s = sc.nextLine();
        s = s.toLowerCase();
        if (s.equals("y")) {
            round++;
            setup();
        }
        else if (s.equals("n")){
            System.out.println("Have a nice day!");
        }
        else if (!s.equals("n")){
            System.out.println("Invalid input; game terminated. Have a nice day!");
        }
    }
}
