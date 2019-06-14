/*AppendLastNToFirst

Given a linked list and an integer n, append the last n elements of the LL to front.
Indexing starts from 0. You don't need to print the elements, just update the elements and return the head of updated LL.
Assume given n will be smaller than length of LL.
Input format :

Line 1 : Linked list elements (separated by space and terminated by -1)`

Sample Input 1 :
1 2 3 4 5 -1
3
Sample Output 1 :
3 4 5 1 2
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
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {
        LinkedListNode<Integer>prev,curr;

        curr = root;

        for (int i = 0; i < n; i++) {

                curr = curr.next;

                if (curr == null)

                        return null;

        }

        prev = root;

        while (curr.next != null) {

                curr = curr.next;

                prev = prev.next;

        }

        curr.next = root;

        root = prev.next;

        prev.next = null;
        return root;

    }
}
