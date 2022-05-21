package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Alex");
        User user2 = new User("Anna");
        User user3 = new User("Bob");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет");
        user2.sendMessage(user1, "Все нормально");
        user2.sendMessage(user1, "Как твои?");

        user3.sendMessage(user1, "Привет");
        user3.sendMessage(user1, "Какие планы?");
        user3.sendMessage(user1, "Я сегодня свободен");

        user1.sendMessage(user3, "Привет");
        user1.sendMessage(user3, "Пошли в ресторан");
        user1.sendMessage(user3, "Есть разговор");

        user3.sendMessage(user1, "Ок");

        MessageDatabase.showDialog(user1, user3);

        user1.subscribe(user3);
        user3.subscribe(user1);

        if (user1.isFriend(user3)){
            System.out.println(user1 + " и " + user3 + " друзья!");
        }

    }
}
