public class GiantController {

    private GiantModel giantModel;
    private GiantView giantView;

    public GiantController(GiantModel giantModel, GiantView giantView) {
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public void updateView(){
        this.giantView.displayGiant(this.giantModel);
    }

    public Health getHealth() {
        return this.giantModel.getHealth();
    }

    public void setHealth(Health health) {
        this.giantModel.setHealth(health);
    }

    public Fatigue getFatigue() {
        return this.giantModel.getFatigue();
    }

    public void setFatigue(Fatigue fatigue) {
        this.giantModel.setFatigue(fatigue);
    }

    public Nourishment getNourishment() {
        return this.giantModel.getNourishment();
    }

    public void setNourishment(Nourishment nourishment) {
        this.giantModel.setNourishment(nourishment);
    }

}
