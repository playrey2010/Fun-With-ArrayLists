import java.util.ArrayList;
import java.util.Scanner;

public class ColorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String addedColor = "";
        //step 1
        ArrayList<String> colors = new ArrayList<String>();
        //step 2
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        System.out.println(colors);
        //step 3
        System.out.println("This is the value at index 1: " + colors.get(1));
        //step 4
        System.out.print("Please enter a new color: ");
        addedColor = sc.nextLine();
        colors.add(addedColor);

        // step 5
        while (!addedColor.equalsIgnoreCase("q")) {
            System.out.print("Please enter a new color: ");
            addedColor = sc.nextLine();
            colors.add(addedColor);
            if (addedColor.equalsIgnoreCase("q")){
                colors.remove("q");
            }
        }

        System.out.println(colors);
    }
}
