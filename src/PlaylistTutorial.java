import java.lang.reflect.Array;

class PlaylistTutorial extends Playlist{
    String subject;

    public PlaylistTutorial(String title, String subject) {
        super(title);
        this.subject=subject;
    }
    public void print(){
        System.out.println();
        System.out.println("the subject of the playlist is: "+ subject +".");
        System.out.println("Playlist: "+ "'"+title+"'"+" contains the following: ");
        boolean empty = true;
        for (int i=0; i<videos.length; i++){
            if (!(videos[i] ==null)){
                empty=false;
            }
        }
        if (empty){
            System.out.println("no videos to show");
        }

        for (int i=0; i<videos.length; i++){
            if(videos[i]==null){
                break;
            }
            System.out.print(videos[i]+"  ");
        }
    }
}
