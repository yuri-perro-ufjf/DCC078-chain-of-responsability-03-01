public class MaterialTypeSilver implements MaterialType{
    private static MaterialTypeSilver materialTypeSilver = new MaterialTypeSilver();

    private MaterialTypeSilver() {};

    public static MaterialTypeSilver getMaterialTypeSilver(){
        return materialTypeSilver;
    }
}
