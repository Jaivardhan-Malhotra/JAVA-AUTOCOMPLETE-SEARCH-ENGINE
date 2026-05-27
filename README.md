# AUTOCOMPLETE SEARCH ENGINE

A Trie-based Autocomplete Search Engine built using Java.  
This project provides fast prefix searching, autocomplete suggestions, frequency-based ranking, and recent search tracking through a CLI (Command Line Interface).

---

# FEATURES

- Insert words into search engine
- Prefix searching
- Trie-based autocomplete suggestions
- Frequency-based ranking system
- Dynamic suggestion updates
- Recent searches history
- Interactive CLI menu system

---

# TECHNOLOGIES USED

- Java
- Trie Data Structure
- DFS Traversal
- ArrayList
- Collections.sort()
- Scanner (CLI Input)

---

# PROJECT STRUCTURE

```text
project/
│
├── TrieNode.java
├── Trie.java
├── Suggestion.java
└── Main.java
```

---

# HOW IT WORKS

## 1. Insert Word

Stores words inside the Trie.

Example:
```text
apple
apply
application
```

---

## 2. Prefix Search

Checks whether a prefix exists in the Trie.

Example:
```text
app → Found
xyz → Not Found
```

---

## 3. Autocomplete Suggestions

Returns all words starting with a given prefix using DFS traversal.

Example:
```text
Input:
app

Output:
apple
apply
application
appstore
```

---

## 4. Frequency Ranking

Whenever a user selects a word, its frequency increases.

Frequently selected words appear at the top.

Example:
```text
apple → 10
apply → 3
appstore → 1
```

Suggestions become:
```text
apple
apply
appstore
```

---

## 5. Recent Searches

Stores recently searched/selected words.

Example:
```text
Recent Searches:
apple
amazon
apply
```

---

# MENU OPTIONS

```text
1. Insert Word
2. Search Prefix
3. Show Suggestions
4. Show Recent Searches
5. Exit
```

---

# DSA CONCEPTS USED

- Trie
- DFS (Depth First Search)
- Recursion
- Sorting
- Arrays
- ArrayList

---

# TIME COMPLEXITY

## Insert Word
```text
O(L)
```

## Prefix Search
```text
O(L)
```

## Get Suggestions
```text
O(N)
```

Where:
- `L` = length of word
- `N` = number of nodes traversed

---

# SAMPLE OUTPUT

```text
Enter prefix:
app

Suggestions:
apple 10
apply 3
appstore 1
```

---

# FUTURE IMPROVEMENTS

- GUI version
- Web-based search engine
- Top 5 suggestions only
- Delete word feature
- Duplicate prevention
- Uppercase/lowercase handling
- Database integration

---

# AUTHOR

Jaivardhan Malhotra

---

# LEARNING OUTCOMES

Through this project, I learned:
- Trie implementation
- Prefix searching
- DFS traversal
- Frequency-based ranking
- Java Collections Framework
- Building CLI-based applications
- Structuring Java projects professionally

