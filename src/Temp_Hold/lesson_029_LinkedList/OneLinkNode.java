package Temp_Hold.lesson_029_LinkedList;

public class OneLinkNode {
    int data;
    OneLinkNode next;

    public OneLinkNode(int data) {
        this.data = data;
        this.next = null;
    }

    public void addNode(OneLinkNode next) {
        this.next = next;
    }

    public void showNodeList() {
        System.out.print(this.data+" ");
        if (this.next==null){
            System.out.print(".");
        } else {
            this.next.showNodeList();
        }
    }


}
