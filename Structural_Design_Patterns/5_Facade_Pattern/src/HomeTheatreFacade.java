public class HomeTheatreFacade {

    private Projector projector;
    private SoundSystem soundSystem;
    private DVDPlayer dvdPlayer;
    private Lights lights;

    public HomeTheatreFacade(Projector projector, SoundSystem soundSystem, DVDPlayer dvdPlayer, Lights lights) {
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(20);
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        lights.on();
        projector.off();
        soundSystem.off();
        dvdPlayer.off();
    }
}
