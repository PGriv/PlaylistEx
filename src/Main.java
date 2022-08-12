public class Main {
    public static void main(String[] args){
        Playlist pl= new Playlist("Lessons");
        pl.addVideo("java");
        pl.addVideo("python");
        pl.addVideo("javascript");
        pl.print();
        pl.recommendation();
        PlaylistTutorial p= new PlaylistTutorial("Lessons", "programming");
        p.print();
        p.addVideo("html");
        p.print();

    }
}
