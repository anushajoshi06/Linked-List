/*Eliminate duplicates from LL

Given a sorted linked list (elements are sorted in ascending order). Eliminate duplicates from the given LL, such that output LL contains only unique elements.
You don't need to print the elements, just remove duplicates and return the head of updated LL.
Input format : Linked list elements (separated by space and terminated by -1)

Sample Input 1 :
1 2 3 3 3 4 4 5 5 5 7 -1
Sample Output 1 :
1 2 3 4 5 7
*/



/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */

public class Solution {
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
      if((head == null) ||(head.next==null))
			return null;
      LinkedListNode<Integer> t1=head;
      LinkedListNode<Integer> t2=head.next;
      
      while(t2!=null)
      {
       if(t1.data.equals(t2.data)){
         t2=t2.next;
         
         }
        
        else{
          t1.next=t2;
          t1=t2;
          t2=t2.next;
        }
      }
      t1.next=t2;
        return head;
    }
}