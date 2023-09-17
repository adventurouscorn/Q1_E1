import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //this makes user input possible

        //part one of the exercise: the requirement of the teacher
        Singer Zild = new Singer("Zild", 0, 0.0, "Raining in Manila");

        Singer LolaAmour = new Singer("Lola Amour", 0, 0.0, "Kyusi");

        Zild.performForAudience(12);
        Zild.changeFavSong("Kyusi");
        
        Zild.performForAudience(12, LolaAmour);
        LolaAmour.changeFavSong("Raining In Manila");

        System.out.println("That concludes Part 1 of the Exercise. Moving on to part 2");

        //part 2 of the exercise: freestyle code from last exercise
    
        //collects grade percentage data and stores in an array
        System.out.println("What are your grade percentages? Separate by spaces:");
        String[] gradesTemp = scan.nextLine().split(" "); //make an array out of the input by getting an element and choosing the next element after the next space

        //collects subject data and stores in an array
        System.out.println("Subjects for these grades respectively? Separate by spaces:");
        String[] subjectsTemp = scan.nextLine().split(" ");

        //collects weight data and stores in an array
        System.out.println("What are the units for these subjects respectively? Separate by spaces:");
        String[] weightsTemp = scan.nextLine().split(" ");
    
        GradesHandler list = new GradesHandler();

        for (int i=0; i < subjectsTemp.length; i++){
            list.addGrade(new Grades(gradesTemp[i], subjectsTemp[i], weightsTemp[i]));
        }

        list.standardProcedure();;
    }
}