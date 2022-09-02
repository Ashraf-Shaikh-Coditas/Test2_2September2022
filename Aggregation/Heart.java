package Test2_2Sep2022.Aggregation;

public class Heart {
    int pulseRate;
    String bloodGroup;

    public Heart(int pulseRate, String bloodGroup) {
        this.pulseRate = pulseRate;
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "Heart{" +
                "pulseRate=" + pulseRate +
                ", bloodGroup='" + bloodGroup + '\'' +
                '}';
    }
}
