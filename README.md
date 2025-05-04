# PlagiarismCheckerCLI

PlagiarismCheckerCLI is a command-line application written in Java that compares two text files and calculates their similarity using cosine similarity. This tool is useful for detecting plagiarism or finding similarity in text documents.

## Features
- Compares two text files to calculate a similarity percentage.
- Uses cosine similarity for the comparison.
- Handles file reading and input validation.
- Command-line interface for simplicity.

## Prerequisites
- Java Development Kit (JDK) version 11 or later.
- Git (if cloning the repository).

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/reaperggs/PlagiarismCheckerCLI.git
   cd PlagiarismCheckerCLI
   ```

2. Compile the source code:
   ```bash
   javac -d out src/**/*.java
   ```

3. Run the application:
   ```bash
   java -cp out services.FileReader
   ```

## Usage
1. Place the two text files you want to compare (e.g., `file1.txt` and `file2.txt`) in the project directory.
2. Run the program, passing the file paths as arguments.

Example:
```bash
java -cp out services.FileReader file1.txt file2.txt
```

### Example Output:
If `file1.txt` contains:
```
This is a sample file.
```
And `file2.txt` contains:
```
This is another sample file.
```
The program will output:
```
Similarity: 75.00%
```

## Project Structure

```
PlagiarismCheckerCLI/
├── src/
│   ├── services/
│   │   └── FileReader.java
├── file1.txt
├── file2.txt
├── README.md
└── LICENSE
```

## Contributing
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch: `git checkout -b feature-name`.
3. Commit your changes: `git commit -m "Add feature-name"`.
4. Push the branch: `git push origin feature-name`.
5. Open a pull request.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

---

Happy coding!
