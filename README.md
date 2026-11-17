# Java 2nd Semester Codes

Java programs and mini-projects from Saaiil Basnet's second semester,
reclassified into readable, one-problem-per-file solutions. Files that
used to hold several demos stacked in one `main()` (commented in/out by
hand) were split so every file runs on its own and starts with a short
comment describing the problem it solves.

Two non-compiling scratch files (`Main.java`, which referenced an
undefined `AnimalBox` class and had a syntax error, and `index.java`,
which was entirely commented out) and one empty placeholder
(`ExceptionExample.java`) were removed since they weren't solved
problems.

## JavaDemo - core language concepts, one demo per file
- `Hello.java` - Hello World
- `DataTypes.java` - primitive data types
- `DemoVariable.java` - class (static) vs. instance variables
- `MyClass.java` - constants (`static final`)
- `UserInput.java` - reading input with Scanner
- `CommandLineExample.java` - reading command-line arguments
- `IfElseDemo.java`, `IfElseIfDemo.java`, `SwitchCaseDemo.java` - conditionals
- `ForLoopDemo.java`, `WhileLoopDemo.java`, `DoWhileLoopDemo.java` - loops
- `BreakDemo.java`, `ContinueDemo.java` - loop control
- `ArrayAvg.java` - average of a fixed array
- `ArrayUserInput.java` - reading an array from the user
- `StringReverse.java` - reverse a string (command-line arg)
- `factorial.java` - recursive factorial
- `Animal.java`, `Dog.java`, `Cat.java` - inheritance & method overriding
- `Bike.java`, `Honda.java` - abstraction (abstract class)
- `Circle.java` - encapsulation (fields + getter/setter)
- `Book.java` - constructors & static members
- `Test.java` - a BankAccount-style class with a deposit method
- `Employee.java` - generics
- `GenericArray.java` - a generic method
- `LambdaExample.java` - lambda expression with `ArrayList.forEach`
- `ByteStreamExample.java` - copying a file with byte streams
- `SimpleGUI.java` - a Swing form with a text field and button
- `LogInForm.java` - a Swing login form with hardcoded credentials
- `MouseEventExample.java` - Swing mouse event listeners

## Minor Projects - small multi-class projects
- `Basic Calculator/` - a Scanner-driven calculator app
- `Employee Payroll System/` - `Employee` base class with `FullTimeEmployee`, `PartTimeEmployee` and `ContractEmployee` subclasses, driven by `PayrollSystem`
- `File Reader App/` - reads a file and throws a custom `InvalidFileFormatException` on bad input
- `Inventory System/` - `Product`, `Order` and `Customer` classes driven by `InventorySystem`
- `Temeperature Converter/` - Fahrenheit/Celsius conversion app
- `User Input Validation/` - age input validation with a custom exception
