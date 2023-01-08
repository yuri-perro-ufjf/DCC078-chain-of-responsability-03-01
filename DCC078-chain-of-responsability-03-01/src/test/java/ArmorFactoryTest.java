import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmorFactoryTest {
    ArmorFactoryAdvanced armorFactoryAdvanced;
    ArmorFactoryIntermediary armorFactoryIntermediary;
    ArmorFactoryBasic armorFactoryBasic;

    @BeforeEach
    void setUp(){
        armorFactoryAdvanced = new ArmorFactoryAdvanced(null);
        armorFactoryIntermediary = new ArmorFactoryIntermediary(armorFactoryAdvanced);
        armorFactoryBasic = new ArmorFactoryBasic(armorFactoryIntermediary);
    }

    @Test
    void shouldBeReturnBasicFactoryToBuildWithBronze(){
        assertEquals("Basic Armor Factory", armorFactoryBasic.buildArmor(
                new Material(MaterialTypeBronze.getMaterialTypeBronze()))
        );
    }

    @Test
    void shouldBeReturnIntermediaryFactoryToBuildWithSilver(){
        assertEquals("Intermediary Armor Factory", armorFactoryBasic.buildArmor(
                new Material(MaterialTypeSilver.getMaterialTypeSilver()))
        );
    }

    @Test
    void shouldBeReturnAdvancedFactoryToBuildWithGold(){
        assertEquals("Advanced Armor Factory", armorFactoryBasic.buildArmor(
                new Material(MaterialTypeGold.getMaterialTypeGold()))
        );
    }

    @Test
    void shouldBeNotReturnyFactoryToBuildWithWood(){
        assertEquals("Without Factory", armorFactoryBasic.buildArmor(
                new Material(MaterialTypeWood.getMaterialTypeWood()))
        );
    }

}