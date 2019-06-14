/*Even after Odd LinkedList

Arrange elements in a given Linked List such that, all even numbers are placed after odd numbers. Respective order of elements should remain same.
You don't need to print the elements, instead return the head of updated LL.
Input format : Linked list elements (separated by space and terminated by -1)`

Sample Input 1 :
1 4 5 2 -1
Sample Output 1 :
1 5 4 2 
Sample Input 2 :
1 11 3 6 8 0 9 -1
Sample Output 2 :
1 11 3 9 6 8 0
*/


/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}



}
* */
public class Solution {
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
LinkedListNode<Integer>current=head;
		LinkedListNode<Integer>evenHead=null;
		LinkedListNode<Integer>oddHead=null;
		LinkedListNode<Integer>evenTail=null;
	    LinkedListNode<Integer>oddTail=null;
		while(current!=null)
		{
			if(current.data%2==0)
			{
				if(evenHead==null)
				{
					evenHead=evenTail=current;
				}
				else
				{
					evenTail.next=current;
					evenTail=current;
				}
			}
			else
			{
				if(oddHead==null)
				{
					oddHead=oddTail=current;
				}
				else
				{
					oddTail.next=current;
					oddTail=current;
				}
			}
			current=current.next;
		}
		oddTail.next=evenHead;
		evenTail.next=null;
		return oddHead;
	}
}
