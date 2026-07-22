package org.sahil.BehaviouralPatterns.MediatorPattern.Problem;

class User{

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String msg, User recipient){
        System.out.println(this.name + " sending "+msg +" to " + recipient.getName() );
    }

}

public class WithoutMediatorProblem {
    public static void main(String[] args) {
        User sahil = new User("Sahil");
        User amit = new User("Amit");
        User aalia = new User("Aalia");
        User rahul = new User("Rahul");

        rahul.sendMessage("Hello",amit);
        rahul.sendMessage("Hello",sahil);

        rahul.sendMessage("Hello",aalia);

    }
}
