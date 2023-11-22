# Application simulating bank operations

## The project structure

<pre>
com 
└── bank 
    ├── payment 
    │   ├── PaymentMethods.java (абстрактный класс)
    │   ├── Card.java (абстрактный класс)
    │   ├── BankCard.java 
    │   ├── CreditCard.java 
    │   └── Cash.java 
    ├── human
    │   └── Human.java
    ├── printer
    │   ├── Printable.java (интерфейс)
    │   └── Printer.java
    └── MainApplication.java
</pre>

### In this structure:

- payment contains all classes related to payment methods. <br>
- human contains the Human class, which uses payment methods.  <br>
- printer contains the Printable interface and the Printer class for displaying balances.  <br>
