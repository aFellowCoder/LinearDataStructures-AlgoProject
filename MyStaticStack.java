
/**
 * ADT MyStack: Private Part<br>.
 * The class implements all the operations available in MyStack<br>
 */
public class MyStaticStack implements MyStack {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    private int items[];
    private int numItems;
    private int maxItems;

    //-------------------------------------------------------------------
    // Basic Operation --> Check if myStack is empty: myCreateEmpty
    //-------------------------------------------------------------------
    //public myStack myCreateEmpty(){}

    public MyStaticStack(int m){
        this.maxItems = m;
        this.items = new int[this.maxItems];
        this.numItems = 0;

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
        int scenario = 0;

        if (this.numItems == 0) {
            scenario = 1;
        }
        else {
            scenario = 2;
        }
        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------
        switch(scenario) {

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
    // Basic Operation (Partial) --> Get and remove first element from top of MyStack: pop
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

        if (isEmpty()) {
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
                res = -1;
                break;

            case 2:
                res = this.items[0];
                int[] item = new int[(this.items.length - 1)];
                for (int i = 0; i < item.length; i++) {
                    item[i] = this.items[i +1];
                } this.items = item;
                this.numItems = this.numItems - 1;
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
        int scenario;

        if (numItems < maxItems) {
            scenario = 2;
        }
        else {
            scenario = 1;
        }
        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------

        switch (scenario) {
            case 1:
                System.out.println("Error adding to stack, stack is full");
                break;

            case 2:
               this.items[this.maxItems - 1 - this.numItems] = element;
               this.numItems = this.numItems + 1;
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
                for (int i = 0; i < this.numItems; i ++) {
                    System.out.print(this.items[i] + " ");
                }
                break;
        }
    }

}