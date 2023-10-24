package main.java.org.example.com.adventure.settings;

import main.java.org.example.com.adventure.GameInputProcessor;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GameController {
    private final Player player = new Player();
    private final World world = new World();
    private final GameInputProcessor inputProcessor = new GameInputProcessor();
    private final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
    private boolean isInProgress = true;

    public void startGame() {
        if(AppSettings.story)
    }
}
