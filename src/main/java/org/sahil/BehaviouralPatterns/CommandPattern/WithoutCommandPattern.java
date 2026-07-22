package org.sahil.BehaviouralPatterns.CommandPattern;


class TextEditorIn{

    public void boldText(){
        System.out.println("Text has been bolded");
    }

    public void italicizeText(){
        System.out.println("Text has been italicized");
    }

    public void underlineText(){
        System.out.println("Text has been underlined");
    }

}

class BoldButton{
    private TextEditorIn editor;

    public BoldButton(TextEditorIn editor) {
        this.editor = editor;
    }

    public void onClick(){
        editor.boldText();
    }
}

class ItalicButton{
    private TextEditorIn editor;

    public ItalicButton(TextEditorIn editor) {
        this.editor = editor;
    }

    public void onClick(){
        editor.italicizeText();
    }
}

public class WithoutCommandPattern {

    public static void main(String[] args) {

        TextEditorIn textEditorIn = new TextEditorIn();
        BoldButton boldButton = new BoldButton(textEditorIn);
        ItalicButton italicButton = new ItalicButton(textEditorIn);
        boldButton.onClick();
        italicButton.onClick();

    }

}
