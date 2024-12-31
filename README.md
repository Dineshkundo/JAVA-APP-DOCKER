<div align="center">
  <h1>🚀 Simple 3-Tier Java Application</h1>
  <img src="https://github.com/user-attachments/assets/a66f2e4b-178e-4be3-be01-d2e476496af7" alt="Image 1" width="900" />
  <img src="https://github.com/user-attachments/assets/25acb707-39b6-44a5-b6fa-ee81e456f277" alt="Image 2" width="900" />
  <img src="https://github.com/user-attachments/assets/b072ee01-d973-4549-9b80-d78b469f6323" alt="Image 3" width="900" />
</div>
This project demonstrates a simple 3-tier Java application using Docker and Docker Compose. The architecture includes:

- **Web Tier**: Serves the user interface.
- **App Tier**: Handles backend services.
- **Database Tier**: Stores employee details.

## ⚙️ Prerequisites
Ensure you have the following installed on your server:

- Docker
- Docker Compose
- Maven
- Git

---

## 🙌 Steps to Set Up and Run

Follow these commands to set up and run the application:

### 📝 Update and Install Required Packages
```bash
sudo apt update
sudo apt install docker.io -y
sudo apt install docker-compose -y
sudo apt install maven -y
sudo apt install git -y
```

### 🔐 Add Docker to the Ubuntu Group
```bash
sudo usermod -aG docker ubuntu
```

### 🚫 Restart the Server
After adding the user to the `docker` group, restart the server for the changes to take effect.

### ✅ Verify Docker Group Membership
Log back in and verify the `docker` group membership:
```bash
groups
```

### 🔄 Restart Docker Service
```bash
sudo systemctl restart docker
```

### 🔗 Clone the Repository
```bash
git clone https://github.com/Dineshkundo/JAVA-APP-DOCKER.git
```

### 🌐 Build and Run the Application

1. Navigate to the `web-tier` directory and build the package:
   ```bash
   cd JAVA-APP-DOCKER/project/web-tier
   mvn clean package
   ```

2. Navigate to the `app-tier` directory and build the package:
   ```bash
   cd ../app-tier
   mvn clean package
   ```

3. Navigate back to the root project directory and run Docker Compose:
   ```bash
   cd ..
   docker-compose up --build -d
   ```

### 🔢 Verify Running Containers
To ensure all containers are up and running:
```bash
docker ps
```
You should see the following:

| CONTAINER ID | IMAGE              | COMMAND                  | PORTS                  | NAMES               |
|--------------|--------------------|--------------------------|------------------------|---------------------|
| xxxxxxxxxxxx | project_app-tier   | java -jar /app.jar       | 0.0.0.0:8081->8081/tcp | project_app-tier_1  |
| xxxxxxxxxxxx | project_web-tier   | java -jar /app.jar       | 0.0.0.0:8080->8080/tcp | project_web-tier_1  |
| xxxxxxxxxxxx | project_db         | docker-entrypoint.sqld   | 0.0.0.0:3306->3306/tcp | project_db_1        |

---

## 🌟 Features
- **Dynamic Web Tier**: Serves the frontend application.
- **Robust App Tier**: Processes backend logic.
- **Reliable Database Tier**: Stores and retrieves data efficiently.

---

## 📈 Application Ports
- **Web Tier**: `8080`
- **App Tier**: `8081`
- **Database Tier**: `3306`

---

## 🛠️ Troubleshooting
- Ensure Docker is running and properly configured.
- Check container logs for errors:
  ```bash
  docker logs <container_id>
  ```
- Verify Maven builds complete successfully.

---

## 🌐 License
This project is open-source and available under the [MIT License](LICENSE).

---

Enjoy building and running your simple 3-tier Java application! 🚀

