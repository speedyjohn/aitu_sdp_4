import Classes.Part1.Interpreter;
import Classes.Part2.History;
import Classes.Part2.TextEditor;
import Classes.Part3.NewsAgency;
import Classes.Part3.NewsChannel;

public class Main {
    public static void main(String[] args) {
        // Part 1
        String expression = "5123 + 222 - 332";
        System.out.println("Result: " + Interpreter.interpret(expression));

        // Part 2
        TextEditor editor = new TextEditor();
        History history = new History();
        editor.setText("Hello");
        history.save(editor.save());
        editor.setText("Hello, World!");
        history.save(editor.save());
        editor.setText("Hello, World! Bye Bye, World!");
        System.out.println("Before undo: " + editor.getText());
        editor.restore(history.undo());
        System.out.println("After undo: " + editor.getText());
        editor.restore(history.undo());
        System.out.println("After second undo: " + editor.getText());

        // Part 3
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");
        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.setHeadline("Breaking News: New Observer Pattern in Action!");
        agency.removeObserver(channel1);
        agency.setHeadline("Update: Channel 1 unsubscribed.");
    }
}