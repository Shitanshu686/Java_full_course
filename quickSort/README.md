# Quick Sort

## 📌 Description
Quick Sort is a Divide and Conquer sorting algorithm. It selects a pivot element and partitions the array into two parts:
- Elements smaller than the pivot
- Elements greater than the pivot

It then recursively sorts both parts.

---

## 📖 Algorithm
1. Select the last element as the pivot.
2. Partition the array.
3. Place the pivot in its correct position.
4. Recursively sort the left subarray.
5. Recursively sort the right subarray.

---

## ⏱️ Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n log n) |
| Average | O(n log n) |
| Worst | O(n²) |

---

## 💾 Space Complexity

O(log n)

---

## ☕ Language

Java

---

## 📂 Files

- QuickSort.java

## 📝 Notes

- Uses Divide and Conquer.
- In-place sorting algorithm.
- Not Stable.
