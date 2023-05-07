/**
 * Write the findFreeBlock method, which searches period for the first block of free minutes
 * that is duration minutes long. If such a block is found, findFreeBlock returns the first
 * minute in the block. Otherwise, findFreeBlock returns -1. The findFreeBlock method
 * uses the helper method isMinuteFree, which returns true if a particular minute is available to
 * be included in a new appointment and returns false if the minute is unavailable. 
*/

/**
 * Searches for the first block of duration free minutes during period, as described in
 * part (a). Returns the first minute in the block if such a block is found or returns -1 if no
 * such block is found.
 * Preconditions: 1 <= period <= 8; 1 <= duration <= 60
*/

public int findFreeBlock(int period, int duration){
    int count = 0;
    for (int i = 0; i<60; i++){
        if(isMinuteFree(period,i) == true){
            count++;
            if(count == duration){
                return (i - duration + 1);
            }
        }else{
            count = 0;
        }
    }
    return -1;
}