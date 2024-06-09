// import java.util.*;

// public class sprial {
//     public static void printSpiral(int matrix[]){
//         int startRow=0;
//         int startColumn=0;
//         int endRow=matrix.length-1;
//         int endCol=matrix[0].length-1;  

//         while(startRow<=endRow && startColumn <=endCol){
//             // top
//             for(int j=startColumn; j<=endCol; j++){
//                 System.out.print(;[startRow][j]+" ");

//             }
//             // right
//             for(int i=startRow+1; i<=endRow; i++){
//                 System.out.print(matrix[i][endCol]+" ");
//             }
//             // bottom
//             for(int j=endCol-1; j>=startColumn; j--){
//                 if(startRow==endRow){
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j]+" ");
//             }
//             // left
//             for(int i = endRow-1; i>=startRow+1; i--){
//                 System.out.print(matrix[i][endRow][startColumn]+" ");
//             }
//             startColumn++;
//             startRow++;
//             endCol--;
//             endRow--;
//         }
//       }

//     public static void main(String args[]){
//         int matrix[][]={{1,2,3,4},
//                         {5,6,7,8},
//                         {9,10,11,12},
//                         {13,14,15,16}};

//          printSpiral(null);               
//     }
// }

import java.util.*;

public class Spiral {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endCol) {
            // top
            for (int j = startColumn; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for (int j = endCol - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }   
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startColumn] + " ");
            }
            startColumn++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },   
                           { 5, 6, 7, 8 },
                           { 9, 10, 11, 12 }, 
                           { 13, 14, 15, 16 }};
        
                   printSpiral(matrix);
    }
}

// psudocode

// function printSpiral(matrix)
//     startRow = 0
//     startCol = 0
//     endRow = matrix.rows - 1
//     endCol = matrix.cols - 1

//     while startRow <= endRow && startCol <= endCol do
//         # Print top row
//         for col from startCol to endCol do
//             print matrix[startRow][col]
//         end for

//         # Print right column
//         for row from startRow + 1 to endRow do
//             print matrix[row][endCol]
//         end for

//         # Print bottom row
//         for col from endCol - 1 downto startCol if startRow < endRow do
//             print matrix[endRow][col]
//         end for

//         # Print left column
//         for row from endRow - 1 downto startRow + 1 if startCol < endCol do
//             print matrix[row][startCol]
//         end for

//         # Move to inner sub-matrix
//         startRow = startRow + 1
//         startCol = startCol + 1
//         endRow = endRow - 1          
//         endCol = endCol - 1
//     end while
// end function


// logic
// Sure! Here's the logic of the spiral matrix printing algorithm:

// 1. **Initialization**: 
//    - Initialize four variables: `startRow`, `startCol`, `endRow`, and `endCol` to represent the boundaries of the sub-matrix we're currently processing.
//    - `startRow` and `startCol` initially point to the top-left corner of the matrix, while `endRow` and `endCol` initially point to the bottom-right corner.

// 2. **Iterative Spiral Traversal**:
//    - While the starting row index (`startRow`) is less than or equal to the ending row index (`endRow`), and the starting column index (`startCol`) is less than or equal to the ending column index (`endCol`), continue the traversal.
   
// 3. **Print Top Row**:
//    - Traverse from the current `startCol` to `endCol` and print the elements of the top row (`startRow`).

// 4. **Print Right Column**:
//    - Traverse from the next row after `startRow` to `endRow` and print the elements of the right column (`endCol`).

// 5. **Print Bottom Row**:
//    - Traverse from the rightmost column `endCol - 1` to `startCol` if there's more than one row left (`startRow < endRow`), and print the elements of the bottom row (`endRow`).

// 6. **Print Left Column**:
//    - Traverse from the bottom row `endRow - 1` to the next row after `startRow` if there's more than one column left (`startCol < endCol`), and print the elements of the left column (`startCol`).

// 7. **Update Indices**:
//    - Move to the inner sub-matrix by incrementing `startRow` and `startCol` and decrementing `endRow` and `endCol`.

// 8. **Repeat**:
//    - Repeat steps 3-7 until the entire matrix is traversed.

// This algorithm ensures that the elements are printed in a spiral order, starting from the top-left corner and moving clockwise towards the center of the matrix.