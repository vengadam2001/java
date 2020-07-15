 
import java.io.IOException;
import java.util.*;
import java.lang.Math;

public class QuesGen {
    static ArrayList<Integer> visited = new ArrayList<>();

    static void questions(String a, ArrayList<Integer> v) {
        String ques[][] = new String[5][];
        String ans[][] = new String[5][];
        int score = 0;
        int c;
        Scanner scan = new Scanner(System.in);
        while (true) {
            c = (int) ((Math.random() * ((4 - 0) + 1)) + 0);
            if (!(visited.contains(c))) {
                visited.add(c);
                if (visited.size() == 5) {
                    System.out.println("Sorry out of questions");
                    System.exit(0);
                }
                break;

            }
        }

        ques[0] = new String[]{"Which way does Earth spin?",
                "Which of these planets has no moons?",
                "Which planet is called as Red Planet?",
                "Which city is the capital of Egypt?",
                "Which famous latitude crosses through the middle of India?",
                "Find the odd one out:\nArgon\tSilicon\tKrypton\tNeon",
                "Which is the largest state of India?",
                "Which planet is called both the morning and evening star?",
                "What is a very cold part of Russia?",
                "Which bird can swim, but cannot fly?"};
        ans[0] = new String[]{"West to East",
                "Mercury",
                "Mars",
                "Cairo",
                "Tropic of Cancer",
                "Silicon",
                "Rajasthan",
                "Venus",
                "Siberia",
                "Penguin"};
        ques[1] = new String[]{"Which of the following is a metal: gold, resin, glass?",
                " What makes up (approx.) 80% of our brain’s volume?",
                "What is the 7th element in the periodic table?",
                "What is the hottest continent on Earth?",
                "Name the sea that separates Europe and Africa?",
                "When did World War I began?",
                "From which language is the word ketchup derived?",
                "The phrase 'Three strikes and you're out' is associated with which sport?",
                "How many dots are on one six-sided die?",
                "Which chess piece can't move in a straight line?"
        };
        ans[1] = new String[]{"Gold", "Water", "Nitrogen", "Africa", "Mediterranean Sea", "1914", "Chinese", "Baseball", "21", "Knight"};
        ques[2] = new String[]{"Complete this triangular sequence: 1, 3, 6, 10, 15, 21, 28, 36,...",
                "Is the temperature of the moon higher or lower during the day?",
                "Which famous explorer discovered Cuba?",
                "Which was the occupation or job of the following famous people: Leonardo da Vinci, Pablo Picasso, Vincent Van Gogh?",
                "Choose the word which is least like the others word in a group? \nA. Moon\nB. Sun\nC. Universe\nD. Star\nE.Planets ",
                "Which colors must be mixed together to make green?",
                "Which of the following personalities from India is the only winner of a Special Oscar in the history of Indian Cinema so far?",
                "Which bank is the Banker of the Banks?",
                "Where are a large number of species are found within a small unit of area?",
                "Which country is the largest producer of Bauxite?"};
        ans[2] = new String[]{"45", "Higher", "Christopher Columbus", "Painter", "Universe", "Blue and Yellow", "Satyajit Ray", "RBI", "Wet evergreen equatorial forests", "Australia"};
        ques[3] = new String[]{"How many players are there in an ice hockey team?",
                "How many straight edges does a cube have?",
                "A is the father of B. B is the son of A. A is the ____ of B's father.",
                "An ostrich’s eye is bigger than its brain.(True/False) ?",
                " Which of the following was the author of the Arthashastra?",
                "Who built the Jama Masjid?",
                "Which among the following temples of India is known as Black Pagoda?",
                "A is the brother of B.\nB is the sister of T.\nT is the mother of P.\nIf it is provided that R is the grandfather of P, how would T be related to R?\na)Daughter\nb)Granddaughter\nc)Sister\nd)Wife\ne)Daughter or Daughter-in-law",
                "Which tree, once very popular in social forestry, is now taken to be environmental hazard?",
                "Union Budget is always presented first in _____"};
        ans[3] = new String[]{"Six", "12", "Name", "True", "Chanakya", "Shah Jahan", "Sun Temple,Konark", "Daughter-in-law", "Eucalyptus", "Lok Sabha"};
        ques[4]=new String[]{"What is another word for a ‘lexicon’?",
                "If the 2nd half of an English alphabet is written in reverse order, which letter will be the 5th at left from 21st letter from left?",
                "Which country’s women cricket team has clinched the Asia Cup Twenty-20 tournament 2018?",
                "D is the daughter of N. E is the wife of N.\nG is sister of G. C is married to G.\nN has no son. K is the mother of E.\nQ is only daughter of C.\nHow is Q related to D?\na)Daughter\nb)Cousin\nc)Niece\nd)Sister-in-law",
                "Which one of the following glasses is used in bulletproof screens?",
                "Who was the first Man to Climb Mount Everest Without Oxygen?",
                "Which tree, once very popular in social forestry, is now taken to be environmental hazard?",
                "The 2017 Indian Premier League (IPL) first match on 5 April, 2017 was held in ?",
                "In a class, 3/5 of the students are girls and rest are boys. If 2/9 of the girls and 1/4 of the boys are absent. What part of the total number of students are present?",
                "A, B and C together can do a work in 8 days if A and B can do it in 20 and 30 days respectively. In how many days C alone can complete it?"
        };
        ans[4]=new String[]{"Dictionary","B","Bangladesh","Niece","Reinforced glass","Phu Dorji","Eucalyptus","Hyderabad","23/50","24"};
        if (c == 0)
            System.out.println("\t\t\t\t\tDifficulty level: Very Easy");
        else if (c == 1)
            System.out.println("\t\t\t\t\tDifficulty level: Easy");
        else if (c == 2)
            System.out.println("\t\t\t\t\tDifficulty level: Medium");
        else if (c == 3)
            System.out.println("\t\t\t\t\tDifficulty level: Hard");
        else if (c == 4)
            System.out.println("\t\t\t\t\tDifficulty level: Very hard");
        for (int i = 0; i < 10; i++) {
            System.out.println(ques[c][i]);
            String s = scan.nextLine();
            if (s.equalsIgnoreCase(ans[c][i])) {
//                System.out.println("Great Job");
                score += 4;
            } else {
                System.out.println("Wrong answer");
                score -= 1;
                System.out.println("The correctr answer is " + ans[c][i]);
            }

        }
        System.out.println("Your total score is " + score);
        if (score >= 30) {
            System.out.println("Excellent job " + a);
        } else if (score >= 10 && score < 30) {
            System.out.println("Good job " + a);
        } else if (score < 10) {
            System.out.print("Better luck next time " + a);
        }
    }

    static void newuser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String s = scan.next();
        System.out.println("Enter your email:");
        String s1 = scan.next();
        System.out.println("Enter your mobile:");
        String s2 = scan.next();
        questions(s, visited);
    }

    static void existuser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String s1 = scan.next();
        System.out.println("Enter your mobile:");
        String s2 = scan.next();
        if (s1.equals("enigma@sret.edu.in") && s2.equals("123456789"))
            questions("enigma", visited);
        else if(s1.equals("1234")&&s2.equals("1234")){
            questions("user",visited);
        }
        else {
            System.out.println("Wrong Input Try again");
        }
    }

    static void login() {
        Scanner scan = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n1.New User\n2.Existing User\n3.Exit\n Enter your choice:");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    newuser();
                    break;

                case 2:
                    existuser();
                    break;
                default:System.out.println("Wrong choice");

            }
        } while (ch != 3);

    }

    public static void main(String[] args)throws IOException {
        login();

    }
}