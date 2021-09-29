/**
    A class of stacks whose entries are stored in an array.
    @author Frank M. Carrano and Timothy M. Henry
    @version 5.0
*/
public final class ResizableArrayStack<T> implements StackInterface<T>
{
	private T[] stack;    // Array of stack entries
	private int topIndex; // Index of top entry
   private boolean integrityOK = false;
	private static final int DEFAULT_CAPACITY = 50;
	private static final int MAX_CAPACITY = 10000;
  
   public ResizableArrayStack()
   {
      this(DEFAULT_CAPACITY);
   } // end default constructor
  
   public ResizableArrayStack(int initialCapacity)
   {
      integrityOK = false;
      checkCapacity(initialCapacity);
      
      // The cast is safe because the new array contains null entries
      @SuppressWarnings("unchecked")
      T[] tempStack = (T[])new Object[initialCapacity];
      stack = tempStack;
		topIndex = -1;
      integrityOK = true;
  } // end constructor
  
  public void push(T newEntry) {
     
  }

  public T pop() {
     return null;
  }

  public T peek() {
     return null;
  }

  public boolean isEmpty() {
     return false;
  }

  public void clear() {
     
  }
//  < Implementations of the private methods go here; checkCapacity and checkIntegrity
//    are analogous to those in Chapter 2. >
//  . . .
  private void checkCapacity(int a){

  }

  private boolean checkIntegrity(){
     return false;
  }

  private void doubleCapacity(){
     
  }
} // end ResizableArrayStack
