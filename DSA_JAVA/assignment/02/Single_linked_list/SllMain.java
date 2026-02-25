
// SinglylinkedlistMain

import java.util.Scanner;

public class SllMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sll list = new Sll();
        int choice, value, target, position;

        do {
            System.out.println("\n--- Single Linked List Menu ---");
            System.out.println("1. Create Node (Insert at Beginning)");
            System.out.println("2. Print List");
            System.out.println("3. Append");
            System.out.println("4. Add Value (After Target)");
            System.out.println("5. Delete by Value");
            System.out.println("6. Delete by Node (Position)");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    list.createNode(value);
                    break;

                case 2:
                    list.printList();
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    list.append(value);
                    break;

                case 4:
                    System.out.print("Enter target value: ");
                    target = sc.nextInt();
                    System.out.print("Enter new value: ");
                    value = sc.nextInt();
                    list.addValue(target, value);
                    break;

                case 5:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    list.deleteByValue(value);
                    break;

                case 6:
                    System.out.print("Enter position to delete: ");
                    position = sc.nextInt();
                    list.deleteByNode(position);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 7);

        sc.close();
    }
}