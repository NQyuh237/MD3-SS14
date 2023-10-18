package bt.bt2;

class SortingStudent {
    public static Student[] insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getScore() > key.getScore()) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = key;
        }
        return students;
    }

    public static Student[] selectionSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].getScore() < students[minIndex].getScore()) {
                    minIndex = j;
                }
            }
            Student temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }
        return students;
    }

    public static Student[] bubbleSort(Student[] students) {
        int n = students.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getScore() < students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return students;
    }
}
