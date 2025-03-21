[
  {
    "ProfileName": "OpenRedirect-ParameterPollution",
    "Name": "",
    "Enabled": false,
    "Scanner": 1,
    "Author": "@egarme",
    "Payloads": [
      "true,/{payload}",
      "true,?next\u003d{payload}",
      "true,?url\u003d{payload}",
      "true,?target\u003d{payload}",
      "true,?rurl\u003d{payload}",
      "true,?dest\u003d{payload}",
      "true,?destination\u003d{payload}",
      "true,?redir\u003d{payload}",
      "true,?redirect_uri\u003d{payload}",
      "true,?redirect\u003d{payload}",
      "true,/redirect/{payload}",
      "true,/cgi-bin/redirect.cgi?{payload}",
      "true,/out/{payload}",
      "true,/out?{payload}",
      "true,?view\u003d{payload}",
      "true,/login?to\u003d{payload}",
      "true,?image_url\u003d{payload}",
      "true,?go\u003d{payload}",
      "true,?return\u003d{payload}",
      "true,?returnTo\u003d{payload}",
      "true,?return_to\u003d{payload}",
      "true,?checkout_url\u003d{payload}",
      "true,?continue\u003d{payload}",
      "true,?return_path\u003d{payload}"
    ],
    "Encoder": [
      " "
    ],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,-Token1337-"
    ],
    "Tags": [
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
    "MaxRedir": 9,
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "OpenRedirect-ParameterPollution",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Certain",
    "IssueDetail": "Open Redirect with payload: \u003cbr\u003e\u003cpayload\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [
      {
        "type": "Payload",
        "match": "{payload}",
        "replace": "http://www.wagiro.com/test-open-redirect",
        "regex": "String"
      }
    ],
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