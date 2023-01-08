public class ArmorFactoryIntermediary extends ArmorFactory{

    public ArmorFactoryIntermediary(ArmorFactory armorFactorySuper){
        materialList.add(MaterialTypeSilver.getMaterialTypeSilver());
        setArmorFactorySuper(armorFactorySuper);
    }

    public String getDescription(){
        return "Intermediary Armor Factory";
    }
}
