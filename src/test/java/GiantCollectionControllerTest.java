import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GiantCollectionControllerTest {

    private GiantModel giantModel;
    private GiantModel giantModel2;
    private GiantView giantView;
    private GiantCollectionController giantCollectionController;
    private List<GiantModel> list;

    @BeforeEach
    public void setUp(){
        System.out.println("PRZED");
        giantModel = Mockito.mock(GiantModel.class);
        giantModel2 = Mockito.mock(GiantModel.class);
        giantView = Mockito.mock(GiantView.class);
        list = new ArrayList<>();
        list.add(giantModel);
        list.add(giantModel2);
        giantCollectionController = new GiantCollectionController(list,giantView);
    }

    @Test
    public void setSetHealth1(){
        giantCollectionController.setHealth(Health.HEALTHY,0);
        Mockito.when(giantCollectionController.getHealth(0)).thenReturn(Health.HEALTHY);
        assertEquals(giantCollectionController.getHealth(0),Health.HEALTHY);
    }

    @Test
    public void setSetFatigue(){

        for (final Fatigue fatigue : Fatigue.values()){
            giantCollectionController.setFatigue(fatigue,1);
            Mockito.verify(list.get(1),Mockito.times(1)).setFatigue(fatigue);
        }

        giantCollectionController.getFatigue(1);
        Mockito.verify(list.get(1)).getFatigue();
    }

}