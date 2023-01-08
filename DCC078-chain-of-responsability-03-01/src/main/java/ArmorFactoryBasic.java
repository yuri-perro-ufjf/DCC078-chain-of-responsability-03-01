public class ArmorFactoryBasic extends ArmorFactory{

    public ArmorFactoryBasic(ArmorFactory armorFactorySuper){
        materialList.add(MaterialTypeBronze.getMaterialTypeBronze());
        setArmorFactorySuper(armorFactorySuper);
    }

    public String getDescription(){
        return "Basic Armor Factory";
    }
}
