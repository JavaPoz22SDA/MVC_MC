import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GiantView giantView = new GiantView();
        GiantModel giantModel = new GiantModel(Health.HEALTHY,Fatigue.TIRED,Nourishment.HUNGRY);
        GiantController giantController = new GiantController(giantModel, giantView);

//        giantController.updateView();
//        giantController.setHealth(Health.DEAD);
//        giantController.updateView();

        List<GiantModel> giantModelList = new ArrayList<>();

        GiantModel giantModel1 = new GiantModel(Health.HEALTHY,Fatigue.SLEEPING,Nourishment.SATURATED);
        GiantModel giantModel2 = new GiantModel(Health.DEAD,Fatigue.SLEEPING,Nourishment.HUNGRY);

        List<GiantModel> list = new ArrayList<>();
        list.add(giantModel);
        list.add(giantModel1);
        list.add(giantModel2);

        GiantCollectionController giantCollectionController = new GiantCollectionController(list,giantView);
        giantCollectionController.updateView();
        giantCollectionController.setNourishment(Nourishment.HUNGRY,1);
        giantCollectionController.updateView();

    }
}
