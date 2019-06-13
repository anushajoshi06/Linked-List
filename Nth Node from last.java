/*Nth Node from last

Given a linked list and an integer n you need to find and return the nth node from last without calculating length of input linked list.
Return null if length of LL is smaller than n.
Counting of nodes starts from 0.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer n 
Output format :
nth node from last
Sample Input 1 :
3 4 5 2 6 1 9 -1
0
Sample Output 1 :
9
Sample Input 2 :
3 4 5 2 6 1 9 -1
4
Sample Output 2 :
5
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

	public static LinkedListNode<Integer> nthNodeFromLastIter(LinkedListNode<Integer> head, int n){
		
	int len = 0;
        LinkedListNode<Integer> temp = head;
 
        // 1) count the number of nodes in Linked List
        while (temp != null)
        {
            temp = temp.next;
            len++;
        }
        len = len -1;
        // check if value of n is not more than length of
        // the linked list
        if (len < n)
            return null;
 
        temp = head;
 
        // 2) get the (len-n+1)th node from the begining
        for (int i = 1; i < len-n+1; i++)
            temp = temp.next;
 
        return (temp);		
	}
  
}