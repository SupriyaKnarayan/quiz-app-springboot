# Quiz App Spring Boot

This is a Spring Boot-based Quiz App with REST APIs for managing quizzes, questions, and results.

---

## How to Run the Application

### Prerequisites:
- Java 17 or later
- Maven
- IDE (IntelliJ IDEA, Eclipse) or GitHub Codespaces

### Steps:
1. Clone the repository:
   git clone https://github.com/YOUR_USERNAME/quiz-app-springboot.git
   cd quiz-app-springboot
2. Run the application using maven
   
   mvn spring-boot:run
   
4. Test the APIs using Postman or your browser:
### Endpoints:
     Start a new quiz session:
   
       POST /api/quiz/start

     Get a random question:
     
    GET /api/quiz/question/{sessionId}


   Submit an answer:
POST /api/quiz/submit?sessionId={sessionId}&questionId={questionId}&answer={answer}

View quiz results:
GET /api/quiz/results/{sessionId}


