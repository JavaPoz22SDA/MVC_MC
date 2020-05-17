import java.util.List;

public class GiantView {

    public GiantView() {}

    public void displayGiant (GiantModel giantModel){
        System.out.println(giantModel.toString());
    }

    public void displayGiant (List<GiantModel> listOfGiantModel){
        for (GiantModel giantModel : listOfGiantModel){
            System.out.println(giantModel.toString());
        }
    }


}
