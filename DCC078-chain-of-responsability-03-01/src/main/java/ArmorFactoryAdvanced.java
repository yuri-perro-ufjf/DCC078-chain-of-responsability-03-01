public class ArmorFactoryAdvanced extends ArmorFactory{

    public ArmorFactoryAdvanced(ArmorFactory armorFactorySuper){
        materialList.add(MaterialTypeGold.getMaterialTypeGold());
        setArmorFactorySuper(armorFactorySuper);
    }

    public String getDescription(){
        return "Advanced Armor Factory";
    }
}
