[
  {
    "ProfileName": "SecurityHeaders",
    "Name": "",
    "Enabled": false,
    "Scanner": 2,
    "Author": "@six2dez1",
    "Payloads": [],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,Cache-Control",
      "true,Or,X-Frame-Options",
      "true,Or,X-Content-Type-Options:nosniff",
      "true,Or,Strict-Transport-Security",
      "true,Or,X-XSS-Protection",
      "true,Or,Content-Security-Policy"
    ],
    "Tags": [
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": true,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": true,
    "IsContentType": true,
    "ContentType": "text/css,image/jpeg,image/png,image/svg+xml,image/gif,image/tiff,image/webp,image/x-icon,application/font-woff,image/vnd.microsoft.icon,font/ttf,font/woff2,application/javascript",
    "HttpResponseCode": "",
    "NegativeCT": true,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "MatchType": 1,
    "Scope": 1,
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 0,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Missing Security Headers",
    "IssueSeverity": "Low",
    "IssueConfidence": "Certain",
    "IssueDetail": "Missing security headers detected.",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false
  }
]