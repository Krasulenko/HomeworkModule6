package module6;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[5];
        User user1 = new User(123, "Anna", "May", 1000, 2000);
        users[0] = user1;
        User user2 = new User(123, "Anna", "May", 1000, 2000);
        //User user2 = new User(124, "Jack", "Cane", 1100, 2200);
        users[1] = user2;
        User user3 = new User(123, "Anna", "May", 1000, 2000);
        //User user3 = new User(125, "Melissa", "Holms", 1200, 2400);
        users[2] = user3;
        User user4 = new User(126, "William", "Terner", 1300, 2600);
        //users[3] = user4;
        User user5 = new User(127, "Sam", "Pitt", 1400, 2800);
        users[4] = user5;

        System.out.println(java.util.Arrays.toString(users));
        System.out.println(java.util.Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.println(" ");

        System.out.println(java.util.Arrays.toString(users));
        System.out.println(java.util.Arrays.toString(UserUtils.usersWithContitionalBalance(users, 2800)));
        System.out.println(" ");

        System.out.println(java.util.Arrays.toString(users));
        System.out.println(java.util.Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println(" ");

        System.out.println(java.util.Arrays.toString(users));
        System.out.println(java.util.Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println(" ");

        System.out.println(java.util.Arrays.toString(users));
        System.out.println(java.util.Arrays.toString(UserUtils.deleteEmptyUsers(users)));
        System.out.println(" ");
    }
}
