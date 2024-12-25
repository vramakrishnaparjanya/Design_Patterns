public class Testing_Facade {

    public static void main(String[] args) {

        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Lights lights = new Lights();

        // Create the facade
        HomeTheatreFacade homeTheater = new HomeTheatreFacade(projector, soundSystem, dvdPlayer, lights);

        // Use the facade to simplify operations
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }

}
