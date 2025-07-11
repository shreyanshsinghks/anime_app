# 🎌 Anime Discovery App





**Discover, Search, and Track Your Favorite Anime Series**



[Demo](#demo) -  [Features](#features) -  [Quick Start](#quick-start) -  [API](#api) -  [Contributing](#contributing)



## 📋 Table of Contents

- [Overview](#overview)
- [✨ Features](#features)
- [🛠️ Tech Stack](#tech-stack)
- [📦 Installation](#installation)
- [🚀 Quick Start](#quick-start)
- [📱 Screenshots](#screenshots)
- [🌐 API Documentation](#api-documentation)
- [🏗️ Architecture](#architecture)
- [🔧 Configuration](#configuration)
- [🧪 Testing](#testing)
- [🚀 Deployment](#deployment)
- [🤝 Contributing](#contributing)
- [📄 License](#license)

## 🎯 Overview

Anime Discovery App is a modern web application built with **Spring Boot** and **Thymeleaf** that allows users to discover, search, and track their favorite anime series. The application provides a seamless server-side rendered experience for anime enthusiasts to explore the vast world of Japanese animation.

The application integrates with the **Jikan API** (unofficial MyAnimeList API) to provide real-time anime data, including ratings, episodes, genres, and detailed information about thousands of anime series.

### 🌟 Why This Project?
- **Learn Spring Boot** - Complete MVC architecture implementation
- **Master Thymeleaf** - Server-side templating with modern features
- **API Integration** - Real-world external API consumption
- **Security Implementation** - User authentication and authorization
- **Database Operations** - JPA/Hibernate with H2 database

## ✨ Features

### 🔍 Core Features
- **🏆 Top Anime Discovery** - Browse the highest-rated anime series from MyAnimeList
- **🔎 Advanced Search** - Find anime by title with real-time results
- **📖 Detailed View** - Comprehensive anime information including synopsis, genres, ratings
- **⚡ Fast Performance** - Optimized server-side rendering with caching
- **📱 Responsive Design** - Perfect experience on desktop, tablet, and mobile

### 👤 User Management
- **🔐 User Authentication** - Secure registration and login system
- **👤 User Profiles** - Personal dashboard with user information
- **🔒 Session Management** - Secure session handling with Spring Security
- **📊 User Statistics** - Track user activity and preferences

### 🎨 UI/UX Features
- **🌙 Modern Interface** - Clean and intuitive Bootstrap design
- **📊 Rich Data Display** - Scores, episodes, genres, and detailed information
- **🖼️ High-Quality Images** - Beautiful anime artwork and posters
- **🎯 Easy Navigation** - Smooth user experience with breadcrumbs
- **💬 Interactive Elements** - Hover effects and smooth animations

## 🛠️ Tech Stack

### Backend Framework
- **Spring Boot 3.1.0** - Main application framework
- **Spring MVC** - Web layer with controllers
- **Spring Security** - Authentication and authorization
- **Spring Data JPA** - Data persistence layer
- **Hibernate** - ORM framework

### Frontend & Templating
- **Thymeleaf 3.1.0** - Server-side template engine
- **Bootstrap 5.1.3** - Responsive CSS framework
- **FontAwesome 6.0** - Beautiful icons and graphics
- **jQuery 3.6.0** - DOM manipulation and AJAX

### Database & Storage
- **H2 Database** - Lightweight embedded database
- **File-based persistence** - Data survives application restarts
- **JPA Repositories** - Clean data access layer

### Build & Dependencies
- **Maven 3.6+** - Dependency management and build tool
- **Lombok** - Reducing boilerplate code
- **Jackson** - JSON processing for API integration

### External APIs
- **Jikan API v4** - MyAnimeList data source
- **RESTful Integration** - WebClient for HTTP requests

## 📦 Installation

### Prerequisites
Make sure you have the following installed:

- **Java 17 or higher** ☕
  ```bash
  java -version
  # Should show Java 17+
  ```

- **Maven 3.6 or higher** 📦
  ```bash
  mvn -version
  # Should show Maven 3.6+
  ```

- **Git** 🌐
  ```bash
  git --version
  ```

### Clone Repository
```bash
git clone https://github.com/yourusername/anime-discovery-app.git
cd anime-discovery-app
```

## 🚀 Quick Start

### 1. Build the Application
```bash
# Clean and build the project
mvn clean compile

# Run tests (optional)
mvn test

# Package the application
mvn package
```

### 2. Run the Application
```bash
# Option 1: Using Maven
mvn spring-boot:run

# Option 2: Using JAR file
java -jar target/anime-app-1.0.0.jar

# Option 3: Using IDE
# Open the project in IntelliJ IDEA or Eclipse and run AnimeAppApplication.java
```

### 3. Access the Application
- **Main Application**: http://localhost:8080
- **H2 Database Console**: http://localhost:8080/h2-console
- **API Endpoints**: http://localhost:8080/api/anime/top

### 4. First Time Setup
1. Navigate to http://localhost:8080
2. You'll be redirected to the registration page
3. Create a new account with:
    - Username (minimum 3 characters)
    - Email address
    - Password (minimum 6 characters)
4. Login and start exploring anime!

## 📱 Screenshots



### 🏠 Home Page - Top Anime

*Browse the highest-rated anime series with beautiful card layouts*

### 🔍 Search Functionality

*Real-time search with instant results and filtering options*

### 📖 Anime Details Page

*Comprehensive anime information with synopsis, genres, ratings, and more*

### 🔐 Authentication System

*Secure user authentication with validation and error handling*

### 👤 User Profile Dashboard

*Personal user dashboard with statistics and preferences*

### 📱 Mobile Responsive Design


*Fully responsive design that works perfectly on all devices*



## 🌐 API Documentation

### Internal API Endpoints

#### 🎬 Anime Endpoints
```http
# Get top anime (JSON response)
GET /api/anime/top
Content-Type: application/json

# Search anime
GET /api/anime/search?q={query}
Content-Type: application/json

# Get anime by ID
GET /api/anime/{id}
Content-Type: application/json
```

#### 📱 Web Pages
```http
# Home page with top anime
GET /

# Search results page
GET /search?q={query}

# Anime detail page
GET /anime/{id}

# User authentication
GET /login
GET /register
POST /login
POST /register

# User profile
GET /profile
```

### Example API Response
```json
{
  "malId": 21,
  "title": "One Piece",
  "titleEnglish": "One Piece",
  "synopsis": "Gol D. Roger was known as the Pirate King, the strongest and most infamous being to have sailed the Grand Line...",
  "score": 9.0,
  "episodes": 1000,
  "status": "Currently Airing",
  "type": "TV",
  "rating": "PG-13",
  "images": {
    "jpg": {
      "imageUrl": "https://cdn.myanimelist.net/images/anime/6/73245.jpg",
      "smallImageUrl": "https://cdn.myanimelist.net/images/anime/6/73245t.jpg",
      "largeImageUrl": "https://cdn.myanimelist.net/images/anime/6/73245l.jpg"
    }
  },
  "genres": [
    {
      "malId": 1,
      "name": "Action",
      "url": "https://myanimelist.net/anime/genre/1/Action"
    },
    {
      "malId": 2,
      "name": "Adventure",
      "url": "https://myanimelist.net/anime/genre/2/Adventure"
    }
  ]
}
```

## 🏗️ Architecture

### System Architecture
```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   Web Browser   │    │  Spring Boot    │    │   Jikan API     │
│   (Thymeleaf)   │◄──►│   Application   │◄──►│ (MyAnimeList)   │
│   Port: 8080    │    │   Port: 8080    │    │   External      │
└─────────────────┘    └─────────────────┘    └─────────────────┘
                              │
                              ▼
                       ┌─────────────────┐
                       │   H2 Database   │
                       │  (File-based)   │
                       │  ./data/animedb │
                       └─────────────────┘
```

### MVC Architecture Flow
```
┌──────────────┐     ┌──────────────┐     ┌──────────────┐
│              │────►│              │────►│              │
│  Controller  │     │   Service    │     │ Repository   │
│   (Web/API)  │◄────│  (Business)  │◄────│ (Data Access)│
│              │     │              │     │              │
└──────────────┘     └──────────────┘     └──────────────┘
        │                                          │
        ▼                                          ▼
┌──────────────┐                         ┌──────────────┐
│              │                         │              │
│  Thymeleaf   │                         │ H2 Database  │
│  Templates   │                         │   (JPA)      │
│              │                         │              │
└──────────────┘                         └──────────────┘
```

### Project Structure
```
anime-discovery-app/
├── 📁 src/
│   ├── 📁 main/
│   │   ├── 📁 java/com/example/animeapp/
│   │   │   ├── 📄 AnimeAppApplication.java     # Main application class
│   │   │   ├── 📁 controller/                  # Web & API Controllers
│   │   │   │   ├── 📄 AnimeController.java     # Main web controller
│   │   │   │   ├── 📄 AuthController.java      # Authentication controller
│   │   │   │   └── 📁 api/                     # REST API controllers
│   │   │   │       └── 📄 AnimeApiController.java
│   │   │   ├── 📁 model/                       # Entity Classes
│   │   │   │   ├── 📄 Anime.java               # Anime entity
│   │   │   │   ├── 📄 User.java                # User entity
│   │   │   │   └── 📄 UserAnime.java           # User-Anime relationship
│   │   │   ├── 📁 repository/                  # Data Access Layer
│   │   │   │   ├── 📄 UserRepository.java      # User data access
│   │   │   │   └── 📄 UserAnimeRepository.java # User anime data access
│   │   │   ├── 📁 service/                     # Business Logic
│   │   │   │   ├── 📄 AnimeService.java        # Anime business logic
│   │   │   │   ├── 📄 UserService.java         # User business logic
│   │   │   │   └── 📄 CustomUserDetailsService.java # Security service
│   │   │   └── 📁 config/                      # Configuration
│   │   │       ├── 📄 SecurityConfig.java      # Spring Security config
│   │   │       └── 📄 WebConfig.java           # Web MVC config
│   │   └── 📁 resources/
│   │       ├── 📁 templates/                   # Thymeleaf Templates
│   │       │   ├── 📄 index.html               # Home page
│   │       │   ├── 📄 anime-list.html          # Search results
│   │       │   ├── 📄 anime-detail.html        # Anime details
│   │       │   ├── 📄 login.html               # Login page
│   │       │   ├── 📄 register.html            # Registration page
│   │       │   └── 📁 user/
│   │       │       └── 📄 profile.html         # User profile
│   │       ├── 📁 static/                      # Static resources
│   │       │   ├── 📁 css/                     # Custom CSS files
│   │       │   ├── 📁 js/                      # JavaScript files
│   │       │   └── 📁 images/                  # Image assets
│   │       └── 📄 application.properties       # Application configuration
│   └── 📁 test/                               # Test classes
│       └── 📁 java/com/example/animeapp/
│           ├── 📄 AnimeAppApplicationTests.java
│           ├── 📁 controller/                  # Controller tests
│           ├── 📁 service/                     # Service tests
│           └── 📁 repository/                  # Repository tests
├── 📁 data/                                   # H2 Database files
│   ├── 📄 animedb.mv.db                       # Database file
│   └── 📄 animedb.trace.db                    # Database trace
├── 📄 pom.xml                                 # Maven configuration
├── 📄 README.md                               # Project documentation
├── 📄 .gitignore                              # Git ignore rules
└── 📄 LICENSE                                 # Project license
```

## 🔧 Configuration

### Application Properties
```properties
# Server Configuration
server.port=8080
spring.application.name=anime-app

# Thymeleaf Configuration
spring.thymeleaf.cache=false
spring.thymeleaf.mode=HTML
spring.thymeleaf.encoding=UTF-8

# Database Configuration
spring.datasource.url=jdbc:h2:file:./data/animedb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

# JPA/Hibernate Configuration
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

# H2 Console Configuration
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.h2.console.settings.trace=false
spring.h2.console.settings.web-allow-others=false

# Logging Configuration
logging.level.com.example.animeapp=DEBUG
logging.level.org.springframework.security=INFO
logging.level.org.springframework.web=INFO
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE

# External API Configuration
jikan.api.base-url=https://api.jikan.moe/v4
jikan.api.rate-limit=1000
```
### Environment Variables (Optional)
```bash
# Database Configuration
export DB_URL=jdbc:h2:file:./data/animedb
export DB_USERNAME=sa
export DB_PASSWORD=password

# External API Configuration
export JIKAN_API_BASE_URL=https://api.jikan.moe/v4

# Server Configuration
export SERVER_PORT=8080
export SPRING_PROFILES_ACTIVE=dev
```

## 🧪 Testing

### Running Tests
```bash
# Run all tests
mvn test

# Run tests with coverage
mvn test jacoco:report

# Run specific test class
mvn test -Dtest=AnimeServiceTest

# Run tests with specific profile
mvn test -Dspring.profiles.active=test
```

### Test Categories

#### Unit Tests
```bash
# Service layer tests
src/test/java/com/example/animeapp/service/

# Repository tests
src/test/java/com/example/animeapp/repository/

# Model tests
src/test/java/com/example/animeapp/model/
```

#### Integration Tests
```bash
# Controller integration tests
src/test/java/com/example/animeapp/controller/

# Security integration tests
src/test/java/com/example/animeapp/security/

# Database integration tests
src/test/java/com/example/animeapp/integration/
```

### Manual Testing Checklist

#### 🏠 Home Page Testing
- [ ] Page loads without errors
- [ ] Top anime are displayed in grid layout
- [ ] Images load correctly with fallback
- [ ] Navigation works properly
- [ ] Search functionality works

#### 🔍 Search Testing
- [ ] Search returns relevant results
- [ ] Empty search handled gracefully
- [ ] Special characters in search work
- [ ] Search results display correctly
- [ ] Pagination works (if implemented)

#### 🔐 Authentication Testing
- [ ] Registration with valid data works
- [ ] Registration validation works
- [ ] Login with correct credentials works
- [ ] Login with incorrect credentials fails
- [ ] Logout functionality works
- [ ] Session management works

#### 📱 Responsive Testing
- [ ] Desktop view (1920x1080)
- [ ] Tablet view (768x1024)
- [ ] Mobile view (375x667)
- [ ] Navigation collapses properly
- [ ] Text remains readable
- [ ] Images scale appropriately

## 🚀 Deployment

### Local Development
```bash
# Development with hot reload
mvn spring-boot:run -Dspring-boot.run.profiles=dev

# Development with debug
mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005"
```

### Production Build
```bash
# Build production JAR
mvn clean package -Pproduction

# Run production build
java -jar target/anime-app-1.0.0.jar --spring.profiles.active=prod
```

### Docker Deployment
```dockerfile
# Dockerfile
FROM openjdk:17-jre-slim

VOLUME /tmp
COPY target/anime-app-1.0.0.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]
```

```yaml
# docker-compose.yml
version: '3.8'
services:
  anime-app:
    build: .
    ports:
      - "8080:8080"
    volumes:
      - ./data:/app/data
    environment:
      - SPRING_PROFILES_ACTIVE=prod
      - DB_URL=jdbc:h2:file:/app/data/animedb
```

### Cloud Deployment Options

#### Heroku Deployment
```bash
# Create Heroku app
heroku create anime-discovery-app

# Deploy to Heroku
git push heroku main

# Set environment variables
heroku config:set SPRING_PROFILES_ACTIVE=prod
```

#### AWS Deployment
- **Elastic Beanstalk** - Easy deployment for Spring Boot
- **EC2** - Full control over server configuration
- **ECS** - Container-based deployment

#### Railway Deployment
- Simple git-based deployment
- Automatic builds and deploys
- Free tier available

## 🎓 Learning Outcomes

By building and understanding this project, you will learn:

### Spring Boot Concepts
- **Auto-configuration** - How Spring Boot simplifies configuration
- **Dependency Injection** - IoC container and bean management
- **Spring MVC** - Web layer architecture and request handling
- **Spring Security** - Authentication and authorization
- **Spring Data JPA** - Database operations and repository pattern

### Web Development
- **Server-side rendering** - Thymeleaf template engine
- **RESTful APIs** - Building and consuming web services
- **HTTP protocols** - Request/response handling
- **Session management** - User state management
- **CRUD operations** - Create, Read, Update, Delete operations

### Database Operations
- **JPA/Hibernate** - Object-relational mapping
- **Database design** - Entity relationships and constraints
- **Query optimization** - Efficient database queries
- **Transaction management** - ACID properties

### Software Architecture
- **MVC pattern** - Model-View-Controller separation
- **Layered architecture** - Presentation, business, data layers
- **Dependency management** - Maven build tool
- **Configuration management** - Properties and profiles

## 🤝 Contributing

We welcome contributions from the community! Here's how you can help make this project even better:

### 🐛 Bug Reports
Found a bug? Please help us fix it!

1. **Check existing issues** first to avoid duplicates
2. **Create a detailed issue** with:
    - Clear description of the problem
    - Steps to reproduce the bug
    - Expected vs actual behavior
    - Screenshots (if applicable)
    - Your environment details (OS, Java version, browser)

### 🚀 Feature Requests
Have an idea for a new feature?

1. **Search existing requests** to see if it's already suggested
2. **Open a new issue** with:
    - Clear feature description
    - Use cases and benefits
    - Possible implementation approach
    - Any relevant examples or mockups

### 💻 Development Contributions

#### Getting Started
1. **Fork** the repository
2. **Clone** your fork locally
   ```bash
   git clone https://github.com/yourusername/anime-discovery-app.git
   cd anime-discovery-app
   ```
3. **Create a feature branch**
   ```bash
   git checkout -b feature/amazing-new-feature
   ```
4. **Set up development environment**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

#### Development Guidelines
- **Follow Java conventions** - Use standard naming conventions
- **Write tests** - Include unit tests for new features
- **Document code** - Add Javadoc for public methods
- **Keep commits focused** - One feature/fix per commit
- **Write meaningful commit messages**
  ```
  feat: add user anime rating functionality
  fix: resolve search pagination issue
  docs: update API documentation
  ```

#### Code Quality Standards
- **Checkstyle** - Follow Google Java Style Guide
- **SonarLint** - Use SonarLint plugin in your IDE
- **Test Coverage** - Maintain at least 80% test coverage
- **Code Reviews** - All PRs require review before merge

#### Pull Request Process
1. **Update documentation** if needed
2. **Ensure tests pass** locally
   ```bash
   mvn test
   ```
3. **Create pull request** with:
    - Clear title and description
    - Reference related issues
    - Screenshots for UI changes
    - Testing instructions
4. **Respond to feedback** promptly
5. **Squash commits** before final merge

### 📚 Documentation Contributions
Help improve our documentation!

- **Fix typos** and grammar errors
- **Add examples** and tutorials
- **Improve API documentation**
- **Create video tutorials**
- **Translate documentation**

### 🎨 Design Contributions
Make the app more beautiful!

- **UI/UX improvements**
- **Mobile responsiveness**
- **Accessibility enhancements**
- **Icon and asset creation**
- **Color scheme improvements**

## 🗺️ Roadmap

### Version 1.1 (Current - Bug fixes & Improvements)
- [x] ✅ Basic anime discovery and search
- [x] ✅ User authentication system
- [x] ✅ Responsive design
- [x] ✅ H2 database persistence
- [ ] 🔄 Enhanced search filters
- [ ] 🔄 Improved error handling
- [ ] 🔄 Performance optimizations

### Version 2.0 (Personal Lists & Tracking)
- [ ] 📝 Personal anime lists (watching, completed, plan to watch, dropped)
- [ ] ⭐ Rating and review system
- [ ] 📊 User statistics and analytics dashboard
- [ ] 🔔 Notification system for new episodes
- [ ] 📱 Enhanced mobile experience
- [ ] 🎯 Anime recommendations based on user preferences

### Version 2.5 (Social Features)
- [ ] 👥 User profiles and social connections
- [ ] 💬 Comment system on anime pages
- [ ] 🏆 Achievement system and badges
- [ ] 📈 Community rankings and leaderboards
- [ ] 🔄 Activity feed for followed users
- [ ] 📢 Anime discussion forums

### Version 3.0 (Advanced Features)
- [ ] 🤖 AI-powered anime recommendations
- [ ] 📺 Integration with streaming platforms
- [ ] 🌐 Multi-language support (i18n)
- [ ] 📊 Advanced analytics and insights
- [ ] 🔍 Advanced search with filters
- [ ] 📱 Progressive Web App (PWA) features

### Version 4.0 (Enterprise Features)
- [ ] 🏢 Admin dashboard for content management
- [ ] 📈 Business analytics and reporting
- [ ] 🔒 Advanced security features
- [ ] ☁️ Cloud deployment and scaling
- [ ] 🔄 Real-time updates with WebSocket
- [ ] 🌍 CDN integration for global performance

### Long-term Vision
- [ ] 📱 Mobile app (React Native / Flutter)
- [ ] 🎮 Gamification elements
- [ ] 🛒 Merchandise integration
- [ ] 🎬 Video content integration
- [ ] 🤝 Partner integrations
- [ ] 🌟 Open source ecosystem

## 🆘 Support & Help

Need help getting started or running into issues? We're here to help!

### 📖 Documentation
- **[Getting Started Guide](docs/getting-started.md)** - Step-by-step setup
- **[API Documentation](docs/api.md)** - Complete API reference
- **[Deployment Guide](docs/deployment.md)** - Production deployment
- **[Troubleshooting](docs/troubleshooting.md)** - Common issues and solutions

### 💬 Community Support
- **GitHub Discussions** - [Ask questions and share ideas](https://github.com/yourusername/anime-discovery-app/discussions)
- **GitHub Issues** - [Report bugs and request features](https://github.com/yourusername/anime-discovery-app/issues)
- **Discord Server** - [Join our community chat](https://discord.gg/anime-app)
- **Stack Overflow** - Tag your questions with `anime-discovery-app`

### 📧 Contact Information
- **Email**: support@animeapp.dev
- **Twitter**: [@AnimeDiscoveryApp](https://twitter.com/animediscoveryapp)
- **LinkedIn**: [Project LinkedIn Page](https://linkedin.com/company/anime-discovery-app)

### 🐛 Bug Reporting
When reporting bugs, please include:
- **Environment details** (OS, Java version, browser)
- **Steps to reproduce** the issue
- **Expected behavior** vs actual behavior
- **Screenshots** or error logs
- **Configuration** details (if relevant)

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2025 Anime Discovery App

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

## 🙏 Acknowledgments

This project wouldn't be possible without these amazing resources and communities:

### 🌟 Core Technologies
- **[Spring Boot Team](https://spring.io/)** - For the incredible framework that makes Java development enjoyable
- **[Thymeleaf Team](https://www.thymeleaf.org/)** - For the powerful and elegant templating engine
- **[Bootstrap Team](https://getbootstrap.com/)** - For the responsive CSS framework
- **[H2 Database](http://h2database.com/)** - For the lightweight and developer-friendly database

### 🎌 Data Sources
- **[Jikan API](https://jikan.moe/)** - For providing free access to MyAnimeList data
- **[MyAnimeList](https://myanimelist.net/)** - For being the ultimate anime database and community
- **[Anime Community](https://reddit.com/r/anime)** - For inspiration and feedback

### 🛠️ Development Tools
- **[IntelliJ IDEA](https://www.jetbrains.com/idea/)** - The best IDE for Java development
- **[Maven](https://maven.apache.org/)** - For dependency management and build automation
- **[Git](https://git-scm.com/)** - For version control and collaboration
- **[GitHub](https://github.com/)** - For hosting and project management

### 🎨 Design & Assets
- **[FontAwesome](https://fontawesome.com/)** - For beautiful and comprehensive icons
- **[Unsplash](https://unsplash.com/)** - For high-quality placeholder images
- **[Google Fonts](https://fonts.google.com/)** - For typography that enhances readability

### 📚 Learning Resources
- **[Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)**
- **[Thymeleaf Documentation](https://www.thymeleaf.org/documentation.html)**
- **[Baeldung](https://www.baeldung.com/)** - For excellent Spring Boot tutorials
- **[Stack Overflow Community](https://stackoverflow.com/)** - For countless solutions and discussions

### 👨‍💻 Contributors
Special thanks to all the contributors who have helped make this project better:






### ❤️ Community Support
- All the beta testers who provided valuable feedback
- The anime community for inspiration and feature suggestions
- Open source maintainers who keep the ecosystem thriving
- Everyone who starred, forked, or shared this project



### 🌟 **Star this repo if you find it helpful!** 🌟

**Made with ❤️ for the anime community**

[⭐ Star on GitHub](https://github.com/yourusername/anime-discovery-app) -  
[🍴 Fork Project](https://github.com/yourusername/anime-discovery-app/fork) -  
[🐛 Report Bug](https://github.com/yourusername/anime-discovery-app/issues) -  
[💡 Request Feature](https://github.com/yourusername/anime-discovery-app/issues)

**Built by [Shreyansh Singh](https://github.com/shreyanshsinghks) -  Follow me on [Twitter](https://twitter.com/lloydashbourne) -  Connect on [LinkedIn](https://linkedin.com/in/shreyanshsinghks)**

[🔝 Back to Top](#-anime-discovery-app)

