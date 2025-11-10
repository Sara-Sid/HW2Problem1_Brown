public abstract class HurricanePredictionTemplate {
    // Template method
    public final void predictHurricane(){
        fetchData();
        preprocessData();
        applyPredictionModel();
        postprocessResults();
    }
    // Steps to be implemented by subclass
    abstract void fetchData();
    abstract void preprocessData();
    abstract void applyPredictionModel();
    abstract void postprocessResults();

}
