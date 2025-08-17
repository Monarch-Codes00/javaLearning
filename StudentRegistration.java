package abc.com;
import java.util.Scanner;





public class StudentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students to register: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        Test[] students = new Test[numberOfStudents];


        for (int i = 0; i < numberOfStudents; i++) {

              System.out.println("\nEnter Student Details " + (i + 1) + ":");

            System.out.print("ID: ");
            long id = scanner.nextLong();
            scanner.nextLine();

                 System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Stack: ");
            String stack = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();


            scanner.nextLine();

            System.out.print("Gender (MALE/FEMALE): ");
            String genderInput = scanner.nextLine().toUpperCase();

            Gend gender = Gend.valueOf(genderInput);

            students[i] = new Test(id, name, stack, age, gender);
        }


        int choice;
        do {
                     System.out.println("\n********* Student Management Menu *********");

            System.out.println("1. List all students");


            System.out.println("2. Get student by ID");

            System.out.println("3. Get students by gender");

                 System.out.println("4. Update student");

            System.out.println("5. Exit");

             System.out.print("Enter your choice: ");


            choice = scanner.nextInt();
            scanner.nextLine();

                switch (choice) {
                case 1:

                    System.out.println("\nRegistered Students:");
                    for (Test student : students) {
                        student.display();
                    }
                    break;

                case 2:
                        System.out.print("Enter student ID: ");
                    long searchId = scanner.nextLong();

                    scanner.nextLine();
                        boolean found = false;

                    for (Test student : students) {
                        if (student.id == searchId) {
                            student.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                        System.out.print("Enter gender (MALE/FEMALE): ");
                    String genderInput = scanner.nextLine().toUpperCase();

                    Gend searchGender = Gend.valueOf(genderInput);

                        boolean any = false;
                    for (Test student : students) {

                        if (student.gender == searchGender) {
                            student.display();

                            any = true;
                        }
                    }
                    if (!any) {
                        System.out.println("No students found with gender " + searchGender);
                    }
                    break;

                case 4:
                        System.out.print("Enter ID of student to update: ");
                    long updateId = scanner.nextLong();
                             scanner.nextLine();

                    boolean updated = false;

                    for (Test student : students) {
                        if (student.id == updateId) {

                            System.out.print("New Name (leave blank to keep same): ");
                            String newName = scanner.nextLine();

                                if (!newName.isEmpty()) student.name = newName;

                            System.out.print("New Stack (leave blank to keep same): ");

                               String newStack = scanner.nextLine();

                                     if (!newStack.isEmpty()) student.stack = newStack;

                            System.out.print("New Age (enter 0 to keep same): ");

                            int newAge = scanner.nextInt();

                            scanner.nextLine();
                                if (newAge > 0) student.age = newAge;

                            System.out.print("New Gender (MALE/FEMALE, leave blank to keep same): ");

                             String newGenderInput = scanner.nextLine().toUpperCase();
                                if (!newGenderInput.isEmpty()) {
                                student.gender = Gend.valueOf(newGenderInput);
                            }

                                System.out.println("Student updated successfully!");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5:
                            System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 5);

        scanner.close();
    }
}
