/*
class Node{
  int data;
  Node next;
  
  public Node(int data,int frequency){
    this.data = data;
    this.frequency = frequency;
  }
  Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/

class Solution{
  public static Node frequencyLinkedList(int[] arr, int n){
    //write your code here.
    Arrays.sort(arr);
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    for(int num : arr){
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
    }
    Node head = null;
    Node curr = null;
    
    for(int num : arr){
        if(frequencyMap.containsKey(num)){
            if(head == null){
                head = new Node(num, frequencyMap.get(num));
                curr = head;
            }
            else{
                curr.next = new Node(num, frequencyMap.get(num));
                curr = curr.next;
            }
            frequencyMap.remove(num);
        }
    }
    return head;
  }
}
