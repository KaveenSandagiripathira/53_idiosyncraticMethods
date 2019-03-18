# idiosyncraticMethods
by Kaveen Sandagiripathira and Rachael Cheung
initial version by Kyra Gunluk

## List_inArraySlots Class
#### Fields:
```
private Object[] list = new Object[5]; // array of objects to represent a list with different types 

private int filledElements; // the number of elements in this list
```

#### Constructor(s):
```
/** Constructor that: 
      -initiates Object array to contain 5 elements
      -sets filledElements to 0 */
public List_inArraySlots ()
```

#### Methods:
``` 
// Returns the number of elements in the list (not the capacity)
public int size() 

// Returns a String representation of the list (not including null elements)
public String toString()

// Returns element at a specific index from this list
public Object get(int index)

// Appends an element, "input", to the end of the Object array
public boolean add( Object input)

// Doubles the capacity of the list, preserving existing data
private void expand()

```

## UserOfList class:
- Creates an instance of List_inArraySlots
- uses add() method of List_inArraySlots to populate the list with diverse elements
- tests methods in Accumulator

## Accumulator class:
- a new object type that can be added to the "list" in List_inArraySlots
#### Methods:
``` 
//returns the concatenation of all String in the list that begin with prefix (followed by a space)
public static String catElementsStartingWith(List_inArraySlots list, String prefix)

//returns a list of each of the Double elements from the list whose value is finite
public static List_inArraySlots finites(List_inArraySlots list)
```


