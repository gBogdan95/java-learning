//Program to create the fleet of a country using INHERITANCE.

class Planes {
    public String planeID;
    public int totalEnginePower;

    public Planes(String planeID, int totalEnginePower){
        this.planeID = planeID;
        this.totalEnginePower = totalEnginePower;
    }

    public String getPlaneID(){
        return this.planeID;
    }

    public int getTotalEnginePower(){
        return this.totalEnginePower;
    }

    public void takeOff(){
        System.out.println(this.planeID + " - Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking o↵ - Retracting gear - Takeoff complete");
    }

    public void fly(){
        System.out.println(this.planeID + " - Flying");
    }

    public void land(){
        System.out.println(this.planeID + " - Initiating landing procedure - Enabling air brakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
    }
}

class TravellingPlanes extends Planes{
    private int maxPassengers;

    public TravellingPlanes(String planeID, int totalEnginePower, int maxPassengers) {
        super(planeID, totalEnginePower);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers(){
        return this.maxPassengers;
    }
}

class BattlePlanes extends Planes{
    public BattlePlanes(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }

    public void launchMissile(){
        System.out.println(this.planeID + " - Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
    }
}

class Boeing extends TravellingPlanes{

    public Boeing(String planeID, int totalEnginePower, int maxPassengers) {
        super(planeID, totalEnginePower, maxPassengers);
    }
}

class Concorde extends TravellingPlanes{
    public Concorde(String planeID, int totalEnginePower, int maxPassengers) {
        super(planeID, totalEnginePower, maxPassengers);
    }
    public void goSuperSonic(){
        System.out.println(this.planeID + " - Supersonic mode activated");
    }
    public void goSubSonic(){
        System.out.println(this.planeID + " - Subsonic mode activated");
    }
}

class Mig extends BattlePlanes{
    public Mig(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }
    public void highSpeedGeometry(){
        System.out.println(this.planeID + " - High speed geometry selected");
    }
    public void normalSpeedGeometry(){
        System.out.println(this.planeID + " - Normal speed geometry selected");
    }
}

class TomCat extends BattlePlanes{
    TomCat(String planeID, int totalEnginePower){
        super(planeID,totalEnginePower);
    }
}

class Fleet{
    public static void main(String args[]){
        Planes p1 = new Planes("Normal plane",5000);
        Boeing p2 = new Boeing("Boeing plane", 4000, 300);
        Concorde p3 = new Concorde("Concorde plane", 4500,250);
        Mig p4 = new Mig("Mig plane", 7000);
        TomCat p5 = new TomCat("TomCat plane", 6500);
        p1.takeOff();
        p2.fly();
        p3.goSuperSonic();
        p3.goSubSonic();
        p4.highSpeedGeometry();
        p4.normalSpeedGeometry();
        p5.land();
        System.out.println(p1.getTotalEnginePower());
        System.out.println(p3.getTotalEnginePower());
        System.out.println(p2.getMaxPassengers());
        System.out.println(p3.getMaxPassengers());
        p4.launchMissile();
        p5.launchMissile();
        System.out.println(p1.getPlaneID());
        System.out.println(p3.getPlaneID());
    }
}

