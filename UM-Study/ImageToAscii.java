import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageToAscii {
    public static void main(String[] args) throws IOException {
        String imagePath = "C://Users//User//Desktop//164533573-skeleton-warrior-with-sword-and-shield-dead-warrior-with-weapon-sketch-illustration-isolate-art.jpg"; // Replace with the path to your image
        BufferedImage image = ImageIO.read(new File(imagePath));

        int consoleWidth = image.getWidth(); // Use the original image width
        int consoleHeight = image.getHeight(); // Use the original image height
        
        BufferedImage resizedImage = resizeImage(image, consoleWidth, consoleHeight);
        String asciiArt = imageToAscii(resizedImage);
        
        System.out.println(asciiArt);
    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        resizedImage.getGraphics().drawImage(originalImage, 0, 0, width, height, null);
        return resizedImage;
    }

    private static String imageToAscii(BufferedImage image) {
        StringBuilder asciiArt = new StringBuilder();
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int color = image.getRGB(x, y);
                int red = (color >> 16) & 0xFF;
                int green = (color >> 8) & 0xFF;
                int blue = color & 0xFF;
                int gray = (red + green + blue) / 3; // Convert to grayscale
                char asciiChar = asciiChar(gray);
                asciiArt.append(asciiChar);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }

    private static char asciiChar(int grayValue) {
        char[] asciiChars = "@%#*+=-:. ".toCharArray();
        int index = (grayValue * (asciiChars.length - 1)) / 255;
        return asciiChars[index];
    }
}
