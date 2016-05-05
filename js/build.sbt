enablePlugins(ScalaJsMap)

libraryDependencies += "com.thoughtworks.binding" %%% "dom" % "5.4.0"

libraryDependencies += "com.lihaoyi" %%% "upickle" % "0.3.9"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

crossPaths := false

crossTarget in fullOptJS := baseDirectory.value

crossTarget in fastOptJS := baseDirectory.value
