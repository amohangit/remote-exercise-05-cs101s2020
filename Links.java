public class Links{
	private int size;
	private Node top;
	Links(){
		size = 0;
		top = null;
	}
	public void push(int data){
		Node temp = new Node();
		temp.setData(data);
		if (top == null){
			/* insert as first node */
			top = temp;
		}
		else{
			/* insert new node at front of list */
			temp.setNext(top);
			top = temp;
		}
		size++;
	}
	public int pop(){
		int res = 0;
		/* remove the head element */
		if (size == 0){
			System.out.println("#stack is empty...");
		}
		else{
			Node temp = top;
			top = temp.getNext();
			temp.setNext(null);
			size--;
			res = temp.getData();
		}
		return res;
	}
	public int peek(){
		int res = 0;
		/* just return the head element without removing it */
		if (size == 0){
			System.out.println("#stack is empty...");
		}
		else{
			res = top.getData();
		}
		return res;
	}
	public void display(){
		Node current = top;
		while(current != null){
			System.out.print(current.getData() + "->");
			current = current.getNext();
		}
		System.out.println("null");
	}
	public int size(){
		return this.size;
	}
}