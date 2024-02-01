import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Inven {
   static HashMap<String, ArrayList<Integer>> items = new HashMap<>();
    public void additem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the items:");
        String item = scanner.next();
        System.out.println("Quantity");
        int n = scanner.nextInt();
        System.out.println("Minimum stock required");
        int min = scanner.nextInt();
        ArrayList s = new ArrayList<>();
        s.add(n);
        s.add(min);
        items.put(item, s);
        System.out.println("Item is added");
    }
    public void removeitem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the items:");
        String item = scanner.next();
        System.out.println("Quantity to remove");
        int n = scanner.nextInt();
        if(items.containsKey(item)){
            ArrayList<Integer> a = items.get(item);
            if(a.get(0)-n<a.get(1)){
                System.out.println("Out of Stock");
            } else{
                a.set(0,a.get(0)-n);
                items.put(item,a);
            }

        }
        System.out.println(n+ " "+item + "s are removed");
        System.out.println(items.get(item) +" ");
    }
    public void viewitems(){
        if(items.isEmpty()){
            System.out.println("Sorry, We are out of items ");
        }
        items.entrySet().forEach(entry -> {
            System.out.println(entry.getKey()+"-> Quantity "+entry.getValue().get(0)+"-> Minimum Stock : "+entry.getValue().get(1));
        });
    } public void setminstock() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the items:");
        String item = scanner.next();
        System.out.println("Minimum stock to update: ");
        int n = scanner.nextInt();
        if(items.containsKey(item)){
            ArrayList<Integer> a = items.get(item);
            a.set(1,n);
            items.put(item,a);
        }

    } public void updatequantity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the items:");
        String item = scanner.next();
        System.out.println("Quantity to add:");
        int n = scanner.nextInt();
        if(items.containsKey(item)){
            ArrayList<Integer> a = items.get(item);
            a.set(0,a.get(0)+n);
            items.put(item,a);
        }
        System.out.println("Item is updated");
        System.out.println(item + "->value -> "+ items.get(item).get(0)+ "->Minimum stock -> "+items.get(item).get(1));
    }
}
