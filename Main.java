public class Main {

    public static void main(String[] args) {

        QualityUpgradeCalculator qualCalc = new QualityUpgradeCalculator();

       
        
        double expectedAdditionalDamage = qualCalc.findExpectedAdditionalDamage(78);
        double percentDamageIncreasePerTap = (expectedAdditionalDamage * 100);
        System.out.println(percentDamageIncreasePerTap);
        double percentDamageIncreasePer10K = percentDamageIncreasePerTap * 12.5;
        System.out.println(percentDamageIncreasePer10K);

    }
    
}
