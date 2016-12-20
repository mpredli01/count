
## Introducing Gradle Build Scans

### InfoQ Java Queue

#### published December 23, 2016

This example application demonstrates the new Gradle Cloud Service, [Build Scans](https://blog.gradle.org/introducing-build-scans). 

The application can be built and run with [Gradle 3.0](https://gradle.org/) by executing one of the following commands:

`gradle compileJava && gradle build -Dscan`
`gradle compileJava && gradle test -Dscan`

The resulting [build scan](https://scans.gradle.com/s/3nmtgnbjn4oec) will be demonstrate a successful build. Change the test in `TestCountApp.java`, re-execute one of the commands above, and the resulting [build scan](https://scans.gradle.com/s/fdux3dbjfawum) will demonstrate a failed build. 

Please don't hesitate to contact me at [mike@redlich.net](mailto:mike@redlich.net) for any questions.
