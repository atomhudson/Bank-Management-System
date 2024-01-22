# Bank Management System
## Overview

The Bank Management System is a Java-based application for managing various banking operations. It includes classes for database connection, user signup, login, balance inquiry, deposit, and withdrawal.

## Table of Contents
1. [Connection Class](#connection-class)
2. [Signup Class](#signup-class)
3. [Login Class](#login-class)
4. [Balance Inquiry Class](#balance-inquiry-class)
5. [Deposit Class](#deposit-class)
6. [Withdrawal Class](#withdrawal-class)

## Connection Class

The `Connection` class establishes a connection to the MySQL database using JDBC. It provides methods for connecting to the database and executing SQL queries.

## Signup Class

The `Signup` class handles user registration. It captures user details such as name, account number, PIN, etc., and stores them securely in the database.

![Screenshot 2024-01-23 000411](https://github.com/atomhudson/Bank-Management-System/assets/83460106/eed794de-d54b-484d-9d20-83676e5cb2c9)
![Screenshot 2024-01-23 000426](https://github.com/atomhudson/Bank-Management-System/assets/83460106/fb9d7635-d6c2-4309-8409-e1e708c562ff)
![Screenshot 2024-01-23 000456](https://github.com/atomhudson/Bank-Management-System/assets/83460106/5d6a1aea-0828-40c1-9588-03b66dc19b98)
![Screenshot 2024-01-23 000546](https://github.com/atomhudson/Bank-Management-System/assets/83460106/7346b758-14fe-45e4-afb9-363ea4242c64)
![Screenshot 2024-01-23 000613](https://github.com/atomhudson/Bank-Management-System/assets/83460106/408f91f1-a2ea-4130-893d-ee9dfd78fb92)

## Login Class

The `Login` class manages user authentication. It verifies user credentials against the stored information in the database and grants access upon successful authentication.
![Screenshot 2024-01-23 000144](https://github.com/atomhudson/Bank-Management-System/assets/83460106/b9a46393-e7c8-4513-b71d-f1bf1fb466c3)

## Balance Inquiry Class

The `Balance Inquiry` class allows users to check their account balance. It retrieves the current balance from the database and displays it to the user.
![Screenshot 2024-01-23 003135](https://github.com/atomhudson/Bank-Management-System/assets/83460106/9f026aa7-ffc8-4e07-9081-57ae8b21862e)

## Deposit Class

The `Deposit` class handles deposit transactions. Users can deposit funds into their accounts, and the class updates the account balance accordingly.
![Screenshot 2024-01-23 000624](https://github.com/atomhudson/Bank-Management-System/assets/83460106/35954386-61d3-469e-ae2a-f2e499d33e59)
![Screenshot 2024-01-23 000647](https://github.com/atomhudson/Bank-Management-System/assets/83460106/653032cc-5780-4673-b6c2-b82cb845cfde)

## Withdrawal Class

The `Withdrawal` class manages withdrawal transactions. It ensures that users have sufficient funds before processing a withdrawal and updates the account balance.

## Usage

Provide instructions on how to run the Bank Management System on a local machine. Include any dependencies, setup steps, or configuration needed.

## Screenshots

Include screenshots or images showcasing the user interface or key functionalities of the Bank Management System.
![Screenshot 2024-01-23 000656](https://github.com/atomhudson/Bank-Management-System/assets/83460106/16b885d8-4f1e-48f8-ba14-74af4a206bab)
![Screenshot 2024-01-23 000706](https://github.com/atomhudson/Bank-Management-System/assets/83460106/7fe1d380-e2c0-484a-93d6-c6476c6f003a)
![Screenshot 2024-01-23 000719](https://github.com/atomhudson/Bank-Management-System/assets/83460106/3927acf6-8bd8-4243-82d0-24dd67d9ac39)


## Contributing

If you want to contribute to this project, fork the repository and submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

