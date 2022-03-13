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

    private IntNode first;

    /**
     * list constructor, dont have to enter null
     */
    public SSList(int x) {
        first = new IntNode(x, null);
    }

    /**
     * adds x to the front of the list
     */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /**
     * gets first item of list
     */
    public int getFirst(int index) {
        return first.item;

    }

    /** adds x to end of list */
    public void addLast(int x) {
        IntNode pnt = first;            // pointer that will traverse through list
        while (pnt.next != null) {      // pointer cycles through until it reaches end of list
            pnt = pnt.next;
        }

        pnt.item = x;                   // now add value to this position (the end)
    }



    public static void main(String[] args) {
        // creates new list of one item, 10
        SSList l = new SSList(10);
    }
}
