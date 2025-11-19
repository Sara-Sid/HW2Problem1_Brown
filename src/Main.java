public class Main {
    public static void main(String[] args) {



        // Statistical Prediction
        HurricanePredictionTemplate statistical = new StatisticalPrediction();
        System.out.println("\nRunning Statistical Prediction:");
        statistical.predictHurricane();

        // Machine Learning Prediction
        HurricanePredictionTemplate ml = new MachineLearningPrediction();
        System.out.println("\nRunning Machine Learning Prediction:");
        ml.predictHurricane();




        // Receivers
        WeatherDataFetcher fetcher = new WeatherDataFetcher();
        PredictionModel model = new PredictionModel();
        ResultSaver saver = new ResultSaver();

        // Commands
        Command fetchCommand = new FetchDataCommand(fetcher);
        Command predictCommand = new PredictionCommand(model);
        Command saveCommand = new SaveResultsCommand(saver);

        // Invoker
        PredictionInvoker invoker = new PredictionInvoker();
        invoker.addCommand(fetchCommand);
        invoker.addCommand(predictCommand);
        invoker.addCommand(saveCommand);

        // Execute workflow
        System.out.println("\nExecuting Command Workflow:");
        invoker.executeCommands();
    }
}
