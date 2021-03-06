package christmas;

/**
 *
 * @author Someone
 */
import java.io.*;
import java.util.*;
import java.nio.file.*;
import javazoom.jl.player.Player;

public final class ChristmasTree {

    public static void main(String[] args) throws IOException {
        playMusic();printTree();
        System.exit(0);
    }

    public static void playMusic() {
        Runnable songThread = () -> {
            try {
                BufferedInputStream buffer = new BufferedInputStream(
                        new FileInputStream("ressources\\cSong.mp3")
                );
                Player player = new Player(buffer);
                player.play();
            } catch (Exception e) {
                System.out.println(e);
            }
        };
        Thread t = new Thread(songThread);
        t.start();
    }

    public static void printTree() throws IOException {
        Path filePath = Paths.get(System.getProperty("user.dir"), "ressources\\cTree.txt");
        List<String> allLines = Files.readAllLines(filePath);
        allLines.remove(0);

        for (String line : allLines) {
            System.out.println(line);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
            }
            /* */
        }

        /* */

    }
}
