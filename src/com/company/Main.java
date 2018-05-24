package com.company;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) throws IOException {

                // Parse HTML-document in folder "Sudoku Solver\sudoku storage\to-solve" for numbers and save numbers in array
        FileReader fr = new FileReader("C:\\Users\\Michael\\Desktop\\Michael\\Programmieren\\_Projekte\\Sudoku Solver\\sudoku storage\\to-solve\\sudoku.html");
                            // Optional Change: It should be able to screen whatever file is in there. Not only if the file is called "sudoku.html"
        BufferedReader htmlDoc = new BufferedReader(fr);




               // Define Regex which identifies the position of "block01"
               // If "block01" search for "block02" etc until "block81" is found, then end

        String[] blocks = new String[80]; // The max of this String is only 80, because it is starting at 0 (for 81 lines with blocks)
        String activeLine;

        for(int i=0; i<80;) // The max of i is only 80, because it is starting at 0 (for 81 lines with blocks)
        {

            activeLine = htmlDoc.readLine();
            System.out.println(activeLine);

            if (Pattern.matches("/block01/p", activeLine)) {  // doesn't work wight now. Something wrong with Pattern-library-use
                System.out.println("HITTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT!");
                blocks[i] = activeLine.toString();
                i++;
            }

        }
        htmlDoc.close();


//        import java.util.regex.matcher;
//import java.util.regex.pattern;
//
//        final string regex = "block";
//        final string string = "          <td id=\"block54\">5</td>";
//
//        final pattern pattern = pattern.compile(regex, pattern.multiline);
//        final matcher matcher = pattern.matcher(string);
//
//        if (matcher.find()) {
//            system.out.println("full match: " + matcher.group(0));
//            for (int i = 1; i <= matcher.groupcount(); i++) {
//                system.out.println("group " + i + ": " + matcher.group(i));
//            }
//        }





        // Copy HTML-file, put copy in "Sudoku Solver\sudoku storage\solved" and work on the copy

        // Analyse and search for missing numbers
            // Check if there are any numbers missing. If no -> finish!

            // Screen for horizontal rows with 8 filled fields. If yes -> Fill it up -> start again
            // Screen for vertical rows with 8 filled fields. If yes -> Fill it up -> start again

            // Screen for 9-pairs with 8 filled fields. If yes -> Fill it up -> start again

        // Create new CSS (copy orinigal CSS-file), add ich to the new HTML and mark solved numbers in red



        // Change "Gl Hf" To "Done"


    }
}
