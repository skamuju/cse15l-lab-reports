# Lab Report 3
---
* Part 1:
  - failure inducing input for the `reversed()` method from `ArrayExamples`:
  - `@Test
  public void testReversedFull() {
    int[] input = new int[]{1,2,3};
    int[] revInput = new int[]{3,2,1};
    assertArrayEquals(revInput, ArrayExamples.reversed(input));
    }`
  - non-failure inducing input for the `reversed()` method from `ArrayExamples`:
  - `@Test
    public void testReversedEmpty() {
    int[] input = new int[]{};
    assertArrayEquals(input, ArrayExamples.reversed(input));
    }`
  - Symptom:
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 12.02.11 PM.png)
  - Bug Before:
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 12.13.21 PM.png)
  - Bug After (Fixed):
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 12.14.29 PM.png)
  - The problem with this code originally was that instead of properly updating `newArr` with the corresponding elements from our input `arr`, it would try and update `arr`'s elements with nonexistend elements from `newArr`, and finally try to return `arr`.
  - To fix this code, all I had to do was ensure the `newArr` was being updated with the proper elements from the input, `arr`, and update the return statement so that `newArr` was being returned.
* Part 2:
  - For this part of the lab report, I chose to focus on the `find` command
  - I started by presenting this query to ChatGPT, which provided the following response:
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 9.33.09 PM.png)
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 9.33.30 PM.png)
  - Using `find` to search for files by name:
  - Example 1:
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 9.01.47 PM.png)
  - Example 2:
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 9.02.22 PM.png)
  - Using `find` search for files by type:
  - Example 1:
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 9.04.10 PM.png)
  - Example 2:
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 9.05.13 PM.png)
  - Using `find` to execute commands on the found files:
  - Example 1:
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 9.09.16 PM.png)
  - Example 2:
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 9.09.40 PM.png)
  - Using `find` to search for files by size:
  - Example 1:
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 9.13.25 PM.png)
  - Example 2:
  - ![Image](images/lab3images/Screen Shot 2024-02-27 at 9.13.40 PM.png)
* Summary of ChatGPT usage:
  - In this Lab Report I used ChatGPT to help search for information and understand commands that I talked about and used in this report. Although ChatGPT presented me with the different ways to use the `find` command, I still went through and experimented with each command on the `./technical` directory, and I edited the command syntax to fit what I wanted to show in this report and how it could be used in the files within my working directory.
