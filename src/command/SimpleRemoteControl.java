package command;

/**
 * @author suvan
 * @create 2017-01-04-16:42
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
