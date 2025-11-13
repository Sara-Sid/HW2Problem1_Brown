public class FetchDataCommand implements Command {
    private WeatherDataFetcher fetcher;

    public FetchDataCommand(WeatherDataFetcher fetcher){
        this.fetcher = fetcher;
    }

    @Override
    public void execute() {
        fetcher.fetchData();
    }
}
