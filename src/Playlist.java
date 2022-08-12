import java.util.Random;

public class Playlist {
    String title;
    String[] videos;
    int nVideos;

    public Playlist(String title) {
        this.title= title;
        videos = new String[10];
        nVideos=0;
    }

    public void addVideo(String video) {
        if (nVideos==10){
            System.out.println("cannot insert, its full!");

        }else {
            videos[nVideos]=video;
            nVideos+=1;
        }
    }
    public void print(){
        System.out.println("Playlist: "+ "'"+title +"'"+" contains the following: ");
        for (int i=0; i<videos.length; i++){
            if(videos[i]==null){
               break;
            }
            System.out.print(videos[i]+"  ");
        }
    }
    void recommendation(){
        Random r = new Random();
        System.out.println();
        System.out.println("our random recommendation: "+videos[r.nextInt(nVideos)]);

    }
}
