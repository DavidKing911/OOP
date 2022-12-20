package Seminar_3.Homework;

public class Main {
    public static void main(String[] args) {
        CustomList<User> cl = new CustomList<>();
        cl.add(new User("Иван", "Иванов", 25));
        cl.add(new User("Петр", "Петрович", 38));
        cl.add(new User("Дмитрий", "Сидоров", 19));
        for (Node node : cl) {
            System.out.println(node.getData());
        }
    }
}