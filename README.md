# Multi-Server Email Sender

Java application for sending emails using multiple SMTP servers, providing redundancy and failover support.

## Features
- Send emails using multiple SMTP servers
- Automatic failover if a server is unavailable
- SMTP authentication support
- Configurable ports and security (TLS/SSL)

## Technologies
- Java
- Jakarta Mail (JavaMail)
- NetBeans

## How to Run
1. Open the project in NetBeans
2. Configure SMTP servers in the configuration file
3. Run the main class

## Configuration
SMTP servers are defined in a configuration file with the following properties:
- Host
- Port
- Username
- Password
- Security (TLS/SSL)

⚠️ **Do not commit real credentials to the repository.**

## Project Structure
- src/ → Source code
- config/ → SMTP configuration files

## Author
AlanGM16
