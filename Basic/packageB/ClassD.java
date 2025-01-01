package packageB;

import packageA.ClassA;
public class ClassD {
    private ClassA a;

    public ClassD(){
        a = new ClassA();
        // a.defaultMethod();
        // a.protectedMethod();
        a.publicMethod();
        // a.privateMethod();
    }   
}
