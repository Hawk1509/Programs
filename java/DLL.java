//prorgam to perform DLL of[peration 
import java.util.Scanner;
class node
{
    int data;
    node llink;
    node rlink;
    public node (int data) // constructor
    {
        this.data = data;
        this.llink = null;
        this.rlink = null;
    }
}
class DoublyLL
{
    node ptr, head = null, tail = null, ptr1;

        public void inEnd(int data)
        {
            node newNode = new node(data);
            if(head == null)
            {
                head = newNode;
            }
            else
            {
                tail.rlink = newNode;
                newNode.llink = tail;
                tail = newNode;
            }
        }
        public void Disp()
        {
            ptr = head;
            while(ptr != null)
            {
                System.out.println(+ptr.data+ " ");
                ptr = ptr.rlink;
            }
            System.out.println();
        }
}

class DLL{
    public static void main(String [] args)
    {
        DoublyLL d = new DoublyLL();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.INSERT AT END\n2.DISPLAY\n3.EXIT(0)\nENTER CHOICE: ");
        int a = sc.nextInt();
        switch(a)
        {
            case 1: 
            System.out.println("ENTER ELEMENT TO BE INSERTED: ");
            int b = sc.nextInt();
            d.inEnd(b);
            break;
             case 2:
             d.Disp();
        }

    }
}