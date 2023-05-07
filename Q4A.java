/**
 * Write the moveCandyToFirstRow method, which attempts to ensure that the box element at
 * row 0 and column col contains a piece of candy, using the following steps.
 * 
 * • If the element at row 0 and column col already contains a piece of candy, then
 * box is unchanged and the method returns true.
 * 
 * • If the element at row 0 and column col does not contain a piece of candy, then the
 * method searches the remaining rows of column col for a piece of candy. If a piece of
 * candy can be found in column col, it is moved to row 0, its previous location is set
 * to null, and the method returns true; otherwise, the method returns false.
 */

/**
 * Moves one piece of candy in column col, if necessary and possible, so that the box
 * element in row 0 of column col contains a piece of candy, as described in part (a).
 * Returns false if there is no piece of candy in column col and returns true otherwise.
 * Precondition: col is a valid column index in box.
*/

public boolean moveCandyToFirstRow(int col){
    if(box[0][col] != null){
        return true;
    }else{
        for(int i = 0; i<box[col].length; i++){
            if(box[i][col] != null){
                box[0][col] = box[i][col];
                box[i][col] = null;
                return true;
        }
    }

    return false;
}