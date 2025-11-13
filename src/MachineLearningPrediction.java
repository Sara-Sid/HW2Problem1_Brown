public class MachineLearningPrediction extends HurricanePredictionTemplate {
    @Override
    void fetchData() {
        System.out.println("Fetching real-time + historical data...");
    }

    @Override
    void preprocessData() {
        System.out.println("Normalizing ML data...");
    }

    @Override
    void applyPredictionModel() {
        System.out.println("Running ML prediction model...");
    }

    @Override
    void postprocessResults() {
        System.out.println("Saving ML prediction results...");
    }
}

