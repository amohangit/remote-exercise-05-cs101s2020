public class StackDriver{
	public static void main(String[] args){
		Links link = new Links();
		link.push(10);
		link.push(20);
		link.push(30);
		link.push(40);
		link.push(50);
		link.display();
		System.out.println("popped:" + link.pop());
		link.display();
		System.out.println("peeked:" + link.peek());
		link.display();




	}
}