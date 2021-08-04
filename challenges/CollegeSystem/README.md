# College System

Design a system in which different users can interact with in order to 

- create classes 
- add students to classes
- add grade to students 
- generate relatorios of classes, students and grades
  
Regarding these tasks, only specific users may perform specific tasks. For example, a `teacher` cannot create a new class, an `attendant` cannot assign grades to a student, and a `teacher` cannot grade students from other classes.

Below is a list of all users and their responsabilities:

#### Admin
- create users and assign roles to them

#### Coordinator
- create classes
- assign teachers to classes
- assign students to classes
- generate a relatory with all classes, showing exactly:
  -  their given teachers, 
  -  student list separated by approved and failed students

#### Attendant
- assign students to classes
- assign teachers to classes 
- generate a relatory with all classes, showing exactly:
  -  their given teachers, 
  -  student list separated by approved and failed students
  
#### Teacher

- add grades to students in the same class he/she is assigned to
- generate a relatory with his/her classes, showing exactly:
  -  student list separated by approved and failed students

#### Student
- sees his/her grades
- check the medium
