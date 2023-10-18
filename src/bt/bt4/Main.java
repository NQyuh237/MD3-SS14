package bt.bt4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<>();
        teams.add(new FootballTeam(1, "MU", 11, 30));
        teams.add(new FootballTeam(2, "MC", 10, 25));
        teams.add(new FootballTeam(3, "VN", 15, 35));
        teams.add(new FootballTeam(4, "PSG", 14, 28));

        System.out.println("Danh sách gốc:");
        for (FootballTeam team : teams) {
            System.out.println(team.getName() + " - " + team.getScore() + " Diem");
        }

        Sorting.bubbleSort(teams); // Bubble Sort
        //Sorting.selectionSort(teams); // Selection Sort
        //Sorting.insertionSort(teams); // Insertion Sort

        System.out.println("\nDanh sách được sắp xếp:");
        for (FootballTeam team : teams) {
            System.out.println(team.getName() + " - " + team.getScore() + " Diem");
        }
    }
}