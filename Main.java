import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        1.Write a program to find all of the longest word in a given dictionary.
//        Example:
//        { "cat", "dog", "red", "is", "am" }
//        Expected Output:
//        "cat", "dog", "red"
        System.out.println("**********************************");

        ArrayList<String> strings =new ArrayList<>(Arrays.asList( "cat", "dog", "red", "is", "am"));
        int largest_count = -1 ;
        for (String i : strings){
            if (largest_count<i.length()){
                largest_count = i.length();
            }
        }
        for (String i :strings){
            if (i.length() == largest_count){
                System.out.print(i + " ");
            }
        }

        System.out.println();
//        2. Write a program that displays the number of occurrences of an element in the array.
//                Original Array:
//        [1,1,1,3,3,5]
//        Sample Output:
//        3 occurs 2 times
//        1 occurs 3 times
//        9 occurs 0 time
        ArrayList<Integer> numbers =new ArrayList<>(Arrays.asList(1,1,1,3,3,5));

        Scanner input = new Scanner(System.in);
//        ArrayList <Integer> unieq = new ArrayList<>();
//        for (int i = 0; i < numbers.size(); i++) {
//            if (!unieq.contains(numbers.get(i))){
//                unieq.add(numbers.get(i));
//            }
        System.out.println("**********************************");

        System.out.print("Enter how many numbers you want to enter to find the occurrence in the array : ");
        int how_many = input.nextInt();
        ArrayList<Integer> user_numbers =new ArrayList<>();

        for (int i = 0; i <how_many ; i++) {
            System.out.print("Enter the number : ");
            int user_number = input.nextInt();
            user_numbers.add(user_number);
        }

        for(int i : user_numbers){
            int counter = 0;
            for(int j : numbers){
                if (i == j){
                    counter++;
                }
            }
            System.out.println(i+" occurs "+ counter+ " time");
        }

//        3.Write a program to find the k largest elements in a given array.
//        Elements in the array can be in
//        any order.
//        Original Array:
//        [1, 4, 17, 7, 25, 3, 100]
//        Expected Output:
//        3 largest elements of the said array are:
//        100 25 17




        Scanner input3 = new Scanner(System.in);
        System.out.println("**********************************");

        System.out.print("Enter a number (k) to find the largest numbers in array :  ");
        int largest = input3.nextInt();
        ArrayList<Integer> numbers_largest =new ArrayList<>(Arrays.asList(1, 4, 17, 7, 25, 3, 100));
        ArrayList<Integer> new_numbers_largest =new ArrayList<>();

        for (int i = 0; i <largest ; i++) {
            int counter =Integer.MIN_VALUE ;
            for (int j : numbers_largest) {
                    if (counter < j) {
                        counter = j;
                    }
            }
                numbers_largest.remove(Integer.valueOf(counter));
                new_numbers_largest.add((counter));

    }
        System.out.println(new_numbers_largest);


//    4. Create a method to reverse an array of integers. Implement the method without creating a new
//    array.
//    Original Array:
//            [5,4,3,2,1]
//            Expected Output:
//            Reversed Array:
//            1 2 3 4 5
//

        System.out.println("**********************************");

        ArrayList<Integer> reversed =new ArrayList<>(Arrays.asList(5,4,3,2,1));

        for(int i = 0; i < reversed.size() / 2; i++) {
            int temp = reversed.get(i);
            reversed.set(i,reversed.get(reversed.size() - i - 1));
            reversed.set(reversed.size() - i - 1,temp) ;
        }
        System.out.println("The array reversed is : ");
        System.out.println(reversed);

//        5. Write a menu driven Java program with following option:
//        1. Accept elements of an array
//        2. Display elements of an array
//        3. Search the element within array
//        4. Sort the array
//        5. To Stop
//        the size of the array should be entered by the user


        Scanner input5 = new Scanner(System.in);
        int user_input = 0 ;
        boolean exit = true ;
        ArrayList user_list = new ArrayList();

        do{
            System.out.println("**********************************");
            System.out.println("1. Accept elements of an array\n" +
                    "2. Display elements of an array\n" +
                    "3. Search the element within array\n" +
                    "4. Sort the array\n" +
                    "5. To Stop");
            System.out.print("Enter the command you want : ");
            user_input = input5.nextInt();
            switch (user_input ){
                case 1 : {
                    System.out.println("**********************************");
                    System.out.print("Enter the size of the array you want : ");
                    int user_size_list= input5.nextInt();
                    for (int i = 0; i < user_size_list ; i++) {
                        System.out.print("Enter the element number "+(i+1)+": ");
                        int user_element = input.nextInt();
                        user_list.add(user_element);
                    }
                    break;



                }case 2:{
                    System.out.println("**********************************");
                    System.out.println("The Elements are : ");
                    System.out.println(user_list);
                    break;

                }
                case 3: {
                    System.out.println("**********************************");
                    System.out.print("Enter an element to search for it : ");
                    int search_element = input5.nextInt();
                    if (user_list.contains(search_element)){
                        System.out.println("Element found ");
                    }else{
                        System.out.println("Element not found ");
                    }
                    break;

                }case 4:{
                    System.out.println("**********************************");
                    Collections.sort(user_list);
                    System.out.println(user_list);
                    break;
                } case 5 : {
                    System.out.println("**********************************");
                    System.out.println("successfully exit ");
                    exit = false;
                }

            }


        }while (exit);




