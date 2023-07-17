Submitted by: Eden Fellous<br>
Explanation of Bank Program Implementation<br>
Introduction: The Bank program is a Java-based application that simulates a banking system. <br>The purpose of the program is to create a bank with three different account types: Standard, Basic, and Premium. Each account type is represented as a separate class that implements the IAccount interface.
Program Structure: The program is structured into multiple classes that represent the different account types and the bank itself.<br> The account classes (StandardAccount, BasicAccount, and PremiumAccount) implement the IAccount interface, which defines the common methods for account operations such as depositing, withdrawing, and retrieving the current balance.
The Bank class is responsible for managing the accounts. It implements the IBank interface, which provides methods for opening and closing accounts, as well as retrieving information about the accounts.<br> The Bank class maintains a list of accounts and performs operations on them based on the provided account details.
<br>
Account Types:
1.	Standard Account:<br>
•	Allows depositing and withdrawing money within the credit limit.<br>
•	Does not allow withdrawals that exceed the credit limit.<br>
•	If a withdrawal request exceeds the credit limit, the withdrawal is limited to the available amount.<br>
•	The credit limit is specified as a negative value during the account creation.<br>
3.	Basic Account:<br>
•	Does not have a credit limit; it is always set to zero.<br>
•	Has a single withdrawal limit, preventing withdrawals greater than the specified limit.<br>
•	If a withdrawal request exceeds the withdrawal limit, the withdrawal is limited to the withdrawal limit.<br>
•	The withdrawal limit is specified as a positive value during the account creation.<br>
4.	Premium Account:
•	Similar to the standard account, but without a credit limit.<br>
•	Allows depositing and withdrawing money without any restrictions.<br>

