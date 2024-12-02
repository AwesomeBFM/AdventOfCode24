package main.java.dev.awesomebfm.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayOnePartOne {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/one.txt");
        Scanner scanner = new Scanner(file);

        List<Integer> firstCol = new ArrayList<>();
        List<Integer> secondCol = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // Convert the line into two ints
            String[] nums = line.split("\\s+");

            firstCol.add(Integer.parseInt(nums[0]));
            secondCol.add(Integer.parseInt(nums[1]));
        }

        firstCol = firstCol.stream().sorted().toList();
        secondCol = secondCol.stream().sorted().toList();

        if (firstCol.size() != secondCol.size()) {
            System.out.println("Something went wrong!");
            return;
        }

        int totalDistance = 0;
        for (int i = 0; i < firstCol.size(); i++) {
            totalDistance = totalDistance +  Math.abs(firstCol.get(i) - secondCol.get(i));
        }

        System.out.println(totalDistance);
    }


}
