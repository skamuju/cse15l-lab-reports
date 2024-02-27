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
  - non-failure inducing input for the 'reversed()' method from `ArrayExamples`:
  -  `@Test
  public void testReversedEmpty() {
    int[] input = new int[]{};
    assertArrayEquals(input, ArrayExamples.reversed(input));
    }`
  - Symptom:
  - ![Image]()
  - Bug Before:
  - ![Image]()
  - Bug After (Fixed):
  - ![Image]()
