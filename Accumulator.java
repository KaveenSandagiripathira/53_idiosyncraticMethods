/**
  Represent accumulating data from the elements in a
  List_inArraySlots that are of a particular type.
 */

public class Accumulator {

    /**
      @return the concatenation of all the Strings
      in the \list that begin with \prefix,
      each followed by a space.
     */
    public static String catElementsStartingWith(
        List_inArraySlots list
      , String prefix
      ) {
        String result = "";
		Object element;
        for (int pos = 0; pos < list.size(); pos ++){
			element = list.get(pos);
			if (element instanceof String && (String.valueOf(element)).startsWith(prefix))
				//Bit weird using String.valueOf(element) which only works because valueOf by default
				//is defined by the Object parameter)
				result += element + " ";
		}			
        return result; 
    }
	


    /**
      @return a list of each of the Double elements
      from the \list whose value is "finite".
     */
    public static List_inArraySlots finites(List_inArraySlots list) {
		List_inArraySlots result = new List_inArraySlots();
		Object element;
		Double temp;
        for (int pos = 0; pos < list.size(); pos ++){
			element = list.get(pos);
			if (element instanceof Double){
				temp = (Double)element;
				if (!temp.isInfinite())
					result.add(temp);
			}
		}
		return result;		
    }
}
