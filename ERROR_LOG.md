# DSA Error Log
   Tracking bugs, logic slip-ups, and key takeaways here.

## Date: May 19, 2026
**Problem:** Two Sum

**Why I got stuck:** 
- Brain defaulted to nested loop
- Mixed up Keys and Values

**What I learned:** 
- Key = Data to find instantly (complement number: target - currentNum).
- Value = Data to retrieve (the index of that old number).
- Hash Map lets you look backward in O(1) 

**Pattern Missed:** Hash Map Lookback / Complement Search


## Date: May 20, 2026

**Problem:** Factorial of Number

**Why I got stuck:**
- Tracking recursive calls and returns.
- Understanding how values move through the call stack.

**What I learned:**
Base Case: n <= 1 stops recursion safely.
Recursive Step: Solve using n * fact(n - 1).
Recursive calls use stack memory for each function call.

**Pattern Used:** Direct Recursion


## Date: May 22, 2026

**Problem:** Binary Search

**Why I got stuck:**
- mid was not updating inside loop.
- Confused about return types and scope.

**What I learned:**
- Recalculate mid inside while.
- void methods cannot return values.

**Pattern Used:** Binary Search


## Date: May 24, 2026

**Problem:** Move Zeroes

**Why I got stuck:**
- Initially focused on moving zeros instead of placing non-zeros.
- Confused about swap vs direct placement logic.

**What I learned:**
- Use a write pointer to place non-zero elements in order.
- Remaining positions automatically become zero.

**Pattern Used:** Two Pointers (Stable Partition / In-place rearrangement)


## Date: May 25, 2026

**Problem:** Find Maximum of Three Numbers

**Why I got stuck:**
- Converted output directly to long, which removed decimal values.
- Assumed inputs would always be integers.

**What I learned:**
- Hidden test cases often include equal numbers and decimal values.
- Math.max() makes comparison logic cleaner and safer.

**Pattern Used:** Input Datatype Handling


## Date: May 26, 2026

**Problem:** Frequency Count of Array Elements

**Why I got stuck:**
- Repeatedly updated the HashMap without increasing the counter.
- Used nested loops even after introducing a HashMap.

**What I learned:**
- HashMap can update frequencies in a single traversal.
- containsKey() and get() help track existing counts efficiently.

**Pattern Used:** HashMap


## Date: May 30, 2026

**Problem:** Maximum Element in Array

**Why I got stuck:**
- Tried to return the answer directly from main() using int main(), not realizing Java require public static void main(String[] args).
- Initialized max with 0, which fails for arrays containing only negative numbers.
- Stored the entire array first and then used a second traversal before realizing the maximum can be tracked while reading input.

**What I learned:**
- main() is the program entry point and should print results or call methods that return values.
- When finding a maximum, initialize with the first element (or Integer.MIN_VALUE) to handle all valid inputs.

**Pattern Used:** Single-Pass Array Traversal


## Date: May 30, 2026

**Problem:** Second Largest Element in Array

**Why I got stuck:**

- First used sorting (O(n²)) instead of single pass.
- Missed the rule, when a new max appears, old max must become second max.

**What I learned:**

- Scanner.nextInt() works with spaces and newlines (whitespace separator).
- Each input number should be treated independently during comparison — no need to modify or rewrite stored values like nums[i].

**Pattern Used:** Single-Pass Tracking


## Date: June 7, 2026

**Problem:** Left Rotate Array

**Why I got stuck:**

- Focused on calculating positions while reading input.
- Assumed "memory smaller than input" means O(1) space.
- Did not understand the difference between input space and extra space.
- Struggled to understand how array rotation can be done without another array.

**What I learned:**

- Use k % n to handle large rotation counts.
- O(1) space means memory does not grow with input size.
- An array of size k is not O(1) if k can grow.
- Input size and extra space are measured separately.

**Pattern Used:** Array Rotation using Reversal Technique
