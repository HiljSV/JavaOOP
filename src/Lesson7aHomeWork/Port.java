package Lesson7aHomeWork;

import java.util.Arrays;

/**
 * JavaOop, Lesson7aHomeWork
 *
 * @author Khilchenko Sergii
 * @version 0.0.0   07.12.2018
 */
public class Port {
   
    private String name;
    private int countDock;
    private Dock [] docks;

    public Port(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountDock() {
        return countDock;
    }

    public Dock[] getDocks() {
        return docks;
    }

    public void addDock (Dock dock){
        if (dock==null){
            throw new IllegalArgumentException("dock is null");
        }

        countDock++;
        dock.setNamePort(name);
        dock.setNumber(countDock);
        if (countDock==1){
            docks = new Dock[countDock];
            docks[0] = dock;
            return ;
        }
        if (countDock>1){
            Dock[] tempDocks = new Dock[countDock];
            for(int i=0;i<docks.length;i++){
                tempDocks[i]=docks[i];
            }
            tempDocks[countDock-1]=dock;
            docks=tempDocks;
            return;
        }
    }
    public  void unloadingShip(Ship ship){
        if (docks == null){
            return;
        }
        while(ship.isFull()){
            for (Dock d:docks) {
                if(!d.isLocked()){
                    d.unloadingShip(ship);
                }
            }
        }
    }

}