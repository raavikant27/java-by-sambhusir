// Example: Loan → PersonalLoan (Single Inheritance + super keyword)

/*
 * 📌 Theory:
 * - Parent class: Loan
 * - Child class: PersonalLoan extends Loan
 * - We use `super()` keyword to call parent constructor from child constructor.
 * - Execution flow in constructor chaining:
 *     Child constructor → Parent constructor → then child's body
 * - Variable + method of parent are inherited by child.
 */

class Loan {
    double amount;
    double rate;

    // Default constructor
    Loan() {
        System.out.println("Loan: default constructor");
    }

    // Parameterized constructor
    Loan(double amount, double rate) {
        this.amount = amount;
        this.rate = rate;
        System.out.println("Loan: parameterized constructor (amount=" + amount + ", rate=" + rate + "%)");
    }

    // Method: calculate yearly interest
    double yearlyInterest() {
        return (amount * rate) / 100.0;
    }
}

/*
 * 👉 Theory:
 * - Loan is parent class.
 * - amount & rate fields + yearlyInterest() method will be inherited.
 * - PersonalLoan constructor uses `super()` to call Loan’s constructor first.
 */

class PersonalLoan extends Loan {
    String purpose;

    // Default constructor
    PersonalLoan() {
        super(); // calls Loan()
        System.out.println("PersonalLoan: default constructor");
    }

    // Parameterized constructor
    PersonalLoan(double amount, double rate, String purpose) {
        super(amount, rate); // call Loan(amount, rate)
        this.purpose = purpose;
        System.out.println("PersonalLoan: parameterized constructor (purpose=" + purpose + ")");
    }

    // Show details
    void showPersonalLoan() {
        System.out.println("---- Personal Loan Details ----");
        System.out.println("Amount: " + amount);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Purpose: " + purpose);
        System.out.println("Yearly Interest: " + yearlyInterest());
        System.out.println("--------------------------------");
    }
}

/*
 * 👉 Theory:
 * - Driver class has main() method.
 * - Here we create objects to see constructor chaining and method calls.
 */

public class LoanExample {
    public static void main(String[] args) {

        // Case 1: Default constructor chain
        System.out.println("Case 1: Default Constructor Flow");
        PersonalLoan p1 = new PersonalLoan();
        p1.showPersonalLoan();

        System.out.println();

        // Case 2: Parameterized constructor chain
        System.out.println("Case 2: Parameterized Constructor Flow");
        PersonalLoan p2 = new PersonalLoan(500000, 7.5, "Home Repair");
        p2.showPersonalLoan();
    }
}


/*
 * 📌 Execution Flow:
 *
 * 👉 Case 1: PersonalLoan()
 *   1. PersonalLoan() called
 *   2. super() → Loan()
 *   3. Loan default constructor runs
 *   4. PersonalLoan default constructor runs
 *   5. showPersonalLoan() prints details (default values: 0.0, null)
 *
 * 👉 Case 2: PersonalLoan(double, double, String)
 *   1. PersonalLoan(double,double,String) called
 *   2. super(amount, rate) → Loan(amount, rate)
 *   3. Loan parameterized constructor runs
 *   4. PersonalLoan parameterized constructor runs
 *   5. showPersonalLoan() prints full details
 *
 * ✨ Important Notes:
 * - Child constructor always calls parent constructor first (super()).
 * - If super() not written, compiler automatically inserts it.
 * - Parent’s fields & methods are inherited, child can add new fields/methods.
 */
