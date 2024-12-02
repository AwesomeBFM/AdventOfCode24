package main.java.dev.awesomebfm.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DayOnePartTwo {

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


        int total = 0;
        for (int i = 0; i < firstCol.size(); i++) {
            int finalI = i;
            int count = (int) secondCol.stream()
                    .filter(j -> Objects.equals(firstCol.get(finalI), j))
                    .count();

            System.out.println(count);

            total = total + firstCol.get(i) * count;
        }

        System.out.println(total);
    }
}
