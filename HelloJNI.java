public class HelloJNI {
   static {
		java.io.File lib = new java.io.File("cpp/compiled/" + System.mapLibraryName("hello"));
		System.load(lib.getAbsolutePath());
   }
 
   private native void sayHello();
   private native int add(int a,int b);
   //private native void start(String[] args);
 
   public static void main(String[] args) {
	  HelloJNI h = new HelloJNI();
	  h.sayHello();
	  System.out.println(h.add(2,3));
   }
}