package command;

/**
 * @author suvan
 * @create 2017-01-04-16:52
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
        garageDoor.stop();
    }
}
