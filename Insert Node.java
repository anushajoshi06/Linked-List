/*Insert Node

Given a linked list, an integer n and a position i, insert that node n into Linked List at ith position.
If position i is greater than length of LL, you should return the same LL without any change.
Indexing starts from 0. You don't need to print the elements, just insert and return the head of updated LL.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer i (position)
Line 3 : Integer n (Node to be inserted)
Output format :
Updated LL elements (separated by space)
Sample Input 1 :
3 4 5 2 6 1 9 -1
3
100
Sample Output 1 :
3 4 5 100 2 6 1 9
Sample Input 2 :
3 4 5 2 6 1 9 -1
0
20
Sample Output 2 :
20 3 4 5 2 6 1 9
*/

/*************** 
 * Following is the Node class already written 
class Node<T> {
	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}
}
***************/

public class Solution {
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
		
   
      if(pos==0){
        Node<Integer> newNode=new Node<Integer>(data);
        newNode.next=head;
        return newNode;
      }
      if(head==null){
        return head;
      }
      head.next=insert(head.next,data,pos-1);
		return head;
	}
}