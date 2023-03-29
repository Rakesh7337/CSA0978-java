class MatrixAddition {
public static void main(String[] args) {
int[][] mat1 = {{1, 2}, {5, 3}};
int[][] mat2 = {{2, 3}, {4, 1}};
int row = mat1.length;
int col = mat1[0].length;
int[][] matSum = new int[row][col];
for(int i=0; i<row; i++) {
for(int j=0; j<col; j++) {
matSum[i][j] = mat1[i][j] + mat2[i][j];
}
}
System.out.println("Matrix addition result:");
for(int i=0; i<row; i++) {
for(int j=0; j<col; j++) {
System.out.print(matSum[i][j] + " ");
}
System.out.println();
}
}
}