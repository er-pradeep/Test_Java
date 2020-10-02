package hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainingHashTable {
    private LinkedList<StoredEmployee> [] hashtable;
    public ChainingHashTable(){
        hashtable = new LinkedList[10];
        for(int i =0;i<hashtable.length;i++){
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put (String key, Employee e){
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key,e));
    }

    public Employee remove (String key){
        int hashedKey = hashKey(key);
        LinkedList<StoredEmployee> linkedList= hashtable[hashedKey];
        ListIterator<StoredEmployee> iterator = linkedList.listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while(iterator.hasNext()){
            employee = iterator.next();
            index++;
            if(employee.key.equals(key))
                break;
        }
        if(employee == null){
            return  null;
        }else{
            hashtable[hashedKey].remove(index);
            return employee.employee;
        }
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> listIterator  = hashtable[hashedKey].listIterator();
        StoredEmployee emp = null;
        while(listIterator.hasNext()){
            emp = listIterator.next();
            if(emp.key.equals(key)){
                return  emp.employee;
            }
        }
        return  null;
    }

    public void printHashTable(){
        for(int i =0;i< hashtable.length ; i++ ){
            if(hashtable[i].isEmpty()){
                System.out.println("Position "+ i + " is empty");
            }else{
                System.out.print("Position "+ i +" : empty");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while(iterator.hasNext()){
                    System.out.print(iterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }
    public int hashKey(String key){
        return Math.abs(key.hashCode() % hashtable.length);
    }
}
