package data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClassData {


    public static enum ClassType {
        SOULFIST_EO,
        SOULFIST_RS,
        WARDANCER_ESO,
        WARDANCER_FI,
        SCRAPPER_SHOCK,
        SCRAPPER_TAI,
        GLAVIER_PINN,
        GLAVIER_CONT,
        SLAYER_PUN,
        SLAYER_PRED,
        SOULEATER_FMH,
        SOULEATER_NE,
        DEATHBLADE_SURGE,
        DEATHBLADE_RE,
    }

    public ArrayList<String> ClassSkillNameCombination = new ArrayList<String>();

    public HashMap<String, Double> damageDistributions = 
    new HashMap<String, Double>();

    
    public void generateDist() {

        damageDistributions.put("Soulfist_RS_Merciless_Pummel", 0.1991);
        damageDistributions.put("Soulfist_RS_Energy_Blast", 0.1795);
        damageDistributions.put("Soulfist_RS_Tempest_Blast", 0.1442);
        damageDistributions.put("Soulfist_RS_Celestial_Palm", 0.1262);
        damageDistributions.put("Soulfist_RS_Illusion_Strike", 0.1262);
        damageDistributions.put("Soulfist_RS_World_Decimation", 0.213);

        

    }
    
}
