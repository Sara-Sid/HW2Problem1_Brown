import java.util.List;
import java.util.ArrayList;

public class PredictionInvoker{
    private List<Command> commands;

    public PredictionInvoker() {
        commands = new ArrayList<>();
    }
    public void addCommand(Command command){
        commands.add(command);
    }
    public void executeCommands(){
        for(Command command : commands){
            command.execute();
        }
    }
}


