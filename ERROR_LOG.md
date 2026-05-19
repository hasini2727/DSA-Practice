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