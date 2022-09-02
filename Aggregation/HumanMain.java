package Test2_2Sep2022.Aggregation;

public class HumanMain {
    public static void main(String[] args) {
        Heart heart = new Heart(72, "O+ve");
        Human human = new Human(101, "Ashraf", heart);

        System.out.println(heart);
        System.out.println(human);
    }
}
