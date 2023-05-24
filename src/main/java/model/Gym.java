package model;

import java.util.Scanner;

// TODO: 2023-05-24 Complete methods of this class. 
public class Gym {
    private SoccerPlayer[] sc;
    private BasketBallPlayer[] bsk;
    private Scanner scanner = new Scanner(System.in);
    private static int playerLength = 16;

    Gym() {
        sc = new SoccerPlayer[playerLength];
        bsk = new BasketBallPlayer[playerLength];
    }
    
    private void reserve() {
        
    }

    private void search() {

    }

    private void cancel() {

    }

    private void quit() {
        System.out.println("Thank you!");
    }

    public void run() {
        System.out.println("This is a reservation system for gym.");
        System.out.println();
        int state;
        while(true) {
            System.out.print("Reserve: 1, Search: 2, Cancel: 3, Quit: 4 >>");
            state = scanner.nextInt();
            switch (state) {
                case 1 -> reserve();
                case 2 -> search();
                case 3 -> cancel();
                case 4 -> {
                    quit();
                    return;
                }
                default -> System.out.println("This is a wrong command.");
            }
            System.out.println();
        }
    }


}
