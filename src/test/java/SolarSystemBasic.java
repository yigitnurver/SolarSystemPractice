import java.sql.SQLOutput;

public class SolarSystemBasic {
    public static void main(String[] args) {
        BasicStructure BB= new BasicStructure();
        BB.Planets="2";
        BB.Moon="2";
        BB.Stars="10";
        BB.Sun="1";
        System.out.println("solar system is ready");

        FeatureSun Xros= new FeatureSun();
        Xros.temp="321321k";
        Xros.color="green";
        Xros.Radius="321321321 miles";
    }
}
