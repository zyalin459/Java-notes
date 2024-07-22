package Basic.exception;

class OpenException extends Exception { }
class CloseException extends OpenException { }
class NewException extends Exception {}

public class ArrayIndex {
    public ArrayIndex() throws OpenException {}
    public void f() throws OpenException {}
    public static void main(String[] args) {
    }
}

class NewClass extends ArrayIndex {
    public NewClass() throws OpenException, NewException {}
    public void f() throws OpenException {}
    public static void main(String[] args) {
        try {
            ArrayIndex p = new NewClass();
            p.f();
        } catch (OpenException e) {
            throw new RuntimeException(e);
        } catch (NewException e) {
            throw new RuntimeException(e);
        }
    }
}
