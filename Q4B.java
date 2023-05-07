/**
 * Write the removeNextByFlavor method, which attempts to remove and return one piece of candy
 * from the box. The piece of candy to be removed is the first piece of candy with a flavor equal to the
 * parameter flavor that is encountered while traversing the candy box in the following order: the last
 * row of the box is traversed from left to right, then the next-to-last row of the box is traversed from left to
 * right, etc., until either a piece of candy with the desired flavor is found or until the entire candy box has
 * been searched.
 */

/**
 * Removes from box and returns a piece of candy with flavor specified by the parameter, or
 * returns null if no such piece is found, as described in part (b)
*/

public Candy removeNextByFlavor(String flavor){
    for(int i = box.length-1; i>=0; i--){
        for(int j = 0; j<box[i].length; j++){
            if(box[i][j].equals(flavor)){
                Candy piece = box[i][j];
                box[i][j] = null;
                return piece;
            }
        }
    }
    return null;
}