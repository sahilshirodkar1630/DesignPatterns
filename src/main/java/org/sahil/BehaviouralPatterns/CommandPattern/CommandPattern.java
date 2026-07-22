package org.sahil.BehaviouralPatterns.CommandPattern;

interface Command{
    void execute();
}

class TextEditor{

    public void boldText(){
        System.out.println("Text has been bolded");
    }

    public void italicizeText(){
        System.out.println("Text has been italicized");
    }

    public void changeColor(){
        System.out.println("Color has been changed");
    }

}

// Concrete Classes for Commands
class BoldCommand implements Command{

    private TextEditor textEditor;

    public BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.boldText();
    }
}

class ChangeColorCommand implements Command{

    private TextEditor textEditor;

    public ChangeColorCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.changeColor();
    }
}

class Button{
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}

public class CommandPattern {

    public static void main(String[] args) {
        Button button = new Button();
        TextEditor textEditor = new TextEditor();
        button.setCommand(new BoldCommand(textEditor));

        button.click();

        button.setCommand(new ChangeColorCommand(textEditor));
        button.click();
    }



}
