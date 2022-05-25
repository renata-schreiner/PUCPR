public class ATP {

    public static void main(String[] args) throws Exception{

        ChainedList list = new ChainedList();
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);
        list.addLast(90);

        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.addFirst(0);



        list.removeLast();
        list.removeFirst();
        list.remove(40);
        list.show();
    }
}
