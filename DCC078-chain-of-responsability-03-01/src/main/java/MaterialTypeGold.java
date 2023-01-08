public class MaterialTypeGold implements MaterialType{
    private static MaterialTypeGold materialTypeGold = new MaterialTypeGold();

    private MaterialTypeGold() {};

    public static MaterialTypeGold getMaterialTypeGold(){
        return materialTypeGold;
    }
}
