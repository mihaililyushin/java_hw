package generic;

public enum Planet {Mercury, Venera, Zemlya, Mars, Upiter, Saturn, Uran, Neptun}

class Planets {
    Planet planet;
    public Planets(Planet planet){
        this.planet = planet;
    }

    public void getPlanet(){
        switch (planet) {
            case Mars:
                System.out.println(this.planet + " Planet mass 1321, orbit 2321312");
                break;
            case Uran:
                System.out.println(this.planet + " Planet mass 1454521, orbit 245651312");
                break;
            case Neptun:
                System.out.println(this.planet + " Planet mass 156421, orbit 23555312");
                break;
            case Saturn:
                System.out.println(this.planet + " Planet mass 133331, orbit 23215412");
                break;
            case Upiter:
                System.out.println(this.planet + " Planet mass 13421, orbit 232154512");
                break;
            case Venera:
                System.out.println(this.planet + " Planet mass 12221, orbit 24541312");
                break;
            case Zemlya:
                System.out.println(this.planet + " Planet mass 135651, orbit 232545612");
                break;
            case Mercury:
                System.out.println(this.planet + " Planet mass 137821, orbit 2327712");
                break;
        }
    }

    public static void main(String[] args) {

    Planets planeta = new Planets(Planet.Zemlya);
    planeta.getPlanet();

    }
}
