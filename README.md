## Java Generics Assignment – 90-Minute Challenge
> You’ve got 90 minutes to complete a hands-on assignment called EasyStorageTracker, where you'll build a real-life inspired storage system using Java Generics.

### What you’ll practice:
- Generic classes, methods, and wildcards 
- Bounded type parameters (with a Perishable class!)
- Writing a utility class for reusability 
- GitHub fundamentals: repos, commits, and project structure 

### Instructions:
1. Open the assignment [doc](https://github.com/FW-Zalando-Java-Backend-Engineer/EasyStorageTracker) 
2. Follow the tasks step by step (main + extra tasks included)
3. Submit your GitHub repo link here in Slack  when done

> Time limit: 90 minutes
---

# 🚚 EasyStorageTracker – Java Generics Assignment

Welcome to the **EasyStorageTracker** — a hands-on Java project that teaches you how to work with **Generics**, **wildcards**, **bounded types**, and **GitHub workflows** while modeling a real-world storage system. This one’s easy, useful, and kind of fun too. 🎉

---

## 🎯 Objective

You’re building a smart storage tracking system for a fictional delivery company. The company needs flexible, type-safe storage for everything — from books to gadgets, and even snacks.

---

## ✅ Learning Outcomes

This project will help you practice:

- 📦 Generic Classes
- 🧠 Generic Methods
- 🧃 Bounded Type Parameters (`<T extends Perishable>`)
- 🎯 Wildcards (`List<? extends Object>`)
- 🧰 Java Utility Classes
- 💡 Clean Java project structure
- 🌐 GitHub version control & documentation

---

## 🚀 Assignment Requirements

### 🔹 Task 1: Create Your GitHub Repo (5 points)
- Create a **new public GitHub repo**: `EasyStorageTracker-YourName`
- Add a basic `README.md` explaining your project (2–3 lines)
- Upload your Java code, structured as outlined below
- Push at least **3 commits**:
    1. Initial structure
    2. Generic classes + test code
    3. Utility methods and extras

---

### 🔹 Task 2: Build the Storage System (20 points)

#### ✅ Create `StorageUnit<T>` (Generic Class)
- Can store any object of type T
- Methods:
    - `void addItem(T item)`
    - `T getItem()`

#### ✅ Create a `Perishable` class (for food items, milk, etc.)
- Includes a field like `expirationDate` or `isExpired()`
- Will be used in a **bounded generic method**

#### ✅ Create at least 3 item classes:
- `Book`, `Device`, and `Snack` (your own properties + constructor)

#### ✅ Create a main class (`TrackerDemo`) to:
- Store different types in their respective `StorageUnit<T>`
- Use at least one **generic method** and one **wildcard method**

---

### 🔹 Task 3: Create a Utility Class (20 points)

Create a `StorageUtils` class with the following:

#### 📌 Wildcard Method:
```java
public static void printItems(List<? extends Object> items)
```

#### 📌 Generic Method:
```java
public static <T> void displayItem(T item)
```

#### 📌 Bounded Type Method:
```java
public static <T extends Perishable> void checkPerishable(T item)
```

- Use `instanceof`, simple `System.out.println()` checks, etc.

---

## 💡 Bonus / Extra Tasks (Optional – up to 10 points)

### 🔸 Extra Task 1: Create a `StorageManager<T>` that stores **multiple** items in a list (instead of one item).

### 🔸 Extra Task 2: Make your `StorageUnit<T>` class **implement a generic interface** (e.g., `Storable<T>` with `save()` and `load()` methods).

### 🔸 Extra Task 3: Create a **JSON-style output** for each item (mock serialization, no libraries needed).

### 🔸 Extra Task 4: Include **Javadoc comments** in all your classes and methods.

---

## 🗂️ Suggested Project Structure

```
EasyStorageTracker/
├── src/
│   ├── model/
│   │   ├── Book.java
│   │   ├── Device.java
│   │   ├── Snack.java
│   │   ├── Perishable.java
│   ├── storage/
│   │   ├── StorageUnit.java
│   │   ├── StorageUtils.java
│   └── main/
│       └── TrackerDemo.java
├── README.md
```

---

## 📤 Submission

- Submit your GitHub repo link via your LMS or class portal.
- Make sure the repo is public and has a clear `README.md`.

---

## 🧠 Tip for Success

Don’t overthink it. Focus on:

- Clear and working generic structures
- Clean project layout
- Using GitHub correctly
- Trying the extra tasks if you’re feeling confident!
