/**
 Test list features.
 */
public class UserOfList {
    
	private static List_inArraySlots list;

    public static void main( String[] args ) {
        list = new List_inArraySlots();
		

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        // Populate the list with diverse elements.
        list.add(3.14);
		list.add("piazza");
		list.add(6.28);
		list.add("pi");
		list.add(256);
		list.add(Double.POSITIVE_INFINITY);
		list.add("tau");
		list.add("pizza");
		list.add(1e4);
		list.add(Double.NEGATIVE_INFINITY);
		
		System.out.println(list);
		
		System.out.println(Accumulator.catElementsStartingWith(list, "pi"));
		System.out.println(Accumulator.finites(list));
		
    }
}
