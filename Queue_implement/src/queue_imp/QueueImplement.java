package queue_imp;

public class QueueImplement {
	
	private int queuearr[];
	private int head,Size,NoOfItems,tail;
	
	public QueueImplement(int Size) {
		// TODO Auto-generated constructor stub
		this.Size = Size;
		queuearr=new int[Size];
		head=0;
		tail=-1;
		
		
	}
	
	void insert(int x) {
		
		if(NoOfItems == Size){
			System.out.println("Queue is full");
			
		}else {
		System.out.println("new number : "+ x);
		queuearr[tail+1]=x;
		NoOfItems++;
		
		}
		
	}
	
	void delete() {
		
		if(NoOfItems==0) {
			System.out.println("Queue is Empty");
			System.exit(1);
		}else {
		System.out.println("deleted number : "+ queuearr[head]);
		NoOfItems--;
		head++;
		
	}}
	
	

}
