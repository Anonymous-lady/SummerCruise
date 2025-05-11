public class testDynamicArray
{
    public static void main(String[] args){
        DynamicArray da = new DynamicArray(5);
        
        da.add("A");
        da.add("B");
        da.add("C");
        da.add("D");
        da.add("E");
        da.add("F");
        
        //da.insert(0, "X");
        da.delete("A");
        da.delete("B");
        da.delete("C");
        //System.out.println(da.search("C"));
        System.out.println(da);
        System.out.println("size: " + da.size);
        System.out.println("capacity: " + da.capacity);
        System.out.println("empty: " + da.isEmpty());
    }
}
