# Application simulating bank operations

## The project structure

<pre>
com 
└── bank 
    ├── payment 
    │   ├── PaymentMethods.java (abstract class)
    │   ├── Card.java (abstract class)
    │   ├── BankCard.java 
    │   ├── CreditCard.java 
    │   └── Cash.java 
    ├── human
    │   └── Human.java
    ├── printer
    │   ├── Printable.java (interface)
    │   └── Printer.java
    └── MainApplication.java
</pre>

### In this structure:

- payment package contains all classes related to payment methods. <br>
- human package contains the Human class, which uses payment methods.  <br>
- printer package contains the Printable interface and the Printer class for displaying balances.  <br>
