package module6;

public class UserUtils {

    static User[] uniqueUsers(User[] users) {
        int count = 1;
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i] != null && users[j] != null && j != i) {
                    if (users[i].equals(users[j])) {
                        count--;
                        break;
                    }
                }
            }
            count++;
        }

        User[] uniqueUsers = new User[count];
        int element = 1;
        uniqueUsers[0] = users[0];
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i] != null && users[j] != null && j != i) {
                    if (users[i].equals(users[j])) {
                        element--;
                        break;
                    }
                }
            }
            if (uniqueUsers[element] == null) {
                uniqueUsers[element] = users[i];
            }
            element++;
        }
        return uniqueUsers;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance) {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getBalance() == balance) {
                count++;
            }
        }
        User[] usersWithContitionalBalance = new User[count];
        if (count == 0) {
            System.out.println("Where  is no users with such balance");
        } else {
            int element = 0;
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null && users[i].getBalance() == balance) {
                    usersWithContitionalBalance[element] = users[i];
                    element++;
                }
            }
        }
        return usersWithContitionalBalance;
    }

    final static User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                users[i].setBalance(users[i].getBalance() + users[i].getSalary());
            }
        }
        return users;
    }

    final static long[] getUsersId(User[] users) {
        long[] getUsersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                getUsersId[i] = users[i].getId();
            }
        }
        return getUsersId;
    }

    static User[] deleteEmptyUsers(User[] users) {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;
            }
        }
        User[] deleteEmptyUsers = new User[count];
        int element = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                deleteEmptyUsers[element] = users[i];
                element++;
            }
        }
        return deleteEmptyUsers;
    }
}
