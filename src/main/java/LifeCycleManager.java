import java.io.Serializable;

public class LifeCycleManager implements LifecycleManager, Serializable {
    public void start(){
        Tweet t = null;
        recebeTweets(t);

    }

    public void stop(){

    }

}
