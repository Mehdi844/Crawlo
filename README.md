# Crawlo Application

## Description
Crawlo est une application de gestion d'accès qui permet d'associer des utilisateurs à des comptes et de gérer leurs accès. L'application offre des fonctionnalités telles que la gestion des utilisateurs, des comptes et des accès, ainsi que l'authentification des administrateurs.

## Fonctionnalités
- **Gestion des utilisateurs** : Ajouter, mettre à jour et supprimer des utilisateurs.
- **Gestion des comptes** : Gérer les détails des comptes, y compris les régions, les sites Web, etc.
- **Gestion des accès** : Associer des utilisateurs à des comptes et gérer leurs accès.
- **Authentification des administrateurs** : Authentification sécurisée pour l'accès administratif.

## Technologies utilisées
- **Backend** : Spring Boot, Spring Data JPA, Hibernate
- **Base de données** : MySQL
- **Sécurité** : Spring Security
- **Autres** : Lombok, JPA, Maven

## Prérequis
- Java 11 ou supérieur
- Maven
- MySQL
- Un IDE comme IntelliJ IDEA ou Eclipse


## Installation

1. **Cloner le dépôt**
   ```bash
   git clone https://github.com/Mehdi844/Crawlo/tree/ff1ad0fa385488d7bdb1e0d34ef8b1e28bb3a7d8/crawlov2
   cd crawlo

2. **Configurer la base de données**
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/crawlo
   spring.datasource.username=root
   spring.datasource.password=*****
   spring.jpa.hibernate.ddl-auto=update
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   server.port=8080
3. **Compiler et exécuter l'application**
   ```bash
   mvn clean install
   mvn spring-boot:run

## Authentification des administrateurs

L'application utilise Spring Security pour l'authentification des administrateurs. Ajoutez manuellement des administrateurs dans la table Admin avec des mots de passe hachés.


### Instructions supplémentaires
- **URL du dépôt**:  `https://github.com/Mehdi844/Crawlo/tree/ff1ad0fa385488d7bdb1e0d34ef8b1e28bb3a7d8/crawlov2`


