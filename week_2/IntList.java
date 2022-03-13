public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /**
     *
     * @return the size of the list using recursion
     */
    public int size() {
        // if the tail of list is null, then we've reached the end of the list
        if (rest == null){
            return 1;
        }
        else {
            return 1 + this.rest.size();
        }
    }

    /**
     * @return the size of the list using no recursion
     */
    public int iterativeSize() {
        IntList pointer = this;
        int totalSize = 0;

        while (pointer != null) {
            totalSize += 1;
            pointer = pointer.rest;
        }
        return totalSize;
    }

    /**
     * returns ith item of this list
     *
     */
    public int iterativeGet(int index) {
        int count = 0;              // keeping track of indexes
        IntList p = this;           // initialize pointer to reference "first"
        int target = p.first;       // capture the value in "first"

        while (count != index) {        // while we are going through each index, if index doesnt match
            p = p.rest;                 // go to next pointer
            target = p.first;           // get value of that pointers "first"
            count ++;                   // add to index
        }

        return target;
    }

    public int recursiveGet(int index) {
        if (index == 0) { return first; }
        return rest.recursiveGet(index - 1);        // to the rest (neighbor), their first is the 0th item. keep subtracting till i get to desired item
    }
    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList( 10, L);
        L = new IntList(5, L);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.recursiveGet(2));
//        IntList L = new IntList();
//        L.first = 5;
//        L.rest = null;
//
//        L.rest = new IntList();
//        L.rest.first = 10;
//
//        L.rest.rest = new IntList();
//        L.rest.rest.first = 15;
    }
}