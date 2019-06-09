/*Length Recursively

Given a linked list, find and return the length of input LL recursively.
Input format :
Linked list elements (separated by space and terminated by -1)
Output format :
Length of LL
Sample Input :
3 4 5 2 6 1 9 -1
Sample Output :
7
*/

/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public Node(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {

	public static int length(LinkedListNode<Integer> head){
		
		return head==null ? 0 : 1+ length(head.next);
	}
}