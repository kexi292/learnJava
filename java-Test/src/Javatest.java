import java.util.*;
public class Javatest {
	
	
	public static void travese(ListNode ans) {
		if(ans == null) {
			return;
		}
		travese(ans.next);
		System.out.println(ans.val);
	}
	
	public static void main(String[] args) {
		ListNode list = new ListNode(0);
		ListNode cur = list;
		for(int i = 1; i< 10;i++) {
			cur.next = new ListNode(i);
			cur = cur.next;
		}
		travese(list);
	}
}

class ListNode{
	int val;
	ListNode next;
	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}





