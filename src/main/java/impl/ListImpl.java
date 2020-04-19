package impl;

import model.Llist;
import model.Node;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class ListImpl {

    private static final Logger LOGGER = LoggerFactory.getLogger(ListImpl.class);

    public ListImpl(){

    }


    /*
    * 1. isEmpty() will check if list is empty or not;
    * 2. size() return size of the linked list
    * 3. add(node) add element to the list
    * 4. delete(node) delete element from the list
    * */

    public Boolean isEmpty(Llist list){
        return list.getHead() == null;
    }

    public int size(Llist list){
        if(list.getHead() == null)
            return 0;

        Node head = list.getHead();

        int size = 0;
        while(head != null){
            size += 1;
            head = head.getNext();
        }

        return  size;

    }
    /*
     * 1.addition at the beginning;
     * 2.addition at the end;
     * 3. addition in the middle
     *
     * */
    public Llist add(Llist list, Node node, int pos){
        if(list.getHead() == null){
            list.setHead(node);
            return list;
        }
        int loopCounter = 1;

        Node head = list.getHead();
        Node prev = head;
        while(head != null && loopCounter != pos ){
            loopCounter++;
            prev = head;
            head = head.getNext();
        }
        if(loopCounter == pos){
            node.setNext(head);
            prev.setNext(node);

        }else{
            LOGGER.debug("invalid position : " + pos);
        }
        return list;

    }

    public Llist delete(Llist list, int pos){
        if(list.getHead() == null){
            LOGGER.warn("empty list");
        }
        Node prev = list.getHead();
        Node head = list.getHead();

        int loopcount = 1;

        while(head != null && loopcount != pos){
            loopcount++;
            prev = head;
            head = head.getNext();
        }
        if(loopcount == pos){
            prev.setNext(head.getNext());
            head.setNext(null);
        }else{
            LOGGER.info("invalid info {}", pos);
            LOGGER.debug("invalid info : {}",pos);
            LOGGER.error("invalid info : {}",pos);
            LOGGER.warn("invalid position : " + pos);
        }
        return list;
    }

    public void print(Llist list){
        Node head = list.getHead();
        while(head != null){
            System.out.println(head.getData() + ", ");
            head = head.getNext();
        }
    }

    public boolean search(Llist list, int data){
        LOGGER.info("-------- searching {} --------", data);
        if(list.getHead() == null){
            LOGGER.warn("empty list");
            return false;
        }
        Node head = list.getHead();
        while(head != null && head.getData() != data){
            head = head.getNext();
        }
        if(head != null){
            LOGGER.debug("element found");
            return true;
        }else{
            LOGGER.debug("element not found");
            return false;
        }
    }

}
