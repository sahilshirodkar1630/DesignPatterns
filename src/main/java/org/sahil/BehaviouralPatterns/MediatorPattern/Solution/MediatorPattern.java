package org.sahil.BehaviouralPatterns.MediatorPattern.Solution;

import java.util.ArrayList;
import java.util.List;

interface ChatMediator{
    void sendMessage(String msg,User user);
    void addUser(User user);
}

class ChatRoom implements  ChatMediator{

    private List<User> users;

    public ChatRoom(){
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User sender) {
        for(User user : users){
            if(user!=sender) {
                user.receiverMessage(msg, sender);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

}


class User{

    private String name;
    private ChatMediator chatMediator;

    public User(String name,ChatMediator chatMediator){
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String msg){
        chatMediator.sendMessage(msg,this);
    }

    public void receiverMessage(String msg, User sender){
        System.out.println(this.name + " received message: '"+ msg+"' from "+sender.getName());
    }

}

public class MediatorPattern {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();
        User sahil = new User("Sahil",mediator);
        User amit = new User("Amit",mediator);
        User aalia = new User("Aalia",mediator);
        User rahul = new User("Rahul",mediator);

        mediator.addUser(sahil);
        mediator.addUser(amit);
        mediator.addUser(aalia);
        mediator.addUser(rahul);

        amit.sendMessage("Hello saablog");

    }

}
