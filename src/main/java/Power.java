
public class Power {

    String power;
    int magnitude;

    public Power(String power, int magnitude)
    {
        this.power=power;
        this.magnitude=magnitude;
    }

    @Override
    public String toString() {

                return "power: "+power+ " magnitude: "+magnitude;

    }
}
