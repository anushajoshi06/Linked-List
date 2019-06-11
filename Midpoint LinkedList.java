/*Midpoint LinkedList

Given a linked list, find and return the midpoint.
If the length of linked list is even, return the first mid point.
Input format : Linked list elements (separated by space and terminated by -1)`

Sample Input 1 :
1 2 3 4 5 -1
Sample Output 1 :
3
Sample Input 2 :
1 2 3 4 -1
Sample Output 2 :
2
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
	public static int printMiddel(LinkedListNode<Integer> head) {
      LinkedListNode<Integer> current = head;
      int length = 0;
      LinkedListNode<Integer> middle = head;
    
      while(current.next != null){
          length++;
          if(length%2 ==0){
              middle = middle.next;
          }
          current = current.next;
      }
    
      if(length%2 == 1){
          middle = middle;
      }

     
       return middle.data;
      


    }
}