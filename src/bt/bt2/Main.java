package bt.bt2;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student(1, "Huy", 85.5),
                new Student(2, "Trang", 92.0),
                new Student(3, "Oanh", 78.0),
                new Student(4, "Fi", 89.5),
                new Student(5, "Ly", 76.5)
        };

        System.out.println("Danh sách gốc:");
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Ten: " + student.getName() + ", Diem: " + student.getScore());
        }

        Student[] sortedByInsertion = SortingStudent.insertionSort(students.clone());
        System.out.println("\nSắp xếp theo Sắp xếp chèn:");
        for (Student student : sortedByInsertion) {
            System.out.println("ID: " + student.getId() + ", Ten: " + student.getName() + ", Diem: " + student.getScore());
        }

        Student[] sortedBySelection = SortingStudent.selectionSort(students.clone());
        System.out.println("\nSắp xếp theo lựa chọn Sắp xếp:");
        for (Student student : sortedBySelection) {
            System.out.println("ID: " + student.getId() + ", Ten: " + student.getName() + ", Diem: " + student.getScore());
        }

        Student[] sortedByBubble = SortingStudent.bubbleSort(students.clone());
        System.out.println("\nSắp xếp theo Sắp xếp bong bóng:");
        for (Student student : sortedByBubble) {
            System.out.println("ID: " + student.getId() + ", Ten: " + student.getName() + ", Diem: " + student.getScore());
        }
    }
}