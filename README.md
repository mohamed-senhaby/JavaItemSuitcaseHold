# Item, Suitcase, and Hold Manager

This Java project manages items by adding them to suitcases and organizing these suitcases within a hold. It demonstrates basic object-oriented programming principles and is built using classes for `Item`, `Suitcase`, and `Hold`.

## Features

- `Item` class: Represents an item with a name and weight.
- `Suitcase` class: Represents a suitcase that holds items, checks weight capacity, and manages the heaviest item.
- `Hold` class: Represents a collection of suitcases, checks total weight, and prints items.

## Classes

- **Item**:

  - Fields: `name` (String), `weight` (int)
  - Methods: `getName()`, `getWeight()`, `toString()`

- **Suitcase**:

  - Fields: `suitcase` (ArrayList of Item), `maximumWeight` (int)
  - Methods: `addItem(Item)`, `printItems()`, `totalWeight()`, `heaviestItem()`, `toString()`

- **Hold**:
  - Fields: `suitcases` (ArrayList of Suitcase), `maximumWeight` (int)
  - Methods: `addSuitcase(Suitcase)`, `printItems()`, `toString()`

## How to Run

1. Clone this repository to your local machine.
2. Compile and run the `Main` class to test the project.

## Example

```java
public class Main {
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}
```
