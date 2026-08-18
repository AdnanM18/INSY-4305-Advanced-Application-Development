# Lab 5 – Cell Phone Inventory System

A multi-window Java Swing application combining authentication, file persistence, object-oriented programming, and custom exception handling.

## Application Components

### `CreateLoginForm`
Reads account data from `users.txt`, validates login credentials, and opens the inventory application after successful authentication.

### `CreateAccount`
Creates new username/password entries in `users.txt`.

### `CellPhoneInventory`
Supports:

- adding cell phones
- clearing form fields
- saving records to `cellPhones.txt`
- displaying saved inventory

### `CellPhone`
Stores model, manufacturer, and retail price.

### Custom Exceptions

- `InvalidModelException`
- `InvalidManufacturerException`
- `InvalidRetailPriceException`

## Validation

The application rejects empty model/manufacturer fields, non-numeric prices, prices below 0, and prices above 1500.

## Privacy & Portfolio Cleanup

`users.txt` and `cellPhones.txt` are runtime-generated and ignored by Git.

The submitted login handler contained a control-flow issue that opened the inventory window even after a failed login. The portfolio copy corrects that flow while preserving the application design.

Screenshots showing visible usernames or passwords were intentionally excluded.

## Run

```bash
javac -d out src/*.java
java -cp out LoginFormDemo
```

If no account exists yet, click **Create an Account** first.
