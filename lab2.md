# Lab Report 2
---
* Part 1:
  - My Code: This code uses and is inspired by code written by others, specifically using Server.java and being inspired by NumberServer.java from [this repository](https://github.com/ucsd-cse15l-f23/wavelet).
    - ![Image](images/lab2images/Screen Shot 2024-01-30 at 7.27.51 PM.png)
  - Usage 1: `{User: jpolitz, Message: Hello}`
    - ![Image](images/lab2images/Screen Shot 2024-01-30 at 7.28.55 PM.png)
    - In this screenshot, the methods called are first the main method within our ChatServer class. In this method, we create a new Handler object which invokes the handleRequest method in our Handler class.
    - When this method is called, we create our `chatLog` String. Based off of the url Path, we ideally get the path  `/add-message` which then creates the String list `params`, which further splits the provided query by the &. From  `params`, we create `message` and `username`. Finally, we update `chatLog` with these variables along with adding a new line so the next messsage doesn't appear on the same line. Finally, our method returns `chatLog `. 
  - Usage 2: `{User: skamuju, Message: Hello Professor}`
    - ![Image](images/lab2images/Screen Shot 2024-01-30 at 7.29.37 PM.png)
    - In this method, we use the existing Handler object which invokes the handleRequest method in our Handler class.
    - This method then uses the existing `chatLog` String. Based off of the url Path, we get `/add-message` which then once again creates the String list `params`, which further splits the provided query by the &. From  `params`, we create `message` and `username`. We then update  the existing `chatLog` String which already has our previous usage with these variables along with adding a new line so the next messsage doesn't appear on the same line. Finally, our method once again returns `chatLog `. 
