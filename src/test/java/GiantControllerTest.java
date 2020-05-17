import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class GiantControllerTest {

    private GiantModel giantModel;
    private GiantView giantView;
    private GiantController giantController;

    @BeforeEach
    public void setUp(){
        System.out.println("PRZED");
        giantModel = Mockito.mock(GiantModel.class);
        giantView = Mockito.mock(GiantView.class);
        giantController = new GiantController(giantModel,giantView);
    }

    @Test
    public void testSetHealth(){

//        Mockito.verify(giantModel, Mockito.times(0));

        for (final Health health : Health.values()){
            giantController.setHealth(health);
            Mockito.verify(giantModel,Mockito.times(1)).setHealth(health); //sprawdza czy została wywołana metoda setHeath na obiekcie giantModel
        }

        giantController.getHealth();
        Mockito.verify(giantModel).getHealth();
    }

    @Test
    public void setSetFatigue(){

        for (final Fatigue fatigue : Fatigue.values()){
            giantController.setFatigue(fatigue);
            Mockito.verify(giantModel,Mockito.times(1)).setFatigue(fatigue);
        }

        giantController.getFatigue();
        Mockito.verify(giantModel).getFatigue();
    }

    @Test
    public void setSetNourishment(){

        for (final Nourishment nourishment : Nourishment.values()){
            giantController.setNourishment(nourishment);
            Mockito.verify(giantModel,Mockito.times(1)).setNourishment(nourishment);
        }

        giantController.getNourishment();
        Mockito.verify(giantModel).getNourishment();
    }

    @Test
    public void setSetHealth1(){
        giantController.setHealth(Health.HEALTHY);
        Mockito.when(giantController.getHealth()).thenReturn(Health.HEALTHY);
        assertEquals(giantController.getHealth(),Health.HEALTHY);
    }

}