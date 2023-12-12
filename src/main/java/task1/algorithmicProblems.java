package task1;

public class algorithmicProblems {

  public int[] programToFindCommonElementsBetweenTwoArraysOfIntegers(int[] array1, int[] array2) {

    if (array1 == null || array2 == null) {
      throw new IllegalArgumentException("Массив не может быть null.");
    }

    int[] arrayOfSimilarElements = new int[array1.length];
    int currentIndex = 0;

    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array2.length; j++) {
        if (array1[i] == array2[j]) {

          boolean isDuplicate = false;
          for (int k = 0; k < currentIndex; k++) {
            if (array1[i] == arrayOfSimilarElements[k]) {
              isDuplicate = true;
              break;
            }
          }

          if (!isDuplicate) {
            arrayOfSimilarElements[currentIndex] = array1[i];
            currentIndex++;
          }

        }
      }
    }
    return arrayOfSimilarElements;
  }

  public int[] programToRemoveDuplicateElementsFromAnArray(int[] array) {

    if (array == null) {
      throw new IllegalArgumentException("Массив не может быть null.");
    }

    int numberOfCoincidences = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[i] == array[j]) {
          numberOfCoincidences++;
          for (int k = j; k < array.length; k++) {
            array[j] = array[k];
          }
        }
      }
    }

    int[] newArray = new int[array.length - numberOfCoincidences];

    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = array[i];
    }

    return newArray;
  }

  public int programToFindTheSecondLargestElementInAnArray(int[] array) {

    if (array == null) {
      throw new IllegalArgumentException("Массив не может быть null.");
    }

    int largestElementOfTheArray = array[0];
    for (int i = 1; i < array.length; i++) {
      if (largestElementOfTheArray < array[i]) {
        largestElementOfTheArray = array[i];
      }
    }

    int secondLargestArrayElement = array[0];
    for (int i = 1; i < array.length; i++) {
      if (secondLargestArrayElement < array[i] && largestElementOfTheArray > array[i]) {
        secondLargestArrayElement = array[i];
      }
    }

    return secondLargestArrayElement;
  }

  public int programToFindTheSecondSmallestElementInAnArray(int[] array) {

    if (array == null) {
      throw new IllegalArgumentException("Массив не может быть null.");
    }

    int smallestArrayElement = array[0];
    for (int i = 1; i < array.length; i++) {
      if (smallestArrayElement > array[i]) {
        smallestArrayElement = array[i];
      }
    }

    int secondSmallestArrayElement = array[0];
    for (int i = 1; i < array.length; i++) {
      if (secondSmallestArrayElement > array[i] && smallestArrayElement < array[i]) {
        secondSmallestArrayElement = array[i];
      }
    }

    return secondSmallestArrayElement;
  }

}
