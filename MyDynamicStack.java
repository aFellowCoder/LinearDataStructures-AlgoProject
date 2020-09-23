
/**
 * ADT MyStack: Private Part<br>.
 * The class implements all the operations available in MyStack<br>
 */
public class MyDynamicStack implements MyStack {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------
    private MyNode head;
    //-------------------------------------------------------------------
    // Basic Operation --> Check if MyStack is empty: myCreateEmpty
    //-------------------------------------------------------------------
    //public myStack myCreateEmpty(){}

    public MyDynamicStack(){
        this.head = null;

    }

    //-------------------------------------------------------------------
    // Basic Operation --> Check if MyStack is empty: isEmpty
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

        if (this.head == null) {
            scenario = 1;
        } else {
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
    // Basic Operation (Partial) --> Get first element from the top of MyStack and removes it: pop
    //-------------------------------------------------------------------

    public int pop(){
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------
        int res = -1;

        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        int scenario;

        if(isEmpty()) {
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
                MyNode removedNode = head;
                head = head.getNext();
                res = removedNode.getInfo();
                break;
        }

        //-----------------------------
        //Output Variable --> Return FinalValue
        //-----------------------------
        return res;
    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> Add element to the top of MyStack: push
    //-------------------------------------------------------------------

    public void push(int element){
        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        int scenario = 1;       // Only one scenario exists, adding to the front

        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------
        switch(scenario) {
            case 1:
                MyNode Node = new MyNode(element, null);
                Node.setNext(head);
                head = Node;
                break;
        }

    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> prints all the elements from MyStack: print
    //-------------------------------------------------------------------

    public void print(){

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
                System.out.println("Empty");
                break;
            case 2:
                MyNode currentNode = head;
                while (currentNode != null) {
                    System.out.print(currentNode.getInfo() + " ");
                    currentNode = currentNode.getNext();
                }
        }

    }


}
