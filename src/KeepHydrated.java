/*
Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
        You get given the time in hours and you need to return the number of litres Nathan will drink,
        rounded to the smallest value.
 */

public class KeepHydrated  {
    public int Liters(double time)  {
        if ( time < 0 )
            throw new IllegalArgumentException("Time cannot be negative");
        return (int) ((int) time * 0.5);
    }

    public static void main(String[] args) {
        KeepHydrated keepHydrated = new KeepHydrated();
        System.out.println(keepHydrated.Liters(3));
        System.out.println(keepHydrated.Liters(1600.20));
    }

}
