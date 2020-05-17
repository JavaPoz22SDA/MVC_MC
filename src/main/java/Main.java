public class Main {
    public static void main(String[] args) {

        GiantView giantView = new GiantView();
        GiantModel giantModel = new GiantModel();
        GiantController giantController = new GiantController(giantModel, giantView);
    }
}
