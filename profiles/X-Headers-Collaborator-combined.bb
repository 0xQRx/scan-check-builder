[
  {
    "ProfileName": "X-Headers-Collaborator-combined",
    "Name": "",
    "Enabled": false,
    "Scanner": 1,
    "Author": "@Sy3Omda",
    "Payloads": [
      "true,http://{BC}"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [],
    "Tags": [
      "Collaborator",
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
    "MatchType": 0,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "X-Headers-Collaborator-combined",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Firm",
    "IssueDetail": "X-Headers-Collaborator-combined",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [
      {
        "type": "Request",
        "match": "X-Forwarded-For:.*",
        "replace": "X-Forwarded-For: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "X-Host:.*",
        "replace": "X-Host: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "X-Forwarded-Server:*",
        "replace": "X-Forwarded-Server: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "X-Forwarded-Scheme:.*",
        "replace": "X-Forwarded-Scheme: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "X-Original-URL:.*",
        "replace": "X-Original-URL: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "X-Rewrite-URL:.*",
        "replace": "X-Rewrite-URL: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "Forwarded: for\u003d.*",
        "replace": "Forwarded: for\u003d {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "Origin:.*",
        "replace": "Origin: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "Referer:.*",
        "replace": "Referer: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "X-Forwarded-Host:.*",
        "replace": "X-Forwarded-Host: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "X-Forwarded-Proto:.*",
        "replace": "X-Forwarded-Proto: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "X-ProxyUser-Ip:.*",
        "replace": "X-ProxyUser-Ip: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "X-Wap-Profile:.*",
        "replace": "X-Wap-Profile: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "Client-IP:.*",
        "replace": "Client-IP: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "True-Client-IP:.*",
        "replace": "True-Client-IP: {PAYLOAD}",
        "regex": "Regex"
      },
      {
        "type": "Request",
        "match": "Cluster-Client-IP:.*",
        "replace": "Cluster-Client-IP: {PAYLOAD}",
        "regex": "Regex"
      }
    ],
    "VariationAttributes": [],
    "InsertionPointType": [
      32
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false
  }
]