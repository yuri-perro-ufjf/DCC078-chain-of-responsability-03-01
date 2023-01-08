import java.util.ArrayList;

public abstract class ArmorFactory {

    protected ArrayList materialList = new ArrayList();
    private ArmorFactory armorFactorySuper;

    public ArmorFactory getArmorFactorySuper(){
        return armorFactorySuper;
    }

    public void setArmorFactorySuper(ArmorFactory armorFactorySuper){
        this.armorFactorySuper = armorFactorySuper;
    }

    public abstract String getDescription();

    public String buildArmor(Material material){
        if(materialList.contains(material.getMaterialType())){
            return getDescription();
        }
        else {
            if(armorFactorySuper != null){
                return armorFactorySuper.buildArmor(material);
            }
            else {
                return "Without Factory";
            }
        }
    }
}
