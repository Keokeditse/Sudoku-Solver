//@ author Keokeditse Ndala 
//@ version 1.0 (13 December 2024)
// SUDOKU SOLVER
public class Sudoku {  
    public boolean Check(int[][] b, int r, int c, int n){  
        // the loop takes care of the clash in the row of the grid  
        for (int d = 0; d < b.length; d++){  
        // if the number that we have inserted is already   
        // present in that row then return false  
            if (b[r][d] == n){  
                return false;  
                }  
            }  
  
        // the loop takes care of the clash in the column of the grid
        for (int[] b1 : b) {
            // if the number that we have inserted is already
            // present in that column then return false
            if (b1[c] == n) {
                return false;
            }
        }  
  
        // the loop takes care of the clash in the sub-grid that is present in the grid  
        int sqt = (int)Math.sqrt(b.length);  
        int boxRowSt = r - r % sqt;  
        int boxColSt = c - c % sqt;  
  
        for (int r1 = boxRowSt; r1 < boxRowSt + sqt; r1++){  
            for (int d = boxColSt; d < boxColSt + sqt; d++) {  
                // if the number that we have inserted is already   
                // present in that sub-grid then return false  
                if (b[r1][d] == n){  
                    return false;  
                    }  
                }  
            }  
  
        // if there is no clash in the grid, then it is safe and   
        // true is returned  
        return true;  
    }  
  
