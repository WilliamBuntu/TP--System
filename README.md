# Text-Processing-System

A robust Java application for advanced text processing, pattern analysis, and batch file operations with an intuitive JavaFX user interface.

## Features

### Regular Expression Processing
- **Pattern Searching**: Find all occurrences of patterns in text
- **Text Replacement**: Replace all or first occurrence of patterns
- **String Splitting**: Split text using regex patterns
- **Pattern Matching**: Check if an entire text matches a pattern
- **Regex Validation**: Verify regex syntax before execution

### Batch File Processing
- **Merge Files**: Combine multiple files with or without separators
- **Split Files**: Divide large text files into smaller parts
- **Find Matching Files**: Locate files using pattern matching
- **Batch Find & Replace**: Apply text transformations across multiple files
- **Pattern Extraction**: Extract matching content across files

### Data Analysis
- **Common Pattern Detection**: Identify emails, URLs, and other patterns
- **Text Statistics**: Calculate word counts, character frequencies, and more

## Screenshots

![Application Screenshot](docs/images/screenshot.png)

## Installation

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher

### Building from Source

1. Clone the repository: git clone https://github.com/yourusername/text-processing-system.git
2. Navigate to the project directory: cd text-processing-system
3. Build with Maven: mvn clean package
4. Run the application:  java -jar target/text-processing-system-1.0.jar
## Usage

### Regular Expression Panel
1. Enter or load text into the input area
2. Type your regular expression pattern
3. Choose an operation (Search, Replace, Split, etc.)
4. View results in the output area
5. Save results to a file if needed

### Batch Processing
1. Select files using the file browser
2. Choose a batch operation
3. Configure operation settings
4. Execute and monitor progress
5. View results and save output

## Development

### Project Structure
- `src/main/java/com/example/textprocessingsystem/` - Core application code
  - `controller/` - JavaFX controllers
  - `model/` - Data models and processing logic
  - `analysisPackage/` - Text analysis functionality
  - `regex/` - Regular expression processing
  - `util/` - Utility classes and helpers

### Adding New Features
1. Create new functionality in the appropriate package
2. Add UI components in FXML files
3. Create a controller or extend existing ones
4. Update the main application to integrate the new feature

## Testing

Run the test suite with: DataAlgorithmTest.java, RegexTest.java, and BatchProcessingTest.java



## License

This project is licensed under Buntu William property.

## Contributing

1. Fork the project
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request