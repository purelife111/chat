set CLASSPATH=mysql-connector-java-5.1.37.jar;mapper-3.3.0.jar;mybatis-generator-core-1.3.2.jar
set mainClassName=org.mybatis.generator.api.ShellRunner

java -classpath "%CLASSPATH%" "%mainClassName%" -configfile generatorConfig_demo.xml -overwrite
pause