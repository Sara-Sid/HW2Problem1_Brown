public class Main {
    public static void main(String[] args){
        HurricanePredictionTemplate machineLearningPrediction = new MachineLearningPrediction();
        HurricanePredictionTemplate statisticalPrediction = new StatisticalPrediction();
        WeatherDataFetcher fetcher = new WeatherDataFetcher();
        ResultSaver results = new ResultSaver();
        PredictionModel predicts = new PredictionModel();




        System.out.println("Machine Learning Prediction: ");
        machineLearningPrediction.fetchData();
        machineLearningPrediction.preprocessData();
        machineLearningPrediction.applyPredictionModel();
        machineLearningPrediction.postprocessResults();

        System.out.println("Statistical Prediction: ");
        statisticalPrediction.fetchData();
        statisticalPrediction.preprocessData();
        statisticalPrediction.applyPredictionModel();
        statisticalPrediction.postprocessResults();

    }
}
