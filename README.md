Spring Demo\
Docker instruction:
1. docker build -t myspringdemo .
2. docker run -d -p8080:8080 myspringdemo
3. routing:\
   h2-console: http://localhost:8080/h2-console \
   get all users: http://localhost:8080/getAllUsers \
   add new user: http://localhost:8080/addNewUser \
   delete user by id: http://localhost:8080/deleteUser/{id} \
   update user email by id: http://localhost:8080/updateEmail/{id}