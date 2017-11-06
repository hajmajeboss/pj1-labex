public class FeliciaFactory implements IFactory {

    private Auto auto;

    public FeliciaFactory() {
    }

    @Override
    public Auto build() {
        return new Auto("Skoda", "Felicia", 1300);
    }
}
