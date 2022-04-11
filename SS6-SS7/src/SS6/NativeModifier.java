package SS6;
/* 
    @author : Dinh Quang Anh
    Date: 2022/09/04
*/

public class NativeModifier {
    native void nativeMethod(); // Declaration of a native method
    /*
    * static code block to load the library
    */
    static {
        System.loadLibrary("NativeMethodDefinition");
    }
    /*
    * param args the command line agruments
    */

    public static void main(String[] args) {
        NativeModifier objNative = new NativeModifier(); // Line 1
        objNative.nativeMethod(); // line 2
    }
}
