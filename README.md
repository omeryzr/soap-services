# SOAP Consumer on Spring Boot

     - WSDL (Web Services Description Language)
     - XSD (Xml Schema Definition)
     
### Dependencies
wsdl4j
    
    `<dependency>
         <groupId>wsdl4j</groupId>
         <artifactId>wsdl4j</artifactId>
     </dependency>`
    
jaxb2
    
    `<plugin>
     				<groupId>org.codehaus.mojo</groupId>
     				<artifactId>jaxb2-maven-plugin</artifactId>
     				<version>1.6</version>
     				<executions>
     					<execution>
     						<id>xjc</id>
     						<goals>
     							<goal>xjc</goal>
     						</goals>
     					</execution>
     				</executions>
     				<configuration>
     					<schemaDirectory>${project.basedir}/src/main/resources/</schemaDirectory>
     					<outputDirectory>${project.basedir}/src/main/java</outputDirectory>
     					<clearOutputDir>false</clearOutputDir>
     				</configuration>
     				<dependencies>
     					<dependency>
     						<groupId>javax.activation</groupId>
     						<artifactId>activation</artifactId>
     						<version>1.1.1</version>
     					</dependency>
     				</dependencies>
     			</plugin>`