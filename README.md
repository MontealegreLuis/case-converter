# Service buses

[![CI workflow](https://github.com/montealegreluis/case-converter/actions/workflows/ci.yml/badge.svg)](https://github.com/montealegreluis/case-converter/actions/workflows/ci.yml)
[![Release workflow](https://github.com/montealegreluis/case-converter/actions/workflows/release.yml/badge.svg)](https://github.com/montealegreluis/services-buses/actions/workflows/release.yml)
[![semantic-release: conventional-commits](https://img.shields.io/badge/semantic--release-conventionalcommits-e10079?logo=semantic-release)](https://github.com/semantic-release/semantic-release)


Utility class to change between different naming conventions.

## Usage

```java
import static com.montealegreluis.caseconverter.CaseConverter.camelCaseToKebabCase;
import static com.montealegreluis.caseconverter.CaseConverter.camelCaseToSentence;

public class Application {
  public static void main(String[] args) {
    System.out.println(camelCaseToKebabCase("ParseXMLDocument")); // parse-xml-document
    System.out.println(camelCaseToSentence("PurchaseTickets")); // Purchase tickets
  }
}
```

## Installation

1. [Authenticating to GitHub Packages](https://github.com/MontealegreLuis/case-converter/blob/main/docs/installation/authentication.md)
2. [Maven](https://github.com/MontealegreLuis/case-converter/blob/main/docs/installation/maven.md)
3. [Gradle](https://github.com/MontealegreLuis/case-converter/blob/main/docs/installation/gradle.md)

## Contribute

Please refer to our [contribution guidelines](https://github.com/MontealegreLuis/case-converter/blob/main/CONTRIBUTING.md) for more details on how to contribute to this project.

## License

Released under the [BSD-3-Clause](https://github.com/MontealegreLuis/case-converter/blob/main/LICENSE).
