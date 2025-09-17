/*
VariableHidingDemo.java

Purpose:
 - Demonstrates "variable hiding" (fields with the same name in a class hierarchy).
 - Shows how local variables, this.k, super.k and casts like ((B)this).k access different fields.

How to use (VS Code / terminal):
 1) Save this file as VariableHidingDemo.java
 2) Open a terminal in the same folder (VS Code: View → Terminal)
 3) Compile:    javac VariableHidingDemo.java
 4) Run:        java VariableHidingDemo

Expected output (exact order):
Local q is: 50
p of D is: 40
z of C is: 30
y of B is: 20
x of A is: 10
Local k is: 52
k of D (this.k) is: 42
k of C (super.k) is: 32
k of B (((B)this).k) is: 22
k of A (((A)this).k) is: 12

Explanation summary (read detailed comments below):
 - A, B, C, D all declare a field named `k`. Each declaration hides the `k` of its parent.
 - Inside D.test() we declare a local variable `k` (52). That local `k` shadows the field name `k` inside the method.
 - Use `this.k` to refer to D's field, `super.k` to refer to immediate parent's field (C.k), and casts like `((B)this).k` or `((A)this).k` to refer to B.k or A.k respectively.
 - Field access in Java is resolved based on the compile-time type of the expression (fields are not polymorphic), which is why casting changes which `k` is selected.

--- CODE ---
*/

public class VariableHidingDemo {
    public static void main(String[] args) {
        D d = new D();
        d.test();
    }
}

// Parent-most class
class A {
    int x = 10;
    int k = 12; // A's k
}

// B extends A and hides 'k'
class B extends A {
    int y = 20;
    int k = 22; // B's k (hides A.k)
}

// C extends B and hides 'k' again
class C extends B {
    int z = 30;
    int k = 32; // C's k (hides B.k)
}

// D extends C and hides 'k' again
class D extends C {
    int p = 40;
    int k = 42; // D's k (hides C.k)

    public void test() {
        int q = 50;  // local variable (method scope)
        int k = 52;  // local variable named 'k' — hides all fields named 'k' inside this method when accessed by simple name

        // Prints a few fields from different ancestors and local variables
        System.out.println("Local q is: " + q);
        System.out.println("p of D is: " + p); // direct field from D
        System.out.println("z of C is: " + z); // inherited from C
        System.out.println("y of B is: " + y); // inherited from B
        System.out.println("x of A is: " + x); // inherited from A

        // Demonstrating how the name `k` resolves differently depending on how we access it
        System.out.println("Local k is: " + k);               // local method variable -> 52
        System.out.println("k of D (this.k) is: " + this.k); // field of current class D -> 42
        System.out.println("k of C (super.k) is: " + super.k); // immediate parent C's field -> 32

        /*
           Casting `this` to an ancestor type and accessing .k uses the compile-time type of the expression
           ((B)this).k  -> compile-time type is B, so the field resolved is B.k (22)
           ((A)this).k  -> compile-time type is A, so the field resolved is A.k (12)
           Note: fields are not polymorphic; methods are.
        */
        System.out.println("k of B (((B)this).k) is: " + ((B)this).k);
        System.out.println("k of A (((A)this).k) is: " + ((A)this).k);

        // Extra note: if you try to use `super` beyond one level (like super.super.k) it is not allowed in Java.
        // You must use casting as shown above if you want to reach a grandparent's field.
    }
}

/*
Detailed notes (read after running):
1) "Variable hiding" occurs when a subclass declares a field with the same name as a field in one of its superclasses.
   The superclass field is not removed — it is hidden. Both fields exist separately.

2) Inside methods, a local variable with the same name hides the field in that scope. That is why "k" prints the local 52.

3) Accessing fields:
   - simple name (k) resolves to the closest visible declaration in the current scope (here: local variable k = 52)
   - this.k resolves to this object's field declared in the current class (D.k = 42)
   - super.k resolves to the immediate parent's field (C.k = 32)
   - ((B)this).k resolves to B.k because the compile-time type of ((B)this) is B
   - ((A)this).k resolves to A.k for the same reason

4) Why fields are not polymorphic:
   - For methods, Java selects the overriding method at runtime (dynamic dispatch).
   - For fields, the compiler uses the compile-time type of the expression to decide which field to access.

5) If you want a quick demonstration of method polymorphism vs field hiding, add a method in A like:

   class A { int k = 12; int getK(){ return k; } }
   class D extends C { int k = 42; @Override int getK(){ return k; } }

   Then calling ((A)d).getK() will invoke D's getK() at runtime and return D.k (42). But ((A)d).k will return A.k (12).

If you want, I can:
 - split every class into separate .java files (A.java, B.java...) and show how to compile/run them,
 - create a ready zip you can download,
 - add interactive comments or additional exercises (e.g., try commenting out certain declarations to see the effect).
*/
