/**
 * Write the cleanData method, which modifies the temperatures instance variable by
 * removing all values that are less than the lower parameter and all values that are greater than the
 * upper parameter. The order of the remaining values in temperatures must be maintained
 */

/**
 * Cleans the data by removing from temperatures all values that are less than
 * lower and all values that are greater than upper, as described in part (a)
*/

public void cleanData(double lower, double upper){
    for(int i = 0; i<temperatures.size(); i++){
        if(temperatures.get(i) < lower || temperatures.get(i) > upper){
            temperatures.remove(i);
            i--;
        }
    }
}