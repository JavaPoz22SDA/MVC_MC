import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GiantView giantView = new GiantView();
        GiantModel giantModel = new GiantModel(Health.HEALTHY,Fatigue.TIRED,Nourishment.HUNGRY);
        GiantController giantController = new GiantController(giantModel, giantView);

        giantController.updateView();
        giantController.setHealth(Health.DEAD);
        giantController.updateView();

        List<GiantModel> giantModelList = new ArrayList<>();

    }
}
