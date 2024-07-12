package template;

abstract class Game{
    public final void play(){
        initalize();
        startPlay();
        endPlay();
    }
    abstract void initalize();
    abstract void startPlay();
    abstract void endPlay();
}