    public boolean solve(int[][] b, int num) {  
        int r = -1;  
        int c = -1;  
        boolean isVacant = true;  
        for (int i = 0; i < num; i++){  
            for (int j = 0; j < num; j++){  
                if (b[i][j] == 0){  
                    r = i;  
                    c = j;  
  
                    // false value means   
                    // there is still some   
                    // vacant cells in the grid  
                    isVacant = false;  
                    break;  
                }  
            }  
            if (!isVacant){  
                break;  
            }  
        }  
  
        // there is no empty space left  
        // in the grid  
        if (isVacant){  
            return true;  
        }  
  
        // otherwise for each row do the backtracking  
        for (int no = 1; no <= num; no++){  
            if (Check(b, r, c, no)) {  
                b[r][c] = no;  
                if (solve(b, num)){  
                    // display(board, num);  
                    return true;  
                }else{  
                    b[r][c] = 0;  
                }  
            }  
        }  
        return false;  
    }  
    // Displaying the grid
    public void display(int[][] b, int n) {
    // Convert numbers to strings (handling >9 as letters)
    String[][] grid = new String[n][n];
    String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P"};
    
    for (int r = 0; r < n; r++) {
        for (int c = 0; c < n; c++) {
            int val = b[r][c];
            if (val == 0) {
                grid[r][c] = "."; // empty cell
            } else if (val < 10) {
                grid[r][c] = String.valueOf(val);
            } else {
                grid[r][c] = letters[val - 10]; // map 10 -> A, 11 -> B, etc.
            }
        }
    }

    int boxSize = (int) Math.sqrt(n);

    System.out.println("Solved Sudoku Grid:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(grid[i][j] + " ");
            // vertical divider
            if ((j + 1) % boxSize == 0 && j != n - 1) {
                System.out.print("| ");
            }
        }
        System.out.println();
        // horizontal divider
        if ((i + 1) % boxSize == 0 && i != n - 1) {
            for (int k = 0; k < n + boxSize - 1; k++) {
                System.out.print("--");
            }
            System.out.println();
        }
    }
}

  
    // main method  
    public static void main(String argvs[]){  
        //int[][] b = new int[][]{{0,7,0,0,0,0,0,9,1}, {0,5,0,3,0,0,0,2,0}, {0,0,0,8,0,0,0,4,5},{0,8,5,0,3,0,0,0,0},{0,3,0,0,0,8,0,6,2},{0,1,9,0,6,0,0,0,0},{0,0,0,4,0,0,0,0,0},{0,4,2,0,1,5,0,8,7},{0,0,0,6,0,3,2,5,0}};
        // the 9 x 9  grid   
        /*int[][] b = new int[][] { { 7, 0, 0, 0, 0, 0, 2, 0, 0 },   
                                                { 4, 0, 2, 0, 0, 0, 0, 0, 3 },   
                                                { 0, 0, 0, 2, 0, 1, 0, 0, 0 },   
                                                { 3, 0, 0, 1, 8, 0, 0, 9, 7 },   
                                                { 0, 0, 9, 0, 7, 0, 6, 0, 0 },   
                                                { 6, 5, 0, 0, 3, 2, 0, 0, 1 },   
                                                { 0, 0, 0, 4, 0, 9, 0, 0, 0 },   
                                                { 5, 0, 0, 0, 0, 0, 1, 0, 6 },   
                                                { 0, 0, 6, 0, 0, 0, 0, 0, 8 }   
                                            } ;  */
        // int[][] b = new int[][] { { 3, 8, 7, 0, 1, 0, 0, 9, 2},   
        //                                     { 0, 9, 0, 3, 0, 7, 8, 0, 5 },   
        //                                     { 0, 0, 0, 0, 2, 9, 0, 0, 4 },   
        //                                     { 2, 0, 5, 1, 0, 0, 4, 0, 0 },   
        //                                     { 9, 0, 8, 0, 0, 0, 0, 0, 1 },   
        //                                     { 0, 3, 1, 9, 0, 5, 0, 8, 0 },   
        //                                     { 0, 0, 9, 0, 8, 2, 5, 7, 0 },   
        //                                     { 0, 2, 3, 0, 0, 0, 0, 4, 6 },   
        //                                     { 0, 5, 4, 0, 0, 0, 1, 0, 0 }   
        //                                 } ;
        int[][] b = new int[][] {   
                                        { 7, 15, 16, 2, 0, 0, 0, 14, 0, 6, 0, 9, 0, 0, 0, 0 },   
                                        { 9, 0, 11, 0, 0, 4, 0, 0, 0, 3, 0, 10, 0, 0, 6, 14 },   
                                        { 8, 10, 3, 6, 9, 0, 11, 0, 4, 0, 0, 13, 0, 15, 0, 0 },   
                                        { 4, 1, 14, 13, 6, 0, 0, 0, 0, 7, 0, 8, 0, 3, 0, 0 },   
                                        { 0, 8, 1, 0, 7, 6, 0, 0, 0, 0, 4, 0, 0, 5, 9, 11 },   
                                        { 13, 0, 2, 0, 4, 8, 0, 0, 14, 0, 0, 11, 16, 6, 12, 0 },   
                                        { 0, 6, 0, 0, 0, 11, 0, 0, 7, 8, 9, 0, 14, 13, 0, 0 },   
                                        { 10, 0, 0, 11, 0, 2, 0, 0, 6, 12, 5, 16, 3, 0, 0, 0 },
                                        { 15, 0, 0, 4, 0, 7, 0, 6, 8, 11, 0, 12, 0, 1, 0, 0 },
                                        { 1, 0, 6, 0, 0, 0, 8, 11, 0, 0, 10, 15, 0, 12, 4, 13 },
                                        { 2, 0, 12, 9, 0, 1, 0, 4, 16, 13, 7, 6, 15, 0, 0, 0 },
                                        { 11, 3, 8, 10, 0, 13, 15, 0, 9, 0, 0, 4, 6, 7, 2, 0},
                                        { 6, 11, 5, 8, 0, 14, 0, 2, 10, 16, 0, 0, 4, 0, 0, 0},
                                        { 14, 13, 7, 15, 11, 16, 4, 0, 0, 9, 6, 0, 10, 0, 1, 0 },
                                        { 16, 2, 10, 12, 1, 0, 6, 3, 15, 4, 8, 7, 0, 14, 0, 5 },
                                        { 3, 4, 9, 1, 0, 15, 0, 0, 11, 2, 12, 0, 0, 0, 0, 6}
                                    } ;
        // int[][] rayhan = new int[][] {
        //     {0,4,8,2,0,0,0,0,1}, 
        //     {1,0,0,3,8,4,7,2,6}, 
        //     {3,0,0,7,0,1,9,4,8}, 
        //     {0,7,2,6,4,5,1,8,0}, 
        //     {8,0,0,0,0,2,4,0,0}, 
        //     {0,0,0,0,0,0,0,0,7}, 
        //     {0,8,4,0,0,0,3,0,0}, 
        //     {6,0,0,4,1,0,0,0,2}, 
        //     {0,0,3,0,0,0,0,7,4},
        // };
        // creating an object of the class Puzzle  
        Sudoku obj = new Sudoku();  
        // computing the size of the grid  
        int size = b.length;  
        System.out.println("The grid is: ");  
            // for(int i = 0; i < size; i++){  
            //     for(int j = 0; j < size; j++){  
            //         System.out.print(b[i][j] + " ");    
            //     }  
            //     System.out.println();  
            // }  
            obj.display(b, size);
            System.out.println();  
            if (obj.solve(b, size)){  
                // display solution  
                System.out.println("The solution of the grid is: ");  
                obj.display(b, size);  
            }else{  
                System.out.println("There is no solution available.");  
            }  
    }  
}  