/** List of integers that hides the terrible truth
 * of the nakedness within */

public class SSList {
    /** Nested class (subordinate) */
    private static class IntNode {      // never looks outward so it can be static, cannot access outside stuff
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    /** the first item (if it exists) is at sentinel.next */
    private IntNode sentinel;       // dummy node
    private int size;

    /** list constructor, dont have to enter null */
    public SSList(int x) {
        sentinel = new IntNode(0, null);        // first value doesnt matter
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** creates an empty list */
    public SSList() {
        sentinel = new IntNode(0, null);        // first value doesnt matter
        size = 0;
    }

    /**
     * adds x to the front of the list
     */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);      // whoever was at front of line is now second
        size += 1;
    }

    /**
     * gets first item of list
     */
    public int getFirst(int index) {
        return sentinel.next.item;

    }

    /** adds x to end of list */
    public void addLast(int x) {
        size += 1;
        IntNode pnt = sentinel;             // pointer that will traverse through list

        while (pnt.next != null) {          // pointer cycles through until it reaches end of list
            pnt = pnt.next;
        }
        pnt.next = new IntNode(x, null);                   // now add value to this position (the end)

    }

//    /** returns the size of the list that starts at IntNode p. */
//    private static int size(IntNode p) {
//        if (p.next == null) {
//            return 1;
//        }
//        return 1 + size(p.next);
//    }

    public int size() {
        return size;

//        IntNode pnt = first;
//        int count = 1;
//        // if the tail of list is null, then we've reached the end of the list
//        while (pnt.next != null){
//            count++;
//            pnt = pnt.next;
//        }
//        return count;
    }


    public static void main(String[] args) {
        // creates new list of one item, 10
        SSList l = new SSList();
//        l.addFirst(10);
//        l.addFirst(15);
//        l.addFirst(25);
        l.addLast(1);
        l.addLast(12);

    }
}
