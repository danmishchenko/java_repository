package edu.dp.sau.danmishchenko.lab2;

import java.util.Scanner;

public class Main {
    private static final int MAX_SIZE = 20;
    private static final int MIN_RANDOM_VALUE = -100;
    private static final int MAX_RANDOM_VALUE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the matrix width (maximum " + MAX_SIZE + "): ");
        int width = scanner.nextInt();
        System.out.print("Enter the matrix height (maximum " + MAX_SIZE + "): ");
        int height = scanner.nextInt();
        System.out.print("Choose random fill? (yes/no): ");
        String choice = scanner.next();
        int[][] matrix = createMatrix(width, height, choice.equalsIgnoreCase("yes"));
        System.out.println("Matrix:");
        printMatrix(matrix);
        int min = findMin(matrix);
        int max = findMax(matrix);
        double average = calculateAverage(matrix);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Arithmetic mean: " + average);
    }

    private static int[][] createMatrix(int width, int height, boolean random) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[height][width];
        if (random) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = (int) (Math.random() * (MAX_RANDOM_VALUE - MIN_RANDOM_VALUE + 1) + MIN_RANDOM_VALUE);
                }
            }
        } else {
            System.out.println("Enter the matrix elements row by row:");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    private static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }
        return (double)
                sum / count;
    }
}