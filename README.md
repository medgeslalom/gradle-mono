# Gradle MultiProject Example

## Features

* Code Generation from an OpenAPI spec
* Code formatting with Spotless
* SpotBugs integration at build time
* Lombok for boilerplate reduction

## Generating Code from OpenAPI

Place your OpenAPI YAML files in an `apis/` directory within the subproject they belong to.
Then, from the service's directory, run: `gradle genApis`

### Custom Templates

The Mustache templates used to customize generation can be found here: https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources/JavaSpring (if using the spring generator).

Copy the mustache file you wish to alter into the `generator-templates/` top-level folder and make your edits. Regenerate
the code. You should now see your edits.

## Spring Boot DevServer

From the service's directory, run: `gradle bootRun`

## Building deployable JAR

From the service's directory, run: `gradle build`

## MultiProjects FAQ

* Q: How do I add a new service?
    * A: Add an `include: 'projectNameHere'` to `settings.gradle`, then create the service project folder. All existing configuration will be automatically applied. Add your own build.gradle for additional custom configuration
* Q: How to I build a specific project?
    * A: Change directory to that service and run `gradle build`
    * OR: Run `gradle :projectNameHere:build`
* Q: How to I build all projects at once?
    * A: Currently not supported. Requires custom task
