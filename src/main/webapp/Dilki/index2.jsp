<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home - SIMS College</title>
    <link rel="stylesheet" href="../css/Astyles.css">
</head>
<body>
    <!-- Header Section -->
    <header>
        <h2>SIMS College Dashboard</h2>
        <nav>
        <a href="index.jsp">Logout</a>
        <form action="../ProfileServlet" method="POST"class ="button">
        <input type="submit" value="Profile">
        </form>
        </nav>
    </header>
    <nav>
        <a href="#">Library</a>
        <a href="index.jsp">Timetables</a>
        <a href="courses.jsp">Courses</a>
        
    </nav>
    
    
    <div class="content">
       <p>
            <strong>Introduction:</strong> <br><br>
            SIMS College is an online platform designed to enhance the management of student information and academic activities. 
            It provides a comprehensive suite of features for users to manage educational processes efficiently. 
            Students can register on the platform, update their profiles, browse and enroll in courses, access course materials, submit assignments, 
            view grades, track academic progress, and download past papers. Teachers can create and manage courses, upload materials, grade assignments, 
            schedule classes, and communicate with students through announcements and discussions.
            <br><br>
            SIMS College aims to simplify the management of educational activities, providing a better learning experience for students.
        </p>

        <img src="../images/img.jpeg" alt="SIMS College Image">
    </div>
    
    <!-- Footer Section -->
    <footer>
        <p>&copy; 2024 SIMS System. All rights reserved. We are Y2S1 SE/OOP/WD/MLB/G7 students</p>
    </footer>
</body>
</html>
