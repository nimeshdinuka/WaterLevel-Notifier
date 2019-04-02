
package demo;


public class WaterLevelObservable {
    private WaterLevelObserver[] observers=new WaterLevelObserver[10];
    private int pos;
    private int waterLevel;
    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observers[pos++]=waterLevelObserver;
    }
    public void notifyObservers(){
        for (int i = 0; i < pos; i++) {
            observers[i].update(waterLevel);
        }
    }
    public void setWaterLevel(int waterLevel){
        if(this.waterLevel!=waterLevel){
            this.waterLevel=waterLevel;
            notifyObservers();
        }
    }
}
