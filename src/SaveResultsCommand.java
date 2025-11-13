public class SaveResultsCommand implements Command {
    private ResultSaver saver;

    public SaveResultsCommand(ResultSaver saver){
        this.saver = saver;
    }

    @Override
    public void execute() {
        saver.saveResults();
    }
}
