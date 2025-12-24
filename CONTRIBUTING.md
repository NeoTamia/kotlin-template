# Contributing to Kotlin Template

First off, thank you for considering contributing to Kotlin Template! It's people like you who make this project better for everyone.

## How to Contribute

There are many ways to contribute to the project:
- Reporting bugs
- Suggesting new features
- Improving documentation
- Writing code to fix bugs or implement features

## Branch Flow (Git Flow)

We follow a simplified Git Flow model:

1.  **Main Branch (`main`):** This branch contains the latest stable release of the project.
2.  **Development Branch (`dev`):** This is the main branch for development. All new features and bug fixes should be merged into this branch.
3.  **Feature/Bugfix Branches:** For any change, create a new branch from `develop`.
    - Use naming conventions like `feature/your-feature-name` or `bugfix/your-bugfix-name`.

## Pull Requests and Issues

### Opening an Issue

Before opening a new issue, please search existing issues to see if it has already been reported. When opening an issue, provide as much detail as possible, including:
- A clear and descriptive title
- Steps to reproduce (for bugs)
- Expected and actual behavior
- Screenshots (if applicable)

### Submitting a Pull Request

1.  Fork the repository and create your branch from `develop`.
2.  Ensure your code follows the [Code Style](#code-style) guidelines.
3.  Write tests for your changes (see [Testing](#testing)).
4.  Commit your changes with clear and descriptive commit messages.
5.  Push your branch to your fork.
6.  Open a Pull Request against the `develop` branch of the main repository.
7.  Provide a clear description of the changes in your PR.

## Testing

We believe in the importance of testing. **For every new feature or bugfix, you must include corresponding tests.**

- Ensure all existing tests pass before submitting your PR.
- Run tests using Gradle:
  ```bash
  ./gradlew test
  ```

## Code Style

To maintain a consistent codebase, we follow these standards:

- **Kotlin Official Convention:** We adhere to the [official Kotlin coding conventions](https://kotlinlang.org/docs/coding-conventions.html).
- **ktlint:** We use [ktlint](https://pinterest.github.io/ktlint/) for code formatting and linting.

### Checking and Formatting Code

You can check and format your code using the following Gradle tasks:

- **Check formatting:**
  ```bash
  ./gradlew ktlintCheck
  ```
- **Apply formatting:**
  ```bash
  ./gradlew ktlintFormat
  ```

Your PR will not be merged if it does not pass the `ktlintCheck`.

---

By contributing, you agree that your contributions will be licensed under the project's [LICENSE](LICENSE).
