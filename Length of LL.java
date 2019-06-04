/*Length of LL

Given a linked list, find and return the length of input LL. Do it iteratively.
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

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {

	public static int length(LinkedListNode<Integer> head){
		
		int count=0;
      LinkedListNode<Integer> temp=head;
      while(temp!=null){
        count++;
        temp=temp.next;
      }
      
      return count;
     
     // return head==null ? 0 : 1+ length(head.next);
	}
}