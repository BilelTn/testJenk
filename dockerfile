# Utiliser une image contenant Maven
FROM maven:3.9.6

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier pom.xml
COPY pom.xml .

# Installer les dépendances
RUN mvn install

# Copier tous les fichiers de l'application dans le répertoire de travail
COPY . .

# Exposer le port sur lequel votre application Java écoute (remplacez par le port approprié)
EXPOSE 8081

# Commande pour démarrer l'application (par exemple, une commande de démarrage Spring Boot)
CMD ["mvn", "spring-boot:run"]
