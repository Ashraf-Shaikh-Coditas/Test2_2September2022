package Test2_2Sep2022.Aggregation;

public class Human {
    int id;
    String name;
    Heart heart;


    public Human(int id, String name, Heart heart) {
        this.id = id;
        this.name = name;
        this.heart = heart;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", heart=" + heart +
                '}';
    }
}
