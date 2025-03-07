package week04;


public class week04CodingProject {

	public static void main(String[] args) {
	/*
	 * #1	
	 */
	
	        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

	        int firstElementAges = ages[0];
	        int lastElementAges = ages[ages.length - 1];
	        int differenceAges = lastElementAges - firstElementAges;

	        System.out.println("Difference (ages): " + differenceAges);

	        
	        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 100}; // Added one more element

	        int firstElementAges2 = ages2[0];
	        int lastElementAges2 = ages2[ages2.length - 1];
	        int differenceAges2 = lastElementAges2 - firstElementAges2;

	        System.out.println("Difference (ages2): " + differenceAges2);

	        
	        double sum = 0;
	        for (int age : ages) {
	            sum+= age;
	        }
	        double averageAges = sum / ages.length;
	        System.out.println("Average age (ages): " + averageAges);

	        
	        double sumAges2 = 0;
	        for (int age : ages2) {
	            sumAges2 += age;
	        }
	        double averageAges2 = sumAges2 / ages2.length;
	        System.out.println("Average age (ages2): " + averageAges2);
		

	/*
	 * #2
	 */
		
String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 

        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("Average letters per name: " + averageLetters); 

        String concatenatedNames = "";
        for (int i = 0; i < names.length; i++) {
            concatenatedNames += names[i] + " ";
        }
        System.out.println("Names concatenated: " + concatenatedNames.trim());
        
      /*
       *  #3
       */
		
        int lastElement = ages[ages.length - 1];
        System.out.println("The last element is: " + lastElement);
        
        /*
         *  #4
         */
        
        int firstElement = ages[0];
        System.out.println("The first element is: " + firstElement);
        
        /*
         *  #5
         */
        
        int[] nameLengths = new int[names.length];

        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        System.out.print("Name lengths: ");
        for (int length : nameLengths) {
            System.out.print(length + " ");
        }

        /*
         * #6
         */

        sum = 0;

        for (int length : nameLengths) {
            sum += length;
        }

        System.out.println("The sum of the array elements is: " + sum);
        
        /*
         * #7
         */  

            String newWord = "Hello";
            int num = 3;
            String repeatedWord = repeatWord(newWord, num);
            System.out.println(repeatedWord);
       
        
        /*
         * #8
         */
        
        String firstName = "John";
        String lastName = "Smith";
        System.out.println(firstName + " " + lastName); 
	
        
        /*
         * #9
         */

        int[] arr1 = {50, 60, 10}; // Sum: 120 (true)

        System.out.println("arr1: " + isSumGreaterThan100(arr1));
        
	
        /*
         *  #10
         */
        
        double[] array1 = {1.0, 2.5, 3.0, 4.5};
        double[] array2 = {10.0, 20.0, 30.0};

        System.out.println("Average of array1: " + calculateAverage(array1)); 
        System.out.println("Average of array2: " + calculateAverage(array2)); 
        
	
        
        /*
         *  #11
         */


        double[] arra1 = {1.0, 2.0, 3.0}; // Average: 2.0
        double[] arra2 = {4.0, 5.0, 6.0}; // Average: 5.0
        double[] arra3 = {7.0, 8.0, 9.0}; // Average: 8.0

        System.out.println("array1 > array2: " + isAverageOfFirstGreaterThanSecond(arra1, arra2)); // false
        System.out.println("array3 > array1: " + isAverageOfFirstGreaterThanSecond(arra3, arra1)); // true
        
	
        /*
         * #12
         */
      
        System.out.println(willBuyDrink(true, 12.00)); 
        System.out.println(willBuyDrink(true, 10.00)); 
        
	
        
        /* 
         * #13
         */

	

        int atBats = 287;
        int hits = 92;

        String result = battingAverage(atBats, hits);
        System.out.println(result);

        System.out.println(battingAverage(100, 51));
        System.out.println(battingAverage(100, 49));
        
}
     

	
		private static String repeatWord(String newWord, int num) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < num; i++) {
                result.append(newWord);
            }
            return result.toString();
		}
            
            public static boolean isSumGreaterThan100(int[] nums) {
                if (nums == null || nums.length == 0) {
                    return false; 
                }

                int sum = 0;
                for (int num : nums) {
                    sum += num;
                }

                return sum > 100;
            }
                
             public static double calculateAverage(double[] numbers) {
                    if (numbers == null || numbers.length == 0) {
                        return 0.0; 
                    }

                    double sum = 0.0;
                    for (double number : numbers) {
                        sum += number;
                    }

                    return sum / numbers.length;
             }
             
             public static boolean isAverageOfFirstGreaterThanSecond(double[] array1, double[] array2) {
                 double avg1 = calculateAverage(array1);
                 double avg2 = calculateAverage(array2);
                 return avg1 > avg2;
             }

            
             double calculateAverage1(double[] numbers) {
                 if (numbers == null || numbers.length == 0) {
                     return 0.0;
                 }

                 double sum = 0.0;
                 for (double number : numbers) {
                     sum += number;
                 }

                 return sum / numbers.length;
             }
             
             public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
                 return isHotOutside && moneyInPocket > 10.50;
             }
             
             public static String battingAverage(int atBats, int hits) {
                 if (atBats <= 0) {
                     return "Invalid at bats.";
                 }

                 double average = (double) hits / atBats;

                 if (average > 0.50) {
                     return "The player is hitting above .500";
                 } else {
                     return "The player is hitting less than .500";
                 }
             
            
	}    

}
