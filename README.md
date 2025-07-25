# 📘 Java Notes by Sambhu Sir

This document contains quick concepts and important Java fundamentals explained by Sambhu Sir.

---

## ✅ 1. Default Values of Variables

In Java, every **class-level variable** (static or non-static) has a default value if not explicitly initialized.

| Data Type       | Default Value |
|------------------|---------------|
| `int`            | `0`           |
| `double`         | `0.0`         |
| `boolean`        | `false`       |
| `String`         | `null`        |
| Non-primitive    | `null`        |

📌 **Note**: Local variables **do not** have default values. They **must** be initialized before use.

---

## ✅ 2. Variable Shadowing (Local vs Global)

Java allows a **local variable** to have the **same name** as a **global (class-level)** variable.

When this happens:
- The **local variable gets preference** inside the method/block.
- The global variable is **hidden**, which is called **_variable shadowing_**.

### 🔍 Example:
```java
public class Example {
    int x = 10; // global variable

    void show() {
        int x = 20; // local variable shadows the global one
        System.out.println(x); // Output: 20
    }
}
 ## ✅ Primitive Type Casting (Widening)

Java allows automatic conversion from smaller to larger data types.

### Example:
```java
char p = 'd';
int k = p;
System.out.println(k);  // Output: 100
byte → short → char → int → long → float → double


## 🔄 Primitive Type Casting

---

### ✅ Widening (Implicit Casting)

Converting a **smaller** data type to a **larger** one automatically.

```java
char p = 'd';
int k = p;
System.out.println(k);  // Output: 100
## 🔃 Narrowing (Explicit Type Casting)

Narrowing means converting a **larger data type** into a **smaller one** manually.  
Since there’s a risk of data **loss or overflow**, Java does **not** do this automatically — you must cast it **explicitly**.

---

### 📌 Syntax:
```java
<target-type> variableName = (<target-type>) sourceValue;
✅ Examples:
🔸 1. int to byte (possible overflow)
java
Copy code
int num = 130;
byte b = (byte) num;
System.out.println(b);  // Output: -126
🧠 Reason: byte range is -128 to 127.
130 is outside this range, so it wraps around → result: -126.

🔸 2. double to int (fractional part lost)
java
Copy code
double pi = 3.14;
int intPi = (int) pi;
System.out.println(intPi);  // Output: 3
🧠 Reason: Casting to int removes the decimal part.

🔸 3. float to short
java
Copy code
float f = 123.99f;
short s = (short) f;
System.out.println(s);  // Output: 123
🧠 Decimal is truncated, not rounded.

⚠️ Why Explicit?
Because narrowing might:

Lose precision (e.g., float → int)

Overflow or wrap values (e.g., int → byte)

🔁 Narrowing Type Order:
text
Copy code
double → float → long → int → char → short → byte

  # Escape Characters in Programming (JavaScript, C, Java, etc.)

Escape characters are used to perform **special operations** in strings, such as inserting quotes, new lines, tabs, or other special characters.

In most programming languages (like C, Java, JavaScript, Python), the backslash `\` is used as the **escape character**.

---

## ✅ Common Escape Characters

| Escape Sequence | Description                              | Example Output               |
|------------------|------------------------------------------|-------------------------------|
| `\"`             | Escapes a double quote                   | `He said, "Hello"`           |
| `\'`             | Escapes a single quote                   | `'It\'s fine'` → `It's fine` |
| `\\`             | Escapes the backslash `\` itself         | `\\` → `\`                   |
| `\t`             | Inserts a horizontal tab (gap/space)     | `Hello\tWorld`               |
| `\n`             | Moves cursor to a new line               | `Line1\nLine2`               |

---

## 📌 Examples

### 📄 Code Example (JavaScript)
```js
console.log("He said, \"I am learning MongoDB.\"");
console.log('It\'s a good day!');
console.log("Path: C:\\Program Files\\MongoDB");
console.log("Name:\tRavikant");
console.log("Line1\nLine2");

///COMMENT//
# 📝 Comments in Programming

Comments are used to write **important notes, messages, or explanations** inside the source code. They are ignored by the compiler/interpreter and do **not affect the program’s execution**.

---

## ✅ Why Use Comments?

- To explain the logic of code
- To improve code readability
- To mark sections or TODOs
- To disable a part of the code temporarily

---

## 🧩 Types of Comments

### 1️⃣ **Single-Line Comment (`//`)**

Used to write a comment on a single line.

```cpp
// This is a single-line comment
int x = 10;  // Assigning value to x
2️⃣ Multi-Line Comment (/* ... */)
Used to write comments across multiple lines.

c
Copy code
/*
  This is a multi-line comment.
  You can write detailed explanations here.
*/
int y = 20;
3️⃣ Documentation Comment (/** ... */)
Used to generate documentation from the code (mainly in Java, JavaDoc-style).

java
Copy code
/**
 * This method adds two numbers.
 * @param a First number
 * @param b Second number
 * @return Sum of a and b
 */
public int add(int a, int b) {
    return a + b;
}
📌 Summary Table
Type	Syntax	Used For
Single-line	// comment	Short inline notes
Multi-line	/* comment */	Explanations across multiple lines
Documentation	/** comment */	Auto-generating documentation

-  for java doc whenever we make  the doc that time   class  must be public  for make the document z000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000

00000000000000000000000

// methos o
ZS



