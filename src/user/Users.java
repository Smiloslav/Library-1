package user;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Users implements Serializable{
    private List<User> usersList;
//    private LocalDate date;

    public Users() {
        this.usersList = new ArrayList<>();
//        date = LocalDate.now();
    }

    public void addUser(User user) {
        if(!usersList.contains(user))
            usersList.add(user);
        else
            System.out.println("This user is already added");
    }

    public List<User> getUsersList() {
        return usersList;
    }

//    public String dateToString() {
//        return date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear();
//    }


    public void print() {
        System.out.println("Users list");
        if(usersList.isEmpty()) {
            System.out.println("The Users list is empty");
            return;
        }

        for(User u : usersList) {
            System.out.println(u.toString());
        }
        System.out.println(usersList.size() + " users");
    }

    public String getNameFile() {
//        String _date = "-" + date.getDayOfMonth() + '-' + date.getMonthValue() + '-' + date.getYear();
        return "users.ser";
    }


}

