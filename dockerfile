# Utilisation de l'image Maven 3.9.6 comme image de base
FROM maven:3.9.6

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier pom.xml et le fichier de configuration de H2
COPY pom.xml .

# Installer les dépendances Maven
RUN mvn dependency:go-offline

# Copier tous les fichiers de l'application dans le répertoire de travail
COPY . .

# Exposer le port sur lequel votre application Java écoute (remplacez par le port approprié)
EXPOSE 8081

# Définir les variables d'environnement pour la base de données H2
ENV H2_DRIVER=org.h2.Driver
ENV H2_URL=jdbc:h2:mem:testdb
ENV H2_USERNAME=sa
ENV H2_PASSWORD=sa

# Commande pour démarrer l'application (par exemple, une commande de démarrage Spring Boot)
CMD ["mvn", "spring-boot:run"]
