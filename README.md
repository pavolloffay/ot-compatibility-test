# OT API Compatibility 

* module1 is using 0.30.0
* module2 is using 0.31.0-RC3-SNAPSHOT with [this](https://github.com/opentracing/opentracing-java/pull/238 patch.

# Run

```bash
mvn clean install
cd module2
mvn exec:java -Dexec.mainClass="sk.loffay.ot.test.module2.Main"
```
