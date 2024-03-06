public class QualityUpgradeCalculator {

    public double[] probabilityBuckets = new double[] {0.2519, 0.2141, 0.1763, 0.1385, 0.1008, 
                                                       0.0630, 0.0252, 0.0126, 0.0101, 0.0076};
    
                                                    
    public QualityUpgradeCalculator() {

        
    }

    /**
     * Finds the mean additional damage gained from each weapon quality tap.
     * @param startingQuality
     * @return
     */
    public double findExpectedAdditionalDamage(double startingQuality) {
        //Formula for additional damage for weapons. 
        double startingAdditionalDamage = 0.1 + 0.00002 * Math.pow(startingQuality, 2);

        double currentQuality = startingQuality;
        double cumulativeAdditionalDamage = 0;
        double epochAdditionalDamage = 0;
        int numberOfIterations = 3000;
        int numberOfEpochs = 3000;

        for(int j = 0; j < numberOfEpochs; j++) {
            cumulativeAdditionalDamage = 0;

            for(int i = 0; i < numberOfIterations; i++) {
                double newQuality = rollQuality();
            
                if(newQuality > currentQuality) {
                
                    double newAdditionalDamage = 0.1 + 0.00002 * Math.pow(newQuality, 2);
                    cumulativeAdditionalDamage += (newAdditionalDamage - startingAdditionalDamage);
                } else {
                
                }
            }
            epochAdditionalDamage += cumulativeAdditionalDamage;
        }
        

        return epochAdditionalDamage / numberOfEpochs / numberOfIterations;
        
    }

    /**
     * 
     * @return
     */
    public double rollQuality() {
        int bucketNumber = rollBucket();
        

        double roll = Math.floor(10 * Math.random() + 1);

        double quality = bucketNumber * 10 + roll;
       

        return quality;

    }


    /**
     * Determines which probability bucket the roll falls into. 
     * For example, bucket 0 = 0-10 quality, bucket 1 = 11-20 quality etc.
     * @return
     */
    public int rollBucket() {

        int currentIndex = 0;
        double roll = Math.random();
        for(int i = 0; i < probabilityBuckets.length; i++) {
            //System.out.println(roll);
            if(roll < probabilityBuckets[i]) {
                return i;
            } else {
                roll -= probabilityBuckets[i];
            }

        }

        return 0;
       

    }



    
}
