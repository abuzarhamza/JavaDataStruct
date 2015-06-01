import Array.UnsortedArray;

public class App {
	
 public static void main(String[] args) {
	 //creating an unsorted array 
	 int maxSize =100;
	 
	 UnsortedArray arr;
	 arr = new UnsortedArray(maxSize);
	 
	 arr.insert(22);
	 arr.insert(1);
	 arr.insert(5);
	 arr.insert(10);
	 arr.insert(4);
	 arr.insert(9);
	 
	 arr.display();
	 int searchKey = 5;
	 if (arr.find(searchKey) == true) {
		 System.out.println("The key was found : " + searchKey);
	 
	 }
	 else {
		 System.out.println("The key was not found : " + searchKey);
	 }
	 
	 arr.delete(4);
	 arr.display();
 }
 
 
}
