public class PredictionCommand implements Command {
    private PredictionModel predicts;

    public PredictionCommand(PredictionModel predicts){
        this.predicts = predicts;
    }

    @Override
    public void execute() {
        predicts.applyPredictionModel();
    }
}


