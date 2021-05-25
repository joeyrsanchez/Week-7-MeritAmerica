package week6;

public class ExpandableArray {
	
	//Instance variables
	String[] names;
	private ExpandableArray myList;
	

// Constructor
public ExpandableArray() {
	myList = null;
	String value = (String) myList.get(14);
	if (value != null) {
	System.out.println("Got value: " + value);
	}
}

// Sets the element at the given index position to the specified.
// value. If the internal array is not large enough to contain that
//  element, the implementation expands the array to make room.

public void set(int index, Object value) {
	ExpandableArray myList = new ExpandableArray();
	myList.set(14, "Bob");
	myList.set(21, "Sally");

}

// Returns the element at the specified index position, or null if
// no such element exists. Note that this method never throws an
// out-of-bounds exception; if the index is outside the bounds of
// the array, the return value is simply null.

public Object get(int index) {
	
	String value = (String) names[index]; 
	if (value != null) {
	System.out.println("Got value: " + value);
	}
    return value;
 }
}
