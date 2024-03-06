package Gems;

import data.ClassData;
import data.ClassData.ClassSkillNameCombination;

public class GemEfficiencyCalculator {

    //represents the base costs of level 5, level 7, level 9, level 10 CD, level 10 DMG gems respectively.
    public double[] baseCosts = new double[] {1000, 10000, 100000, 200000, 420000};
    public double[] baseDMG = new double[] {15, 21, 30, 40};
    public double dmgDistributionPercent = 0;

    public ClassData classData = new ClassData();
    
    
    public double calculateDmgDistPercent(String skillName, String className) {
        
        classData.generateDist();
        
    }
}
