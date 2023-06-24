public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven()
    {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int min)
    {
        return 40-min;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers)
    {
        int total_layer_time=2*layers;
        return total_layer_time;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int mins_spent)
    {
        int total_layer_time=preparationTimeInMinutes(layers);
        int total_time=total_layer_time+mins_spent;
        return total_time;
    }
}
