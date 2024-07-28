
// Target interface
interface EntertainmentSystem {
    void play(String mediaType, String mediaName);
}

// Adaptee classes
class BluRayPlayer {
    void playBluRay(String title) {
        System.out.println("Playing Blu-ray: " + title);
    }
}

class GamingConsole {
    void playGame(String game) {
        System.out.println("Playing game: " + game);
    }
}

// Adapter class
class EntertainmentAdapter implements EntertainmentSystem {
    private BluRayPlayer bluRayPlayer;
    private GamingConsole gamingConsole;
    private String mediaType;

    public EntertainmentAdapter(String mediaType) {
        this.mediaType = mediaType;
        if (mediaType.equalsIgnoreCase("blu-ray")) {
            bluRayPlayer = new BluRayPlayer();
        } else if (mediaType.equalsIgnoreCase("game")) {
            gamingConsole = new GamingConsole();
        }
    }

    @Override
    public void play(String mediaType, String mediaName) {
        if (this.mediaType.equalsIgnoreCase("blu-ray")) {
            bluRayPlayer.playBluRay(mediaName);
        } else if (this.mediaType.equalsIgnoreCase("game")) {
            gamingConsole.playGame(mediaName);
        }
    }
}

// Main class to demonstrate Adapter Pattern
public class AdapterMethod {
    public static void main(String[] args) {
        // Adapter for Blu-ray
        EntertainmentSystem bluRayAdapter = new EntertainmentAdapter("blu-ray");
        bluRayAdapter.play("blu-ray", "Inception");

        // Adapter for Game
        EntertainmentSystem gameAdapter = new EntertainmentAdapter("game");
        gameAdapter.play("game", "Super Mario Odyssey");
    }
}
