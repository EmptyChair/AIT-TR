package Temp_Hold.lesson_029_LinkedList;

public class DoubleLinkNode {

    private int data;
    private DoubleLinkNode prev;
    private DoubleLinkNode next;

    public int getData() {
        return this.data;
    }

    public DoubleLinkNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        String previousNode;
        if (this.prev==null) {
            previousNode = "empty";
        } else {
            previousNode = Integer.toString(this.prev.data);
        }

        String nextNode;
        if (this.next==null) {
            nextNode = "empty";
        } else {
            nextNode = Integer.toString(this.next.data);
        }

        return "This Doubly Linked Node has data "+this.data+", its previous element is "+previousNode+", the next element is "+nextNode+".";
    }

    public void removeNextNode() {
        next.prev = null;
        this.next = null;
    }

    public void removePrevNode() {
        prev.next = null;
        this.prev = null;
    }

    /*
    public void addNextNode(DoubleLinkNode next) {
        this.next = next;
        //if next's previous is not this node - make it this node
        //ADD EQUALS METHOD TO WORK!!!
        if (!next.prev.same(this)) {
            next.addPrevNode(this);
        }
    }

    public void addPrevNode(DoubleLinkNode prev) {
        this.prev = prev;
        //if next's previous is not this node - make it this node
        //ADD EQUALS METHOD TO WORK!!!
        if (!prev.next.same(this)) {
            prev.addNextNode(this);
        }
    }



    public void addFirstNode(DoubleLinkNode first) {
        if (this.prev!=null) {
            prev.addFirstNode(first);
        } else {
            this.addPrevNode(first);
        }
    }

    public void removeFirstNode() {
        if (this.prev!=null) {
            prev.removeFirstNode();
        } else {
            //as removal of the next node is essentially separating current node from the subsequent chain
            this.removeNextNode();
        }
    }



    public void removeLastNode() {
        if (this.next!=null) {
            next.removeLastNode();
        } else {
            //as removal of the previous node is essentially separating current node from the previous chain
            this.removePrevNode();
        }
    }

    public void addLastNode(DoubleLinkNode last) {
        if (this.next!=null) {
            next.addLastNode(last);
        } else {
            this.addNextNode(last);
        }
    }

    public void showNodeList() {
        //Run to the beginning
        DoubleLinkNode first = getFirst(this);
        first.runDownList();
    }

    private DoubleLinkNode getFirst(DoubleLinkNode node) {
        if (node.prev == null) {
            return node;
        } else {
            return getFirst(node.prev);
        }
    }

    private DoubleLinkNode getLast(DoubleLinkNode node) {
        if (node.next == null) {
            return node;
        } else {
            return getLast(node.next);
        }
    }

    private void runDownList() {
        System.out.print(this.data+" ");
        if (this.next==null){
            System.out.print(".");
            System.out.println("");
        } else {
            this.next.runDownList();
        }
    }

     */

    /*
    public boolean same(DoubleLinkNode node) {
        boolean answer = false;
        if ((this.data == node.data) && (this.next == node.next) && (this.prev == node.prev))
            answer = true;

        return answer;
    }

     */


}
