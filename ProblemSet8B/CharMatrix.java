public class CharMatrix
{
    char[][] grid;
    int r;
    int c;

    // Constructors;
    public CharMatrix(int rows, int cols){
        grid = new char[rows][cols];
        r = rows;
        c = cols;
    }

    public CharMatrix(int rows, int cols, char fill){
        grid = new char[rows][cols];
        r = rows;
        c = cols;
        for(int i = 0; i < rows; i++){
            for(int j=0; j < cols; j++){
                grid[i][j] = fill;
            }
        }
    }

    public void display() {
        // Prints the characters of the array to the terminal using print and println.
        for(int i = 0; i < r; i++){
            for(int j=0; j < c; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public int numRows() {
        //Returns the number of rows in the 2D Array.
        return r;
    }

    public int numCols() {
        // Returns the number of columns in the 2D Array.
        return c;
    }

    public char charAt(int row, int col){
        //Returns the character at the indexes [row, col]
        return grid[row][col];
    }

    public void setCharAt(int row, int col, char ch) {
        //Sets the character at index [row, col] to ch
        grid[row][col] = ch;
    }

    public boolean isEmpty(int row, int col){
        //    Returns true if the character at row, col is a SPACE ' ', false otherwise
        return grid[row][col] == ' ';
    }

    public void fillRect(int row0, int col0, int row1, int col1, char fill) {
        //Fill the given rectangle with the fill characters. row0, col0 is the upper left corner and row1, col1 is the lower right corner of the rectangle. The coordinates are inclusive.
        for(int i = row0; i <= row1; i++){
            for(int j = col0; j <= col1; j++){
                grid[i][j] = fill;
            }
        }
    }   

    public void clearRect(int row0, int col0, int row1, int col1){
        //Fills the given rectangle with the SPACE characters. row0, col0 is the upper left corner and row1, col1 is the lower right corner of the rectangle.
        for(int i = row0; i <= row1; i++){
            for(int j = col0; j <= col1; j++){
                grid[i][j] = ' ';
            }
        }
    }

    public int countInRow(int row){
        //Returns the count of all non-SPACE characters in row.
        int count = 0;
        for(int i = 0; i < c; i++){
            if (grid[row][i] == ' ') count++;
        }
        return count;
    }

    public int countInCol(int col){
        // Returns the count of all non-SPACE characters in col.
        int count = 0;
        for(int i = 0; i < r; i++){
            if (grid[i][col] == ' ') count++;
        }
        return count;
    }

}
