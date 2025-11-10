public class SaveResultsCommand implements Command{
    protected ResultSaver results;

    public void SaveResultsCommand(ResultSaver results) {
        this.results = results;
    }

    @Override
    public void execute(Command command) {
    }
    protected void saveResults(){
    }
}
