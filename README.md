# UserProfileService

A simple Spring Boot REST API that manages user profiles. This project is designed as a testbed to evaluate AI-powered documentation tools like **Code2Confluence**, which automatically generate technical documentation based on code and configuration changes.

---

## 🚀 Features

- Add a user
- Get user by ID
- Get all users

---

## 📂 Endpoints

### ➕ Add User

`POST /users`

**Request Body:**
```json
{
  "id": "u1",
  "name": "John Doe",
  "email": "john@example.com",
  "country": "USA"
}
