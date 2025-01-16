package demo.programs.demo;
public class Matrixx
{
	public static void main(String[] args) {
	  
	  int r1 = 2, c1 = 3;
	  int r2 = 3, c2 = 2;
	  
	  int[][] M1 = {{3, -2, 5},
	                {3, 0, 4}};
	                
	  int[][] M2 = {{2,3},
	                {-9,0},
	                {0,4}};
	  
	  int[][] Multiplication = new int[r1][c2];
	  
	  for(int i = 0; i < r1; i++){
	      for(int j = 0; j < c2; j++){
	          for(int k = 0; k < c1; k++){
	              Multiplication[i][j] += M1[i][k] * M2[k][j];
	          }
	      }
	  }
	  
	  System.out.println("The product is: ");
	  for(int[] row : Multiplication){
	      for(int column : row){
	          System.out.print(column + "\t");
	      }
	      System.out.println();
	  }
    }
}