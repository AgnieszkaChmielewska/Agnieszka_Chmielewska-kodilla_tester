public class User {
    String name;
    int age;

    public User ( String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public static void main (String [] args){
        User [] users = new User[8];
        users [0] = new User("Jan", 39);
        users [1] = new User("Ala", 59);
        users [2] = new User("Aga", 19);
        users [3] = new User("Olga", 30);
        users [4] = new User("Asia", 19);
        users [5] = new User("Ula", 9);
        users [6] = new User("Ada", 3);
        users [7] = new User("Ewa", 59);

        int sumOfUsersAge = 0;
        for (int i =0;  i<users.length; i++ ) {
            sumOfUsersAge = users[i].getAge() + sumOfUsersAge;
        }
        System.out.println(sumOfUsersAge);

         for (int i =0;  i<users.length; i++ ){
             if(users[i].age> sumOfUsersAge/users.length)
            System.out.println(users[i].name);
        }
    }
}
