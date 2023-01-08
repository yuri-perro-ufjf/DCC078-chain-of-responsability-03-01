public class MaterialTypeWood implements MaterialType{
    private static MaterialTypeWood materialTypeWood = new MaterialTypeWood();

    private MaterialTypeWood() {};

    public static MaterialTypeWood getMaterialTypeWood(){
        return materialTypeWood;
    }
}
