package World;

public class Ocean {// public any package any class
    public int numberOfWhales = 5; //with no access modifier it can be access only by its own package by any class

    private int numberOfSeaDragons = 3; // only accessible within the declared class

    protected int numberOfSharks = 10; // can be access by any class in current package or by subclasses of your class  in other packages


}
