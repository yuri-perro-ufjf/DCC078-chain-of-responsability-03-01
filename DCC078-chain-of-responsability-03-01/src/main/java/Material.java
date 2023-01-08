public class Material {

    private MaterialType materialType;

    public Material(MaterialType materialType){
        this.materialType = materialType;
    }

    public MaterialType getMaterialType(){
        return materialType;
    }

    public void setMaterialType(MaterialType materialType){
        this.materialType = materialType;
    }
}
