/**
 * 
 * @author Pavan_Chitluri
 *
 */

public class MyMHashMap {
	// for simplicity size is taken as 2^4
	private static final int SIZE = 16;
	private Entry table[] = new Entry[SIZE];

	
	private int getSupplementalHash(int h) {
		// This function ensures that hashCodes that differ only by
		// constant multiples at each bit position have a bounded
		// number of collisions (approximately 8 at default load factor).
		h ^= (h >>> 20) ^ (h >>> 12);
		return h ^ (h >>> 7) ^ (h >>> 4);
	}

	
	private int getBucketNumber(int hash) {
		return hash & (SIZE - 1);
	}

	
	public void put(Employee key, String value) {
		// get the hashcode and regenerate it to be optimum
		int userHash = key.hashCode();
		System.out.println(" user hash "+userHash);
		int hash = getSupplementalHash(userHash);

		// compute the bucket number (0-15 based on our default size)
		// this always results in a number between 0-15
		int bucket = getBucketNumber(hash);
		Entry existingElement = table[bucket];

		for (; existingElement != null; existingElement = existingElement.next) {

			if (existingElement.key.equals(key)) {
				System.out.println("duplicate key value pair, replacing existing key " + key + ", with value " + value);
				existingElement.value = value;
				return;
			} else {
				System.out.println("Collision detected for key " + key + ", adding element to the existing bucket");

			}
		}

		//
		System.out.println("PUT adding key:" + key + ", value:" + value + " to the list");
		Entry entryInOldBucket = new Entry(key, value, userHash);
		entryInOldBucket.next = table[bucket];
		table[bucket] = entryInOldBucket;
	}

	/**
	 * Returns the entry associated with the specified key in the HashMap. Returns
	 * null if the HashMap contains no mapping for the key.
	 */
	public Entry get(Employee key) {
		// get the hashcode and regenerate it to be optimum
		int hash = getSupplementalHash(key.hashCode());

		// compute the bucket number (0-15 based on our default size)
		// this always results in a number between 0-15
		int bucket = getBucketNumber(hash);

		// get the element at the above bucket if it exists
		Entry existingElement = table[bucket];

		// if bucket is found then traverse through the linked list and
		// see if element is present
		while (existingElement != null) {
			System.out.println("Traversing the list inside the bucket for the key " + existingElement.getKey());
			if (existingElement.key.equals(key)) {
				return existingElement;
			}
			existingElement = existingElement.next;
		}

		// if nothing is found then return null
		return null;
	}

	// for testing our own map
	public static void main(String[] args) {
		MyMHashMap tmhm = new MyMHashMap();

		System.out.println("============== Adding Element ===================");
		Employee e1 = new Employee(100, "Pavan");
		tmhm.put(e1, "dept1");
		
		Entry entry = tmhm.get(e1);
		Employee e2 = new Employee(101, "Pavan");
		tmhm.put(e2, "dept1");
		
		Employee e3 = new Employee(102, "Pavan");
		tmhm.put(e3, "dept1");
		
		System.out.println(" Key: "+entry.getKey()+ " Value: "+entry.getValue());

		// duplicate
		/*System.out.println("============== Adding Duplicate ===================");
		Employee e1_dup = new Employee(100, "Niranjan");
		tmhm.put(e1_dup, "dept12");
		// the above value "dept12" should replace the old value "dept1"
		Entry e = tmhm.get(e1_dup);
		System.out.println("GET element - " + e.getKey() + "::" + e.getValue());

		System.out.println("============== Adding Elements ===================");
		Employee e2 = new Employee(102, "Sravan");
		tmhm.put(e2, "dept3");

		Employee e3 = new Employee(104, "Ananth");
		tmhm.put(e3, "dept2");

		Employee e4 = new Employee(106, "Rakesh");
		tmhm.put(e4, "dept5");

		Employee e5 = new Employee(108, "Shashi");
		tmhm.put(e5, "dept2");

		// collision with e2
		System.out.println("============== Adding Collisions ===================");
		Employee e2_collision = new Employee(112, "Chandu");
		tmhm.put(e2_collision, "dept16");
		e = tmhm.get(e2_collision);
		System.out.println("GET element - " + e.getKey() + "::" + e.getValue());

		// collision with e3
		Employee e3_collision = new Employee(114, "Santhosh");
		tmhm.put(e3_collision, "dept9");
		e = tmhm.get(e3_collision);
		System.out.println("GET element - " + e.getKey() + "::" + e.getValue());

		System.out.println("============== Adding Duplicate in Collision ===================");
		Employee e3_collision_dupe = new Employee(124, "Santhosh");
		tmhm.put(e3_collision_dupe, "dept91");
		e = tmhm.get(e3_collision_dupe);
		System.out.println("GET element - " + e.getKey() + "::" + e.getValue());
*/
	}
}

class Entry <K, V> {
	K key;
	V value;
	long hashCode;
	Entry<K, V > next;
	
	
	
	public Entry(K key, V value, long hashCode) {
		this.key = key;
		this.value = value;
		this.hashCode = hashCode;
	}
	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}
	/**
	 * @return the hashCode
	 */
	public long getHashCode() {
		return hashCode;
	}
	/**
	 * @param hashCode the hashCode to set
	 */
	public void setHashCode(long hashCode) {
		this.hashCode = hashCode;
	}
	/**
	 * @return the next
	 */
	public Entry<K, V> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Entry<K, V> next) {
		this.next = next;
	}
	
}