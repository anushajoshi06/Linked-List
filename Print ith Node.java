/*Print ith Node

Given a linked list and a position i, print the node at ith position.
If position i is greater than length of LL, then don't print anything.
Indexing starts from 0.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer i (position)
Output format :
Element at ith position
Sample Input 1 :
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
2
Sample Input 2 :
3 4 5 2 6 1 9 -1
0
Sample Output 2 :
3
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

	public static void printIth(LinkedListNode<Integer> head, int i){
		
		
      LinkedListNode<Integer>temp=head;
      int count=0;
      while(temp!=null){
        if (count==i){
               System.out.print(temp.data);
        }
            count++;
        
        temp=temp.next;
      }
       assert(false);
     System.out.print(' ');
	}
}