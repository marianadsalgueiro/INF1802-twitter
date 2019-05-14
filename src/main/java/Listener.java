public class Listener implements listener {

    public void recebeTweets(Tweet t) {
        System.out.println("User: "+t.user);
        System.out.println("Conteudo: "+t.conteudo);
        System.out.println("Data: "+t.data);
    }
}
