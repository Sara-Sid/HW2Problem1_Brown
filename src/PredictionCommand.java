public class PredictionCommand implements Command{
    protected PredictionModel predicts;
    public PredictionCommand(PredictionModel predicts){
        this.predicts=predicts;
    }
    @Override
    public void execute() {
    }
    protected void applyPredictionModel(){
    }
}

