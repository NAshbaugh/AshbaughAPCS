import java.util.*; 
import java.util.Scanner;

class Lists {
    // ArrayList<Integer> numlist = new ArrayList<Integer>();

    // numList.add(5);
    // numList.add(0,10);
    // numList.add(1,15);
    // numList.remove(1);
    // numList.add(20);
    // numList.add(1,25);
    // numList.add(0, 30);
    // numList.add(3, 35);
    // numList.remove(2);

    // The expected content is <30,10,30,5,20>

    public static void main(String[] args) {
        Scanner scan;
        int mode = -1;
        while(true) {
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == 1) {
                    addTask();
                }
                else if(mode == 2) {
                    removeTask();
                }
                else if(mode == 3) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            }
        }

        
    }

    public static void printModeStatement() {
        System.out.print(
            "What would you like to do?\n"
            + "\t(1) Add Task\n"
            + "\t(2) Remove Task\n"
            + "\t(3) Quit\n"
        );
    }















}