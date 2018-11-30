package com.FrameSpark;

import Array.*;
import Controller.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        DynamicArray dynamicArray = new DynamicArray(0);
        int select = 0;
        int temp;
        boolean run = true;

        while (run){
            controller.printMenu();
            controller.print("\n");
            select=scanner.nextInt();

            switch(select){
                case 1:
                    controller.print("Size of array: ");
                    controller.print(String.valueOf(dynamicArray.getSize()));
                    break;
                case 2:
                    controller.print("Adding an element:");

                    temp = scanner.nextInt();
                    dynamicArray.insertElement(temp);

                   controller.print("\nArray: ");
                    dynamicArray.showArray();
                    controller.print("\n");
                    break;
                case 3:
                    controller.print("Deleting an element");
                    controller.print("Index: ");
                    temp = scanner.nextInt();
                    dynamicArray.deleteElementByIndex(temp);

                    controller.print("\nArray: ");
                    dynamicArray.showArray();
                    controller.print("\n");
                    break;
                case 4:
                    controller.print("Changing an element:");

                    controller.print("Index: ");
                    temp = scanner.nextInt();

                    controller.print("New element: ");
                    int element = scanner.nextInt();

                    dynamicArray.changeElementByIndex(element,temp);

                    controller.print("\nArray: ");
                    dynamicArray.showArray();
                    controller.print("\n");
                    break;
                case 5:
                    controller.print("\nArray: ");
                    dynamicArray.showArray();
                    controller.print("\n");
                    break;
                case 6:
                    controller.print("\nEnter the element: ");
                    temp = scanner.nextInt();
                    controller.print("\n");
                    dynamicArray.showElementByIndex(temp);

                    break;
                case 0:
                    run = false;
                    break;
                default:
                    controller.print("There is no such function \n");
            }
        }

    }
}
