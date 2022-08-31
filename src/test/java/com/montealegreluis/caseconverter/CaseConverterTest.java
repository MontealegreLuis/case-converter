package com.montealegreluis.caseconverter;

import static com.montealegreluis.caseconverter.CaseConverter.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class CaseConverterTest {
  @Test
  void it_converts_from_camel_case_to_kebab_case() {
    assertEquals("upload-png-file", camelCaseToKebabCase("UploadPngFile"));
    assertEquals("custom-xml-parser", camelCaseToKebabCase("CustomXMLParser"));
  }

  @Test
  void it_converts_camel_case_to_sentence() {
    assertEquals("Update avatar image", camelCaseToSentence("UpdateAvatarImage"));
    assertEquals("Convert to xml", camelCaseToSentence("ConvertToXML"));
  }
}
