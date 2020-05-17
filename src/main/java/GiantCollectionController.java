import java.util.ArrayList;
import java.util.List;

public class GiantCollectionController {
    private List<GiantModel> listOfGiantModel;
    private GiantView giantView;

    public GiantCollectionController(List<GiantModel> listOfGiantModel, GiantView giantView) {
        this.listOfGiantModel = new ArrayList<>();
        this.listOfGiantModel = listOfGiantModel;
        this.giantView = giantView;
    }

    public void updateView(){
        this.giantView.displayGiant(this.listOfGiantModel);
    }

    public Health getHealth(int index) {
        return this.listOfGiantModel.get(index).getHealth();
    }

    public void setHealth(Health health, int index) {
        this.listOfGiantModel.get(index).setHealth(health);
    }

    public Fatigue getFatigue(int index) {
        return this.listOfGiantModel.get(index).getFatigue();
    }

    public void setFatigue(Fatigue fatigue, int index) {
        this.listOfGiantModel.get(index).setFatigue(fatigue);
    }

    public Nourishment getNourishment(int index) {
        return this.listOfGiantModel.get(index).getNourishment();
    }

    public void setNourishment(Nourishment nourishment, int index) {
        this.listOfGiantModel.get(index).setNourishment(nourishment);
    }

}
