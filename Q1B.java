/**
 * Write the makeAppointment method, which searches the periods from startPeriod to
 * endPeriod, inclusive, for the earliest block of duration available minutes in the
 * lowest-numbered period. If such a block is found, the makeAppointment method calls the helper
 * method reserveBlock to mark the minutes in the block as unavailable and returns true. If no
 * such block is found, the makeAppointment method returns false.
 */

/**
 * Searches periods from startPeriod to endPeriod, inclusive, for a block
 * of duration free minutes, as described in part (b). If such a block is found,
 * calls reserveBlock to reserve the block of minutes and returns true; otherwise
 * returns false.
 * Preconditions: 1 <= startPeriod <= endPeriod <= 8; 1 <= duration <= 60
*/

public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
    for(int i = startPeriod; i<=endPeriod; i++){
        if(findFreeBlock(i, duration) != -1){
            reserveBlock(i,findFreeBlock(i, duration), duration);
            return true;
        }
    }
    return false;
}