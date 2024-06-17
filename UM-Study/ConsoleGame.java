import java.util.Scanner;

public class ConsoleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] gameMap = {
            { '#', '#', '#', '#', '#', '#' },
            { '#', ' ', ' ', ' ', ' ', '#' },
            { '#', ' ', 'P', ' ', ' ', '#' },
            { '#', ' ', ' ', ' ', ' ', '#' },
            { '#', '#', '#', '#', '#', '#' }
        };
        int playerX = 2;
        int playerY = 2;

        boolean gameRunning = true;

        while (gameRunning) {
            // Clear the console screen (optional)
            clearScrseen();

            // Render the map
            for (int i = 0; i < gameMap.length; i++) {
                for (int j = 0; j < gameMap[i].length; j++) {
                    System.out.print(gameMap[i][j]);
                }
                System.out.println();
            }

            // Get user input
            System.out.print("Enter your move (W/A/S/D/Q): ");
            char input = scanner.nextLine().toUpperCase().charAt(0);

            // Update player position
            int newPlayerX = playerX;
            int newPlayerY = playerY;

            switch (input) {
                case 'W':
                    newPlayerX--;
                    break;
                case 'A':
                    newPlayerY--;
                    break;
                case 'S':
                    newPlayerX++;
                    break;
                case 'D':
                    newPlayerY++;
                    break;
                case 'Q':
                    gameRunning = false;
                    break;
                default:
                    System.out.println("Invalid input.");
            }

            // Check for collisions and boundaries
            if (gameMap[newPlayerX][newPlayerY] != '#') {
                gameMap[playerX][playerY] = ' ';
                playerX = newPlayerX;
                playerY = newPlayerY;
                gameMap[playerX][playerY] = 'P';
            }
        }

        scanner.close();
    }

    // Method to clear the console screen (for Windows)
    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
