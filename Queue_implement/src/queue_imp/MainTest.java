package queue_imp;

public class MainTest {

	public static void main(String[] args) {
		QueueImplement a = new QueueImplement(3);
		a.insert(14);
		a.insert(26);
		a.insert(57);
		a.insert(55);
		a.delete();
		a.delete();
		a.insert(46);
	}
}
