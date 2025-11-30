import java.util.Scanner;


public class MovieRatingSystem {
    public static void main(String[] args) {//main method contains all functions
        Scanner input = new Scanner(System.in);
        System.out.println("Thank you for using FlixRate! What is your name?");
        System.out.print("Name: ");
        String name = input.nextLine(); //takes input as name
        System.out.println(name + ", list 5 movies you've watched recently: ");
        String[] topFive = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        int[] ratings = new int[5];
        while (ratings[0] < 1 || ratings[0] > 10) { //input for first element in array
            System.out.print("On a scale of 1-10, how would you rate " + topFive[0] + "? ");
            ratings[0] = input.nextInt();
        }
        while (ratings[1] < 1 || ratings[1] > 10) {//input for second element in array
            System.out.print("On a scale of 1-10, how would you rate " + topFive[1] + "? ");
            ratings[1] = input.nextInt();
        }
        while (ratings[2] < 1 || ratings[2] > 10) {//input for third element in array
            System.out.print("On a scale of 1-10, how would you rate " + topFive[2] + "? ");
            ratings[2] = input.nextInt();
        }
        while (ratings[3] < 1 || ratings[3] > 10) {//input for fourth element in array
            System.out.print("On a scale of 1-10, how would you rate " + topFive[3] + "? ");
            ratings[3] = input.nextInt();
        }
        while (ratings[4] < 1 || ratings[4] > 10) {//input for fifth element in array
            System.out.print("On a scale of 1-10, how would you rate " + topFive[4] + "? ");
            ratings[4] = input.nextInt();
        }
        System.out.println("Okay! This is how " + name + "'s ratings check out: ");
        int rateAvg = (ratings[0] + ratings[1] + ratings[2] + ratings[3] + ratings[4]) / 5; //calculate average
        System.out.println("Your ratings averaged out to: " + rateAvg + "/10");
        if (rateAvg > 8) {
            System.out.println("You are a cinephile!");
        } else if (rateAvg > 6 && rateAvg < 9) {
            System.out.println("You enjoy movies quite a bit.");
        }else if (rateAvg > 4 && rateAvg < 7) {
            System.out.println("You have mixed feelings about movies.");
        } else {
            System.out.println("You are a tough critic!");
        }
        System.out.println("Here are your individual ratings: ");
        for (int i = 0; i < topFive.length; i++) { //for loop to print out individual ratings with comments
            System.out.println(topFive[i] + ": " + ratings[i] + "/10");
            if (ratings[i] == 10) {
                    System.out.println("Wow! " + topFive[i] + " is a masterpiece!");
                } else if (ratings[i] < 4 ) {
                    System.out.println(topFive[i] + " didn't impress you much.");
                } else {
                    System.out.println("That's a good one!");
           }
        }
        System.out.println();
        System.out.print("As an overall critic, ");
         if (ratings[0] >= 7 && ratings[1] >= 7 && ratings[2] >= 7 && ratings[3] >= 7 && ratings[4] >= 7) {
            System.out.print("you seem to enjoy most movies.");
        } else if (ratings[0] < 3 || ratings[1] < 3 || ratings[2] < 3 || ratings[3] < 3 || ratings[4] < 3) {
            System.out.print("you have strong opinions on movies!");
        } else {
            System.out.print("you have varied tastes in movies!");
        }
        System.out.println();
        System.out.println("Alright, " + name + ", let's talk genres. What is your favorite from this list? (enter any number from 1-5)");
        System.out.println("1. Action\n2. Comedy\n3. Horror\n4. Drama\n5. Sci-Fi");
        int genrePick = input.nextInt();
        switch (genrePick) { //switch-case for genre pick, inputs 1-5

            case 1: 
                System.out.println("You love excitement and thrills!");
                break;
            case 2:
                System.out.println("You enjoy a good laugh.");
                break;
            case 3:
                System.out.println("You have a taste for fear!");
                break;
            case 4:
                System.out.println("You appreciate deep storytelling.");
                break;
            case 5:
                System.out.println("You love futuristic and imaginative worlds!");
                break;
            default:
                System.out.println("That's an interesting choice!");
        }
        System.out.println();//movie reccomendations based on previous input
        System.out.println("Based on your taste, here's my reccommendation for you:");
        if (genrePick == 1) {
            System.out.println("Mad Max: Fury Road");
        } else if (genrePick == 2) {
            System.out.println("What about Bob?");
        } else if (genrePick == 3) {
            System.out.println("Saw");
        } else if (genrePick == 4) {
            System.out.println("Pride and Prejudice (2001)");
        } else if (genrePick == 5) {
            System.out.println("The Matrix");
        } else {
            System.out.println("Take a hike!");
        }
        System.out.println("Well, that's a wrap, " + name + "! Thank you for using FlixRate! Until next time!");
    input.close(); 
    } 
    
}