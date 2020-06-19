public class Main {

	public static void main(String[] args) {
		
		//Number of rows
		int rows = 0;
		//Number of columns
		int columns = 0;
		//Array declaration
		int[][] array = new int[rows][columns];
		//Array capacity
		int arrayCapacity = rows * columns;
		//Auxiliary variable
		int horizontal = 0;
		//Auxiliary variable
		int vertical = 0;
		//Auxiliary variable, also equal to the greatest possible number
		int iterator = 999999999;
		//Auxiliary variable
		int horizontalOffset = 0;
		//Auxiliary variable
		int verticalOffset = 0;
		
		//Loop for each individual tile
		for (int i = 0; i < arrayCapacity; i++) {
			
			//Loop for each row
			for (int j = verticalOffset; j < rows; j++) {
				
				//Loop for each item in the selected row
				for (int k = horizontalOffset; k < columns; k++) {
					
					//Finds the smallest number in the current session
					if (iterator > array[j][k]) {
						 iterator = array[j][k];
						 vertical = j;
						 horizontal = k;
					}
				}
			}
			
			horizontalOffset = columns % i;
			verticalOffset = i / columns;
			int temporary = array[verticalOffset][horizontalOffset];
			
			array[verticalOffset][horizontalOffset] = iterator;
			array[vertical][horizontal] = temporary;
		}
	}
}
