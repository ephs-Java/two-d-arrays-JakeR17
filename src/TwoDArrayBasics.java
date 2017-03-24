import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int[][] nums = new int[3][5];
		// Fill the array with random numbers using fillRandom
		fillRandom(nums, 1, 100);
		// test each method you create below.
		printArray(nums);
		int[] thesums = sumRows(nums);
	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	public static void fillRandom(int[][] nums, int low, int high){
		Random random = new Random();
		for(int r = 0; r<nums.length; r++){
			for(int c = 0; c < nums[0].length; c++){
				nums[r][c] = random.nextInt(high) + low; 
			}
		}
	}
	
	
	
	/*
	 * create a method that prints a 2D array
	 */
	public static void printArray(int [][] nums){
		for(int r = 0; r<nums.length; r++){
			System.out.print("{"); 
			for(int c = 0; c < nums[0].length; c++){
				System.out.print(nums[r][c]+", "); 
			}
			System.out.println("}"); 
		}
	}
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	public static int sumRow(int [][] nums,int row){
		int sum = 0;
			for(int c = 0; c < nums[0].length; c++){
				sum += nums[row][c]; 
			}
		return sum;
	}

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	public static int[] sumRows(int[][] nums){
		int sum = 0;
		int[] sumofrows = new int[nums.length];
		for(int r = 0; r<nums.length; r++){
			for(int c = 0; c < nums[0].length; c++){
				sum += nums[r][c]; 
			}
			sumofrows[r] = sum;
			sum = 0;
		}
		return sumofrows;
		
	}

	
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	public static boolean checkRepeats(int[] num){
		for(int i = 0; i<num.length;i++){
			for(int j = 0; j<num.length;j++){
				if(num[i] == num[j]){
					return true;
				}
			}
		}
		return false;
	}

	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	public static int findNum(int[] num, int target){
		for(int i = 0; i<num.length;i++){
				if(target == num[i]){
					return i;
			}
		}
		return -1;
	}

	
	
	/*
	 * return the min value in a 2D array
	 */
	public static int findmin(int[][] nums){
		int min = nums[0][0];
		for(int r = 1; r<nums.length; r++){
			for(int c = 1; c < nums[0].length; c++){
				min = Math.min(nums[r][c],min); 
			}
		}
		return min;
	}

	
	
	
	/*
	 * return the max value in a 2D array
	 */
	public static int findMax(int[][] nums){
		int max = nums[0][0];
		for(int r = 1; r<nums.length; r++){
			for(int c = 1; c < nums[0].length; c++){
				max = Math.max(nums[r][c],max); 
			}
		}
		return max;
	}

	
	
	
}
