package main;

public class ZooManagment {

        int nbCages = 20;
        String zooName = "my entites.Zoo";
        public ZooManagment() {}
public ZooManagment(String zooName, int nbCages) {
    this.zooName = zooName;
    this.nbCages = nbCages;
}
public String toString(){
    return "main.ZooManagment [nbCages="
            + nbCages + ", zooName=" + zooName + "]";
}


}
