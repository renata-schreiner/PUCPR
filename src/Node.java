public class Node {
    private Integer information;
    public Node next;

    public Node(){
        information = null;
        next = null;
    }

    public Integer getInformation() {
        return information;
    }

    public void setInformation(Integer information) {
        this.information = information;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
