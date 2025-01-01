package packageA;
public class ClassB {
    private ClassA a;

    public ClassB(){
        a = new ClassA();
        a.defaultMethod();
        a.protectedMethod();
        a.publicMethod();
        // a.privateMethod();
    } 
}
