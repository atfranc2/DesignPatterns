package com.DesignPatterns.BehaviouralPatterns.mediator.ObserverImplementation;

public class ArticleDialogBoxObs {
    private ListBox listBox = new ListBox();
    private Textbox textbox = new Textbox();
    private Button button = new Button();

    public ArticleDialogBoxObs() {
/*        listBox.addObserver(new Observer() {
            @Override
            public void update() {
                listItemSelected();
            }
        });*/
        // Same as the following lambda expression:
        listBox.addEventHandler(() -> listItemSelected());
        // Or we could use a method reference
        button.addEventHandler(this::textboxChanged);
        // Both shorthands are possible because the interface is a functional interface
        // with only one method. The arguments being passed are anonymous classes
    }

    public void simulateUserInteraction(){
        System.out.println("Set content of the textbox (button should be enabled)");
        textbox.setContent("Article 1");
        System.out.println("Button: " + button.isEnabled());

        System.out.println("Set content of the textbox to null(button should be disabled");
        textbox.setContent("");
        System.out.println("Button: " + button.isEnabled());

        System.out.println("Select item in the list box (button should be enabled");
        listBox.setSelection("List Box Item 1");
        System.out.println("Button: " + button.isEnabled());
    }

    private void listItemSelected(){
        textbox.setContent(listBox.getSelection());
        button.setEnabled(true);
    }

    private void textboxChanged(){
        var content = textbox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        button.setEnabled(!isEmpty);
    }
}
