public class Main {
    public static void main(String[] args) {


        basicTestStructure structure=new basicTestStructure();

        structure.color="black";
        structure.model="v8";
        structure.power="5000cc";

        engine newEngine=new engine();

        newEngine.cylinders="6";
        newEngine.size="45555cc";
        newEngine.weight="980987k";

        lights newLights=new lights();

        newLights.color="red";
        newLights.size="16cm";
        newLights.intensity="9878l";
        
        
    }
}