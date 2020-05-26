public static  Node insert(Node head,int data)
    {
        Node node=new Node(data);
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
        return head;
    }
