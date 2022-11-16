/*
    Class: SWE 501
    Assignment: Assignment 1 Migros Delivery
    Student: Mustafa Tuna
    Description: This is an algorithm to find the shortest path to deliver an item to multiple addresses
    from a certain starting point, and to return there at the end.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;


import static java.lang.String.*;


public class RouteFinder {
    public static void main(String[] args) throws FileNotFoundException{
        // Filename
        String fileName = "files/input02.txt";

        // File object is required to open the file
        File file = new File(fileName);

        if(!file.exists()) {
            System.out.printf("%s can not be found!", fileName);
            System.exit(1);
        }

        // Initialize the Scanner
        Scanner inputFile = new Scanner(file);

        // Count the lines
        int lineCounter = 0;
        while (inputFile.hasNextLine()) {
            lineCounter++;
            inputFile.nextLine();
        }
        System.out.println(lineCounter);
        inputFile.close();

        // Create an empty array to store the coordinates
        double[][] allCoordinates = new double[lineCounter][2];

        // Reopen the file to read the data...
        inputFile = new Scanner(file);

        ArrayList <Double> xList = new ArrayList<>();
        ArrayList <Double> yList = new ArrayList<>();

        // Initialize the counter to store the coordinates accordingly
        int counter = 0;
        int startPoint = 0;

        String line = "";
        String migros = "Migros";
        while(inputFile.hasNextLine()) {
            line = inputFile.nextLine();
            String[] splittedLine = line.split(",");

            // Check whether are we at the starting point
            if(splittedLine.length > 2 && splittedLine[2].trim().equals(migros)) {
                startPoint = counter;
                System.out.println("Migros found at: " + counter);
            }

            double[] coordinates = new double[2];
            coordinates = parseLine(splittedLine);
            allCoordinates[counter] = coordinates;
            xList.add(coordinates[0]);
            yList.add(coordinates[1]);

            counter++;
        }

        //printResult(yList);
        //System.out.println(calculateRoute(xList, yList, startPoint));
        double[][] initialRoute = new double[allCoordinates.length+1][2];
        createInitialRoute(allCoordinates, initialRoute, startPoint);
        double[][] newCoor = {{0.1363, 0.9225},{0.9125, 0.9213},{0.8025, 0.17},{0.8525, 0.22},{0.8725, 0.15},{0.0813, 0.1075},{0.8725, 0.15},{0.0813, 0.1075},{0.8725, 0.15},{0.0813, 0.1075}};
        //createPerm(10, initialRoute);
        System.out.println("finish");
        /*double[] p1 = {0.8913,0.1850};
        double[] p2 = {0.3438,0.1875};
        System.out.println(calculateDistance(p1, p2));*/

        /*double[] xCoor = new double[counter];
        double[] yCoor = new double[counter];
        int startingPoint = 0;

        for(int i = 0; i < counter; i++) {
            String line = inputFile.nextLine();
            xCoor[i] = inputFile.nextDouble();
            yCoor[i] = inputFile.nextDouble();
            String city = inputFile.next();
            //System.out.println(city);//inputFile.next() === 'Migros' ? startingPoint = i : continue;
            System.out.println(line);
            counter++;
        }*/
        inputFile.close();
    }

    /*
        The method for parsing a String[] line and returns the coordinates as double[]
     */
    public static double[] parseLine(String[] line) {
        //String[] splittedLine = new String[2];
        //String newLine = String.valueOf(line);
        double xCoordinate = Double.parseDouble(line[0]);
        double yCoordinate = Double.parseDouble(line[1]);
        double[] coordinates = {xCoordinate, yCoordinate};
        return coordinates;
    }

    /*
        Calculate the fastest route
     */
    public static double calculateRoute(ArrayList<Double> xList, ArrayList<Double> yList, int startPoint) {
        boolean[] isVisited = new boolean[xList.size()];
        isVisited[startPoint] = true;
        double totalDistance = 0;

        for(int i = 0; i < xList.size()-1; i++) {
            if(isVisited[i] != true) {
                double[] pointOne = {xList.get(i), yList.get(i)};
                isVisited[i] = true;
                for (int j = 0; j < xList.size();j++) {
                    if (j != i && isVisited[j] != true) {
                        double[] pointTwo = {xList.get(j), yList.get(j)};
                        totalDistance += calculateDistance(pointOne, pointTwo);
                        //isVisited[j] = true;
                        System.out.println(j);
                    }
                }
            }
        }
        //todo
        return totalDistance;
    }

    /*
        Calculate the distance between two point
     */
    public static double calculateDistance(double[] pointOne, double[] pointTwo) {
        double distance = Math.sqrt(Math.pow((pointTwo[0] - pointOne[0]), 2) + Math.pow((pointTwo[1] - pointOne[1]), 2));
        return distance;
    }

    public static void printResult(ArrayList<Double> myList) {
        System.out.println("\n");
        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
    public static void createPerm(int index, double[][] elements) {

        if(index == elements.length-1) {
            printCoordinates(elements);

            return;
        } else {
            for (int i = index; i < elements.length; i++){
                swap(elements, i, index);
                createPerm(index+1, elements);
                swap(elements, i, index);

            }
        }
    }

    private static void swap(double[][] input, int a, int b) {
        double tmp[] = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    private static void printArray(int[] input) {
        System.out.print('\n');
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
    }

    private static void printCoordinates(double[][] coordinates) {
        System.out.print("\n");
        for(int i = 0; i < coordinates.length; i++) {
            System.out.print(Arrays.toString(coordinates[i]));
        }
    }

    private static void createInitialRoute(double[][] coordinates, double[][] initialRoute, int startPoint) {
        System.arraycopy(coordinates, 0, initialRoute, 0, coordinates.length);
        double[] temp = initialRoute[startPoint];
        initialRoute[startPoint] = initialRoute[0];
        initialRoute[0] = temp;
        initialRoute[initialRoute.length-1] = temp;
        printCoordinates(initialRoute);
        /*initialRoute[0] = startPoint;
        initialRoute[initialRoute.length-1] = startPoint;
        for(int i =1; i < initialRoute.length-1; i++) {
            //initialRoute[i] =
        }*/
    }

    /*private static double[][] create(double[][] coordinates, int startPoint) {
        double[] temp = coordinates[startPoint];
        coordinates[startPoint] = coordinates[0];
        coordinates[0] = temp;
    } */
}