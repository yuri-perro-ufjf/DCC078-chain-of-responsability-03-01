public class MaterialTypeBronze implements MaterialType{
    private static MaterialTypeBronze materialTypeBronze = new MaterialTypeBronze();

    private MaterialTypeBronze() {};

    public static MaterialTypeBronze getMaterialTypeBronze(){
        return materialTypeBronze;
    }
}
