# Microservices Basic Training - Code standards

## What are we going to do?
We are going to configure 4 tools in our project to help us improving the quality of our product:
- Include following maven plugins in the `pom.xml` file (Java 13 is not supported for some of them right now, so we need to change the maven compiler to Java 12).

### [PMD](https://pmd.github.io/)
```
<project>
  ...
  <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-pmd-plugin</artifactId>
      <version>${pmd.version}</version>
      <configuration>
          <linkXRef>true</linkXRef>
          <sourceEncoding>UTF-8</sourceEncoding>
          <targetJdk>${java.version}</targetJdk>
      </configuration>
      <executions>
          <execution>
              <phase>validate</phase>
              <goals>
                  <goal>check</goal>
                  <goal>cpd-check</goal>
              </goals>
          </execution>
      </executions>
  </plugin>
  ...
</project>
``` 

### [Spotbugs](https://spotbugs.readthedocs.io/) (The new findbugs)
```
<plugin>
    <groupId>com.github.spotbugs</groupId>
    <artifactId>spotbugs-maven-plugin</artifactId>
    <version>${spotbugs.version}</version>
    <executions>
        <execution>
            <phase>validate</phase>
            <goals>
                <goal>check</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

### [JaCoCo](https://www.eclemma.org/jacoco/) (JUnit coverage)
```
<plugin>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>${jacoco.version}</version>
    <executions>
        <execution>
            <goals>
                <goal>prepare-agent</goal>
            </goals>
        </execution>
        <execution>
            <id>jacoco-check</id>
            <phase>prepare-package</phase>
            <goals>
                <goal>check</goal>
            </goals>
            <configuration>
                <rules>
                    <rule>
                        <element>BUNDLE</element>
                        <limits>
                            <limit>
                                <counter>INSTRUCTION</counter>
                                <value>COVEREDRATIO</value>
                                <minimum>0.97</minimum>
                            </limit>
                        </limits>
                    </rule>
                </rules>
            </configuration>
        </execution>
        <execution>
            <id>report</id>
            <phase>prepare-package</phase>
            <goals>
                <goal>report</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

### [Checkstyle](https://maven.apache.org/plugins/maven-checkstyle-plugin/)
The `maven-checkstyle-plugin` provide two rule sets by defaul (Sun style and Goole style checks) but usually you preffer to define your own rules, for this case I created a custome file on [config/ms_checkstyle.xml](mstraining/config/ms_checkstyle.xml) you can use.

```
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-checkstyle-plugin</artifactId>
    <version>${checkstyle.version}</version>
    <configuration>
        <configLocation>config/ms_checkstyle.xml</configLocation>
        <consoleOutput>true</consoleOutput>
        <failsOnError>true</failsOnError>
        <linkXRef>false</linkXRef>
        <failOnViolation>true</failOnViolation>
        <includeTestSourceDirectory>true</includeTestSourceDirectory>
        <sourceDirectories>${project.basedir}/src/main/java</sourceDirectories>
        <testSourceDirectories>${project.basedir}/src/test/java</testSourceDirectories>
        <outputFile>${project.basedir}/target/checkstyle-output.xml</outputFile>
        <violationSeverity>warning</violationSeverity>
    </configuration>
    <executions>
        <execution>
            <phase>validate</phase>
            <goals>
                <goal>check</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

## How to continue?
Congratulation, now you have a template project ready to be used in all your future microservices. This will help you: 
- To Speed up your development process.
- To use the same rules across all teams to verify code quality.
- To keep the focus on the business requirement you need to solve instead of losing time in configurations.

Now you can go to [04_passenger_management](../04_passenger_management) and start to develop your first microservice.