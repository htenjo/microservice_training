# Microservices Basic Training 03

### What are we going to do?
In this step we are going to configure 4 tools in our project to help us improving the quality of our product.

#### [PMD](https://pmd.github.io/)

- Include the maven plugin (default rule set is enough for now). Java 13 is not supported right now, so we need to change the maven compiler to Java 12.
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

#### [Spotbugs](https://spotbugs.readthedocs.io/) (The new findbugs)
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

#### [JaCoCo](https://www.eclemma.org/jacoco/) (JUnit coverage)
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

#### [Checkstyle](https://pmd.github.io/)