//        6. Create a method that generates a random number within a given range. Allow the user to
//        specify the range and call the method to display random numbers.
//                Hint: use Random class
//        Sample Output:
//        Enter the minimum value of the range: 10
//        Enter the maximum value of the range: 100
//        Enter the number of random numbers to generate: 5
//        Random numbers within the specified range:
//        71 - 98 - 96 - 71 - 71


           Scanner input6 = new Scanner(System.in);
        System.out.println("**********************************");

        System.out.print("Enter the minimum value of the range: ");
        int min = input.nextInt();
        System.out.print("Enter the maximum value of the range: ");
        int max = input.nextInt();
        System.out.print("Enter the number of random numbers to generate: ");
        int generate = input.nextInt();
        random_numbers(max,min,generate);




//        7. Write a program that checks the strength of a password. Create a method that evaluates a
//        password based on criteria like length, inclusion of special characters, and uppercase/lowercase
//        letters.
//                - We have three methods: checkLength, checkSpecialCharacters, and
//        checkUpperCaseLowerCase, each of which assigns a score based on specific criteria.
//                - The totalScore is calculated by adding the scores from these methods.
//        - Classify the password as strong (8 or more), moderately strong (5 or more), or weak
//        based on the totalScore.
//        - The criteria for scoring:
//• Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
//                (3 points).
//• Special characters: Absence (0 points), Presence (2 points).
//• Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
//        points).
//        Example:
//        Enter a password: 3456
//        Expected Output:
//        Password is weak.
//

        Scanner input7= new Scanner(System.in);
        System.out.println();
        System.out.println("**********************************");

        System.out.print("Enter a password: ");
        String password = input7.nextLine();
        int check_upper_lower = checkUpperCaseLowerCase(password);
        int check_length = checkLength(password);
        int check_special = checkSpecialCharacters(password);
        int sum_of_results = check_special+check_length+check_upper_lower ;

        if (sum_of_results < 5){
            System.out.println("Week password ");
        } else if (sum_of_results >=5 && sum_of_results <8) {
            System.out.println("moderately strong");
        }else{
            System.out.println("Strong password ");
        }

//        8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
//                Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
//                and each subsequent number in the sequence is the sum of the two preceding ones.

        Scanner input8= new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms to generate (Start with number 3 at least) : " );
        int user_fib = input8.nextInt();
        fibonacci(user_fib);





    }

    public static void random_numbers (int max , int min,int generate){
        System.out.println("Random numbers within the specified range: ");
        Random rand = new Random();

        for (int i = 0; i < generate; i++) {
            System.out.print(rand.nextInt((max - min) + 1) + min);
            System.out.print(" ");

        }

    }
    public static int checkLength(String pass) {
        if (pass.length() <= 5) {

            return 0;

        } else if (pass.length() == 6 || pass.length() == 7) {
            return 2;
        } else {
                return 3;
        }
    }
    public static int checkSpecialCharacters(String pass){

        if (pass.matches(".*[^a-zA-Z0-9].*")) {
            return 2;
        } else {
            return 0;
        }


    } public static int checkUpperCaseLowerCase(String pass){

        if(pass.matches(".*[A-Z].*") &&pass.matches(".*[a-z].*") ){
            return 3 ;
        }else {
            return 0;
        }

    }

    public static void fibonacci(int num){
        System.out.println("Fibonacci sequence with 10 terms: "+num);
        int start0 =0;
        int start1=1 ;
        int sum = 0 ;

        System.out.print (start0 +" "+start1+" ");
        for (int i = 0; i <num-2 ; i++) {


             sum = start0 + start1 ;

            System.out.print(sum+" ");
            start0=start1;
            start1=sum;


        }

    }






}