package character;
import java.util.ArrayList;
import java.util.HashMap;

public class Character {

    public String className;
    public String specName;
    
    public double weaponQuality = 0;



    public HashMap<String, Integer> gemLevels = new HashMap<String, Integer>();
    public data.ClassData classData = new data.ClassData();

    public Character(String className, String specName) {
        this.className = className;
        this.specName  = specName;

        classData.generateDist();
        
    }

    public void setGemLevels(String name, int level) {
        gemLevels.replace(name, level);
    }

    public void setWeaponQuality(double quality) {
        this.weaponQuality = quality;
    }

}
