/**
 * Write the longestHeatWave method, which returns the length of the longest heat wave found in
 * the temperatures instance variable. A heat wave is a sequence of two or more consecutive days
 * with a daily high temperature greater than the parameter threshold. The temperatures
 * instance variable is guaranteed to contain at least one heat wave based on the threshold parameter
 */

/**
 * Returns the length of the longest heat wave found in temperatures, as described in
 * part (b)
 * Precondition: There is at least one heat wave in temperatures based on threshold.
*/

public int longestHeatWave(double threshold){
    int count = 0;
    for(int i = 0; i<temperatures.size(); i++){
        if(temperatures.get(i) > threshold){
            count++;
        }
    }
    return count;
}