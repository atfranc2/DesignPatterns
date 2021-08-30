package com.DesignPatterns.BehaviouralPatterns.mediator;

public class ArticleDialogBox extends DialogBox {

    private ListBox listBox = new ListBox(this);
    private Textbox textbox = new Textbox(this);
    private Button button = new Button(this);

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

    @Override
    protected void changed(UIControl control) {
        if(control == listBox)
            listItemSelected();
        else if (control == textbox)
            textboxChanged();

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
