import java.util.Scanner;

/**
 * Created by hp on 16-Feb-22.
 */
public class Test {
    public static void main(String[] args) {
          SinglyLinkedList<String> list = new SinglyLinkedList<>();
        Scanner in = new Scanner(System.in);
        int choice = -1;
        System.out.println("1 add first \t2 last \t3 remove first\t 0 exit");

        while (choice!=0)
        {
            System.out.println("Your choice:");
            choice = in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("input name: ");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input name: ");
                    list.addLast(in.next());
                    break;
                case 3:
                System.out.println("deleted is: "+list.removeFirst());
                break;
                case 0:
                    System.exit(0);
            }
            System.out.println("First="+list.first()+"\t last= "+list.last()+"\t size= "+list.size());
        }
    }
}
