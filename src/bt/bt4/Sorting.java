package bt.bt4;

import java.util.Collections;
import java.util.List;
class Sorting {
    public static void bubbleSort(List<FootballTeam> teams) {
        int n = teams.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (teams.get(j).getScore() < teams.get(j + 1).getScore()) {
                    Collections.swap(teams, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void selectionSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (teams.get(j).getScore() > teams.get(maxIndex).getScore()) {
                    maxIndex = j;
                }
            }
            Collections.swap(teams, i, maxIndex);
        }
    }

    public static void insertionSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 1; i < n; i++) {
            FootballTeam key = teams.get(i);
            int j = i - 1;
            while (j >= 0 && teams.get(j).getScore() < key.getScore()) {
                teams.set(j + 1, teams.get(j));
                j = j - 1;
            }
            teams.set(j + 1, key);
        }
    }
}