package DAY_10.dataStructures.linear.linkedList.problems.evenOddLinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class EvenOdd {
    static Node head;
    static void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static void printEven(){
        Node temp = head;
        while(temp != null){
            if(temp.data%2 == 0){
                System.out.print(temp.data+ " ");
            }
            temp = temp.next;
        }
    }

    static void printOdd(){
        Node temp = head;
        while(temp != null){
            if(temp.data%2 != 0){
                System.out.print(temp.data+ " ");
            }
            temp = temp.next;
        }
    }

    static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of node: ");
        int n = sc.nextInt();
        System.out.println("Enter the "+n+" nodes of the list");
        for(int i=0; i<n; i++){
            insert(sc.nextInt());
        }
        System.out.print("originalList: ");
        display();
        System.out.print("Even numbers: ");
        printEven();
        System.out.print("Odd numbers: ");
        printOdd();
    }
}
