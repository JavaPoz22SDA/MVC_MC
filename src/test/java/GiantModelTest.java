import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GiantModelTest {

    @Test
    public void testSetHealth() {
        final GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.TIRED, Nourishment.HUNGRY);

        assertEquals(Health.HEALTHY, giantModel.getHealth());

        for (final Health health : Health.values()) {
            giantModel.setHealth(health);
            assertEquals(health, giantModel.getHealth());
        }
    }

    @Test
    public void testSetFatigue() {
        final GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.TIRED, Nourishment.HUNGRY);

        assertEquals(Fatigue.TIRED, giantModel.getFatigue());

        for (final Fatigue fatigue : Fatigue.values()) {
            giantModel.setFatigue(fatigue);
            assertEquals(fatigue, giantModel.getFatigue());
        }
    }

    @Test
    public void testSetNourishment() {
        final GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.TIRED, Nourishment.HUNGRY);

        assertEquals(Nourishment.HUNGRY, giantModel.getNourishment());

        for (final Nourishment nourishment : Nourishment.values()) {
            giantModel.setNourishment(nourishment);
            assertEquals(nourishment, giantModel.getNourishment());
        }
    }

}