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
		String temp;
        for (int pos = 0; pos < list.size(); pos ++){
			element = list.get(pos);
            /* 3.  Stumbling block 0
               Java protects a programmer against applying a method to
               elements in list when some elements of the list might
               omit support for a particular operation.

               This protection is implemented by the compiler (compiler? JVM?)
               The following code violates the restriction:
              */
		
            // element.startsWith(prefix);

            /*
             predicted error message:
			cannot find symbol startsWith in Object

             actual error message:
			 error: cannot find symbol
                                element.startsWith(prefix);
             */


            /* 4.  Workaround 0
               A programmer should expect there to be a way to
               work around the stumbling block, because
               the JVM (compiler? JVM?)
               knows the type of an element.

               Java's instanceof operator identifies the type
               of an element to the JVM (compiler? JVM?).
             */


            /* 5.  Stumbling block 1
               However, use of the operator alone is insufficient,
               because the compiler (compiler? JVM?)
               objects to the following code that adds use of
               the operator to the code from Stumbling block 0:
             */

            // 			if (element instanceof String){ element.startsWith(prefix)

            /*
             predicted error message: cannot find symbol startsWith in Object

             actual error message: error: cannot find symbol
                                element.startsWith(prefix);
             */


            /* 6. Workaround 1
               Programmers use Java's cast operator
               to tell the compiler (compiler? JVM?)
               that code uses a subclass's method on an object,
               even though the reference to the object is stored
               in a super-class variable.
             */


            /* 7. Stumbling block 2
               However, use of this operator alone is insufficient,
               because the JVM (compiler? JVM?)
               objects to the following code that adds use of
               the operator to the code from Stumbling block 0:
             */

            // if (((String)element).startsWith(prefix))

            /*
             predicted error message: The cast from object to string is not always applicable.

             actual error message:	     
			 java.base/java.lang.Double cannot be cast to java.base/java.lang.String
	at Accumulator.catElementsStartingWith(Accumulator.java:107)
	at UserOfList.main(UserOfList.java:29)
             */


            /* 8. Workaround 2
               A programmer can combine use of both operators
               to apply a method to exactly those
               elements in the list that support the method.
             */

            // [working code here, finally]
			if (element instanceof String){  //if the element is of string type
				temp = (String)element;      //element that is an object type is casted to string type
				if(temp.startsWith(prefix))  //startsWith() method is unique to String class
					result += temp + " ";
			}	
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
