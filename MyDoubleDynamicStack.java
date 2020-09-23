
/**
 * ADT MyStack: Private Part<br>.
 * The class implements all the operations available in MyStack<br>
 */
public class MyDoubleDynamicStack<T> implements MyStack<T> {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------
        private MyDoubleLinkedNode<T> head;
        private MyDoubleLinkedNode<T> tail;
    //-------------------------------------------------------------------
    // Basic Operation --> Check if myStack is empty: myCreateEmpty
    //-------------------------------------------------------------------
    //public myStack myCreateEmpty(){}

    public MyDoubleDynamicStack(){
        this.head = null;
        this.tail = null;

    }

    //-------------------------------------------------------------------
    // Basic Operation --> Check if myStack is empty: isEmpty
    //-------------------------------------------------------------------

    public boolean isEmpty(){
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------
        boolean res = true;

        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        int scenario;

        if (head == null && tail == null) {
            scenario = 1;
        }
        else {
            scenario = 2;
        }
        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------
        switch (scenario) {
            case 1:
                res = true;
                break;
            case 2:
                res = false;
                break;
        }
        //-----------------------------
        //Output Variable --> Return FinalValue
        //-----------------------------
        return res;
    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> Get first element from front of MyStack: first
    //-------------------------------------------------------------------

    public T first(){
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------
        T res = null;

        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        int scenario;

        if (isEmpty()) {
            scenario = 1;
        } else {
            scenario = 2;
        }

        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------
        switch (scenario) {
            case 1:
                break;

            case 2:
                res = head.getInfo();
                break;
        }

        //-----------------------------
        //Output Variable --> Return FinalValue
        //-----------------------------
        return res;
    }

    //-------------------------------------------------------------------
    // Basic Operation --> Add element to back of MyStack: addByFirst
    //-------------------------------------------------------------------

    public void addByFirst(T element){
        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        int scenario;
        if (isEmpty()) {
            scenario = 1;       //empty
        }
        else {
            scenario = 2;       // not empty
        }
        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------
        switch (scenario) {
            case 1:     //Empty
                MyDoubleLinkedNode<T> node = new MyDoubleLinkedNode<T>(null, element, null);
                tail = node;
                head = node;
                break;


            case 2:     // not empty
                node = new MyDoubleLinkedNode<T>(null, element, null);
                node.setRight(head);
                head.setLeft(node);
                head = node;
                break;

        }
    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> Remove element from front of MyStack: removeByFirst
    //-------------------------------------------------------------------

    public void removeByFirst(){
        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        int scenario;


        if (isEmpty()) {
            scenario = 1;
        }

        else if (head.getRight() == null) {
            scenario = 2;       // One item
        }
        else {
            scenario = 3;       // More than one item
        }
        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------
        switch (scenario) {
            case 2:
                tail = null;
                head = null;
                break;

            case 1:
                System.out.println("Error");
                break;

            case 3:
                head.getRight().setLeft(null);
                head = head.getRight();
                break;
        }



    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> Get first element from front of MyStack: last
    //-------------------------------------------------------------------

    public T last(){
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------
        T res = null;

        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        int scenario;

        if (isEmpty()) {
            scenario = 1;

        } else {
            scenario = 2;
        }

        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------
        switch (scenario) {
            case 1:
                break;

            case 2:
                res = tail.getInfo();
        }
        //-----------------------------
        //Output Variable --> Return FinalValue
        //-----------------------------
        return res;
    }

    //-------------------------------------------------------------------
    // Basic Operation --> Add element to back of MyStack: addByLast
    //-------------------------------------------------------------------

    public void addByLast(T element){
        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        int scenario;

        if (isEmpty()) {
            scenario = 1;
        } else {
            scenario = 2;
        }
        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------
        switch (scenario) {
            case 1:
                MyDoubleLinkedNode<T> node = new MyDoubleLinkedNode<>(null, element, null);
                head = node;
                tail = node;
                break;

            case 2:
                node = new MyDoubleLinkedNode<>(null, element, null);
                tail.setRight(node);
                node.setLeft(tail);
                tail = node;
                break;

        }



    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> Remove element from front of MyStack: removeByFirst
    //-------------------------------------------------------------------

    public void removeByLast(){
        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        int scenario;


        if (isEmpty()) {
            scenario = 1;
        }

        else if (tail.getLeft() == null) {
            scenario = 2;

        }else {
            scenario = 3;
        }

        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------

        switch (scenario) {

            case 1:
                System.out.println("Error");
                break;
            case 2:
                head = null;
                tail = null;
                break;

            case 3:
                tail.getLeft().setRight(null);
                tail = tail.getLeft();
                break;
        }

    }

}

