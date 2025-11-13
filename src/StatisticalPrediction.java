public class StatisticalPrediction extends HurricanePredictionTemplate {
    @Override
    void fetchData() {
        System.out.println("Fetching historical hurricane data...");
    }

    @Override
    void preprocessData() {
        System.out.println("Preprocessing statistical data...");
    }

    @Override
    void applyPredictionModel() {
        System.out.println("Running statistical prediction model...");
    }

    @Override
    void postprocessResults() {
        System.out.println("Saving statistical prediction results...");
    }
}
